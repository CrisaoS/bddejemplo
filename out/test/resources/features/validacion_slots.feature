#language: es

  Característica: Validacion de disponibilidad de slots para programacion de ordenes

    Escenario: validar el correcto funcionamiento de la consulta de slots
      Dado inicio sesión dentro de rappi con el correo test99@test.com y la contraseña rappirappi
      Y creo una orden de licores
      Cuando consulto los slots disponibles para la programacion de la orden
      Entonces la consulta debe ser exitosa