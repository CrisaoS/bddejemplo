#language: es

Característica: Probar el funcionamiento del modulo simple form demo

  Escenario: Validar el mensaje mostrado en pantalla al ingresarlo en un campo de texto
    Dado que ingreso a la pagina https://www.seleniumeasy.com/test/
    Y navego por el formulario Input Forms/Simple Form Demo
    Cuando ingreso el mensaje esto es una prueba automatizada
    Entonces se muestra el mensaje en pantalla

  Esquema del escenario: Validar la suma de dos valores ingresados en campos de texto
    Dado que ingreso a la pagina https://www.seleniumeasy.com/test/
    Y navego por el formulario Input Forms/Simple Form Demo
    Cuando ingreso los valores <valor1> y <valor2>
    Entonces se muestra la suma de los valores en pantalla

    Ejemplos:
      | valor1 | valor2 |
      | 3      | 5      |
      | 4      | 7      |

