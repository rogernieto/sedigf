package models

case class Employee(name: String, email: String, companyName: String, position: String, id: Option[Int] = None)

case class Usuario(nombre: String, apellidos: String, email: String, password: String, id: Option[Int] = None)

case class Edan(entrevistador: String, cargo: String, institucion: String, telefono: String, email: String, id: Option[Int] = None)
