#language: es

Característica: Probar funcionamiento simple form demo

  Escenario: Validar mensaje mostrado en pantalla al ingresarlo en un campo de texto
    Dado ingreso a la pagina https://www.seleniumeasy.com/test
    Y navegar por el formulario Input Forms/Simple Form Demo
    Cuando ingreso el mensaje esto es la nota papa
    Entonces se muestre en pantalla el mensaje

  Esquema del escenario: Validar la suma de dos valores ingresados en campos de texto
    Dado ingreso a la pagina https://www.seleniumeasy.com/test
    Y navegar por el formulario Input Forms/Simple Form Demo
    Cuando ingreso los valores <valor1> y <valor2>
    Entonces Se muestra la suma de los valores en pantalla

    Ejemplos:
      | valor1 | valor2 |
      | 3      | 22     |
      | 2      | 44     |