package bootstrap

import com.google.inject.Inject
import javax.inject.Singleton
import repo.UsuarioRepository
import models.Employee
import models.Usuario
import java.util.Date
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.Logger
import scala.concurrent.Await
import scala.concurrent.duration.Duration

class InitialData @Inject() (usuarioRepo: UsuarioRepository) {

  
    def insert = for {
    users <- usuarioRepo.getAll() if (users.length == 0)
    _ <- usuarioRepo.insertAll(User.usuarios)
  } yield {}

  try {
    Logger.info("DB initialization.................")
    Await.result(insert, Duration.Inf)
  } catch {
    case ex: Exception =>
      Logger.error("Error in database initialization ", ex)
  }

}



object User {
  val usuarios = List(
    Usuario("Satendra", "Perez", "satendra@knoldus.com", "Senior Consultant"),
    Usuario("Mayank", "Vargas", "mayank@knoldus.com",  "Senior Consultant"),
    Usuario("Sushil", "Hil", "sushil@knoldus.com", "Consultant"))
}

