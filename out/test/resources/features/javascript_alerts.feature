  #language: es

  Característica: Validacion del funcionamiento de javascript alerts

    Antecedentes:
      Dado que entro a la pagina web SeleniumEasyDemo y entro al menú Alerts & Modals, Javascript Alerts

    Escenario: Cerrar javascript alert
      Entonces se llama el alert del modulo Java Script Alert Box y se cierra correctamente

    Esquema del escenario: Confirmar acciones de botones en javascript alert
      Cuando se llama el alert del modulo Java Script Confirm Box y se selecciona la opcion <opcion>
      Entonces se debe mostrar el mensaje en pantalla <mensaje>
      Ejemplos:
        | opcion   | mensaje             |
        | Aceptar  | You pressed OK!     |
        | Cancelar | You pressed Cancel! |

    Escenario: Validar el mensaje en pantalla ingresado en un javascript alert
      Cuando se llama el alert del modulo Java Script Alert Box y se ingresa el mensaje "Prueba de automatizacion"
      Entonces el mensaje debe mostrarse en pantalla














