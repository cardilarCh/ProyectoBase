# language: es

@AgregarReclutado
Característica: Agregar Candidato
  Descricion: Yo como analista de Orange necesito agregar informacion en
  el sitio web del nuevo candidato reclutado.

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






