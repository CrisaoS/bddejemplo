#language: es

Característica: realizar formulario covid

  Esquema del escenario: llenar campos requeridos y enviar formulario
    Dado ingreso con la pagina web <x>
    Y le doy click en Sí, autorizo
    Cuando ingreso mi cedula 1037616759 y nombre Tomás Mejía
    Y le doy en Finalizar
    Entonces se valida el mensaje en pantalla Tomás Mejía, gracias por tus respuestas.

    Ejemplos:
      | x                                                                                                                                                                              |
      | https://www.segurossura.com.co/covid-19/encuestas/paginas/sintomas.aspx?nitEmpresa=890916883&sector=VEVNUE9SQUxFUw==&idEmpresa=ODkwOTE2ODgz&mail=juan.paniagua@manpower.com.co |
      | https://www.segurossura.com.co/covid-19/encuestas/paginas/sintomas.aspx?nitEmpresa=900843898&sector=VElD&idEmpresa=OTAwODQzODk4&mail=miguel.perez@rappi.com                    |