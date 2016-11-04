package repo

import javax.inject.{ Inject, Singleton }
import models.Usuario
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future
import java.util.Date

@Singleton()
class UsuarioRepository @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends UsuarioTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insert(usuario: Usuario): Future[Int] = db.run { usuTableQueryInc += usuario }

  def insertAll(usuarios: List[Usuario]): Future[Seq[Int]] = db.run { usuTableQueryInc ++= usuarios }

  def update(usuario: Usuario): Future[Int] = db.run { usuTableQuery.filter(_.id === usuario.id).update(usuario) }

  def delete(id: Int): Future[Int] = db.run { usuTableQuery.filter(_.id === id).delete }

  def getAll(): Future[List[Usuario]] = db.run { usuTableQuery.to[List].result }

  def getById(usuId: Int): Future[Option[Usuario]] = db.run { usuTableQuery.filter(_.id === usuId).result.headOption }
  
  def ddl = usuTableQuery.schema

}

private[repo] trait UsuarioTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[UsuarioTable] class UsuarioTable(tag: Tag) extends Table[Usuario](tag, "usuario") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val nombre: Rep[String] = column[String]("nombre", O.SqlType("VARCHAR(30)"))
    val apellidos: Rep[String] = column[String]("apellidos", O.SqlType("VARCHAR(30)"))
    val email: Rep[String] = column[String]("email", O.SqlType("VARCHAR(50)"))
    val password: Rep[String] = column[String]("password", O.SqlType("VARCHAR(50)"))
    def emailUnique = index("email_unique_key", email, unique = true)
    def * = (nombre, apellidos, email, password, id.?) <> (Usuario.tupled, Usuario.unapply)
  }

  lazy protected val usuTableQuery = TableQuery[UsuarioTable]

  lazy protected val usuTableQueryInc = usuTableQuery returning usuTableQuery.map(_.id)

}

