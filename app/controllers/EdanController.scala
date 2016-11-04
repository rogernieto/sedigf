package controllers

import com.google.inject.Inject
import models.Edan
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.{JsError, JsValue, Json}
import play.api.libs.json.Json._
import play.api.mvc._
import repo.EdanRepository
import utils.Constants
import utils.JsonFormat._

import scala.concurrent.Future


class EdanController @Inject()(edRepository: EdanRepository) extends Controller {

  import Constants._

  val logger = Logger(this.getClass())

  private def successResponse(data: JsValue, message: String) = {
    obj("status" -> SUCCESS, "data" -> data, "msg" -> message)
  }


  def list() = Action.async {
    edRepository.getAll().map { res =>
      logger.info("Ed list: " + res)
      Ok(successResponse(Json.toJson(res), "Datos obtenidos de forma exitosa"))
    }
  }


  def create() = Action.async(parse.json) { request =>
    logger.info("Edan Json ===> " + request.body)
    request.body.validate[Edan].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { ed =>
      edRepository.insert(ed).map { createdEdId =>
        Ok(successResponse(Json.toJson(Map("id" ->createdEdId)), "Ficha creada con exito."))
      }
    })
  }


  def delete(edId: Int) = Action.async { request =>
    edRepository.delete(edId).map { _ =>
      Ok(successResponse(Json.toJson("{}"), "Ficha eliminada exitosamente"))
    }
  }


  def edit(edId: Int): Action[AnyContent] = Action.async { request =>
    edRepository.getById(edId).map { edOpt =>
      edOpt.fold(Ok(obj("status" -> ERROR, "data" -> "{}", "msg" -> "Ficha no existe")))(ed => Ok(
        successResponse(Json.toJson(ed), "Ficha obtenida de forma exitosa")))
    }
  }


  def update = Action.async(parse.json) { request =>
    logger.info("Edan Json ===> " + request.body)
    request.body.validate[Edan].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { ed =>
      edRepository.update(ed).map { res => Ok(successResponse(Json.toJson("{}"), "Ficha actulizada exitosamente")) }
    })
  }

}



