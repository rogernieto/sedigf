package repo

import javax.inject.{ Inject, Singleton }
import models.Edan
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile
import scala.concurrent.Future
import java.util.Date

@Singleton()
class EdanRepository @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends EdanTable with HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  def insert(edan: Edan): Future[Int] = db.run { edTableQueryInc += edan }

  def insertAll(edans: List[Edan]): Future[Seq[Int]] = db.run { edTableQueryInc ++= edans }

  def update(edan: Edan): Future[Int] = db.run { edTableQuery.filter(_.id === edan.id).update(edan) }

  def delete(id: Int): Future[Int] = db.run { edTableQuery.filter(_.id === id).delete }

  def getAll(): Future[List[Edan]] = db.run { edTableQuery.to[List].result }

  def getById(edId: Int): Future[Option[Edan]] = db.run { edTableQuery.filter(_.id === edId).result.headOption }
  
  def ddl = edTableQuery.schema

}

private[repo] trait EdanTable  { self: HasDatabaseConfigProvider[JdbcProfile] =>

  import driver.api._

  private[EdanTable] class EdanTable(tag: Tag) extends Table[Edan](tag, "edan") {
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    val entrevistador: Rep[String] = column[String]("entrevistador", O.SqlType("VARCHAR(75)"))
    val cargo: Rep[String] = column[String]("cargo", O.SqlType("VARCHAR(30)"))
    val institucion: Rep[String] = column[String]("institucion", O.SqlType("VARCHAR(50)"))
    val telefono: Rep[String] = column[String]("telefono", O.SqlType("VARCHAR(10)"))
    val email: Rep[String] = column[String]("email", O.SqlType("VARCHAR(30)"))
    def emailUnique = index("email_unique_key", email, unique = true)
    def * = (entrevistador, cargo, institucion, telefono, email, id.?) <> (Edan.tupled, Edan.unapply)
  }

  lazy protected val edTableQuery = TableQuery[EdanTable]

  lazy protected val edTableQueryInc = edTableQuery returning edTableQuery.map(_.id)

}

