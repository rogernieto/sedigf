package utils

import models._
import play.api.libs.json.Json

object JsonFormat {

  implicit val employeeFormat = Json.format[Employee]
  implicit val usuarioFormat = Json.format[Usuario]
  implicit val edanFormat = Json.format[Edan]

}


