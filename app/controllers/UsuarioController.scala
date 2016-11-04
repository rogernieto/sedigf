package controllers

import com.google.inject.Inject
import models.Usuario
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.{JsError, JsValue, Json}
import play.api.libs.json.Json._
import play.api.mvc._
import repo.UsuarioRepository
import utils.Constants
import utils.JsonFormat._

import scala.concurrent.Future


class UsuarioController @Inject()(usuRepository: UsuarioRepository) extends Controller {

  import Constants._

  val logger = Logger(this.getClass())

  private def successResponse(data: JsValue, message: String) = {
    obj("status" -> SUCCESS, "data" -> data, "msg" -> message)
  }


  def list() = Action.async {
    usuRepository.getAll().map { res =>
      logger.info("Usu list: " + res)
      Ok(successResponse(Json.toJson(res), "Datos obtenidos de forma exitosa"))
    }
  }


  def create() = Action.async(parse.json) { request =>
    logger.info("Usuario Json ===> " + request.body)
    request.body.validate[Usuario].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { usu =>
      usuRepository.insert(usu).map { createdUsuId =>
        Ok(successResponse(Json.toJson(Map("id" ->createdUsuId)), "Usuario creado con exito."))
      }
    })
  }


  def delete(usuId: Int) = Action.async { request =>
    usuRepository.delete(usuId).map { _ =>
      Ok(successResponse(Json.toJson("{}"), "Usuario elimnado exitosamente"))
    }
  }


  def edit(usuId: Int): Action[AnyContent] = Action.async { request =>
    usuRepository.getById(usuId).map { usuOpt =>
      usuOpt.fold(Ok(obj("status" -> ERROR, "data" -> "{}", "msg" -> "El usuario no existe")))(usu => Ok(
        successResponse(Json.toJson(usu), "Usuario obtenido de forma exitosa")))
    }
  }


  def update = Action.async(parse.json) { request =>
    logger.info("Usuario Json ===> " + request.body)
    request.body.validate[Usuario].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { usu =>
      usuRepository.update(usu).map { res => Ok(successResponse(Json.toJson("{}"), "Usuario actualizado exitosamente")) }
    })
  }

}



