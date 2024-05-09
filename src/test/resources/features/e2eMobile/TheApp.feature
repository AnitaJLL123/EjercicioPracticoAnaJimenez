@mobileTheApp
Feature: Automatizacion de prueba Mobiles
    #Versión de BM usadas: IOS=20230817.1 Android=20230817.1
  @id:1 @loginLogout
  Scenario Outline: T-E2E- Ingresar al login y realizar logout
    Given que el usuario de la aplicacion ingresa y visualiza los textos The App y Choose An Awesome View
    When el usuario hace click en Login Screen se abrira la pantalla del login donde se ingresa '<usuario>' y '<password>'
    Then se muestra la pantalla de Login con el boton Logout y el text Secret Area
    And hacemos click en el boton Logout y nos direcciona a la pantalla del login.
    And hace click en la flecha de atras y redirecciona al home de la apk
    Examples:
      | @externaldata@e2eMobile/DatosTheApp.csv |

  @id:2 @Fog
  Scenario: T-E2E- Ingresar al link DemoFog
    Given el usuario hace clic en el link List DemoFog y luego en Learn More AboutFog
    When se muestra una pantalla con el texto Fog

  @id:3 @ClipBoardDemo
  Scenario Outline: T-E2E- Ingresar al ClipBoard Demo
    Given el usuario que hace clic en el link ClipBoard Demo
    When el ingrese el texto '<nombre>' en el campo, haga clic en el boton Refresh ClipBoard Text
    Then se replicara el texto ingresado en la pantalla
    Examples:
      | @externaldata@e2eMobile/DatosTheApp.csv |