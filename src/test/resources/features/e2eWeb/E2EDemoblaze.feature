@demoblaze
Feature:  Validar que la aplicacion demoblaze cumpla con los casos de pruebas definidos en la HU

  @id:1 @singUp @CA01
  Scenario Outline: T-E2E - Ingresar a Sing UP para crear una cuenta.
    Given que el cliente ingresa a la pagina Demoblaze
    When el ingresa sus credenciales para crear una cuenta "<username>","<password>"
    Then visualiza la pagina inicio "PRODUCT STORE"
    Examples:
      | @externaldata@e2eWeb/WebDataDemoblaze.csv |

  @id:2 @logIn @CA02CA03
  Scenario Outline: T-E2E - Realizar log in.
    Given que el cliente ingresa a la pagina Demoblaze
    When el ingresa sus credenciales para acceder a la pagina "<username>","<password>"
    Then visualiza la pagina inicio y tambien confimamos que apareca el nombre de usuario en la esquina superior derecha "PRODUCT STORE","<username>"
    Examples:
      | @externaldata@e2eWeb/WebDataDemoblaze.csv |

  @id:3 @AgregarEliminarUnProductoCarritoCompras @CA04CA05CA06CA07CA08CA09
  Scenario Outline: T-E2E - Validar funcionalidad de agregar, eliminar de carrito de compras un producto y realizar Log Out.
    Given que el cliente ingresa a la pagina Demoblaze con sus credenciales "<username>","<password>" consulta una categoria "<categoria>" y selecciona un producto "<producto>"
    When el selecciona un producto y agrega el carrito de compras, eliminamos el producto seleccionado "<producto>"
    Then realizamos un Log Out y regresamos a la pagina principal
    Examples:
      | @externaldata@e2eWeb/WebDataDemoblaze.csv |