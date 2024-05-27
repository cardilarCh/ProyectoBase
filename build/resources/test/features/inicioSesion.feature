# language: es

@AgregarReclutado
Característica: inicio de sesion
  Descricion: Yo como analista de banco necesito iniciar sesión en
  el sitio web guruBank con mis credenciales de acceso.

  @Test1
  Esquema del escenario: <Escenario>
    Dado El usuario ingresa a la pagina Web e ingresa sus credenciales
      | <strUsuario> | <strClave> |
    Cuando ingresar al menu de <strOpcion>
    Y agrega la informacion de la persona
    Entonces valido su estado <estado>

    Ejemplos:
      | Escenario     | strUsuario | strClave | strOpcion   | estado |
      | Login exitoso | Admin      | admin123 | Recruitment | Application Initiated  |






