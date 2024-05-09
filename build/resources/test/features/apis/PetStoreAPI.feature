@PetStore @karate
Feature: Gestionar Mascotas en la pagina de petStore

  @id:1 @AdicionarMascota @PostPet
  Scenario Outline: T-API - Adicionar una mascota
    * header content-type = 'application/json'
    Given url 'https://petstore.swagger.io/v2/'
    And path 'pet'
    And def datos = read('classpath:../data/apiPetStore/Pet.json')
    And set datos
      | path | value      |
      | id   | '<Id>'     |
      | name | '<Nombre>' |
    And print datos
    And request datos
    When method POST
    Then status 200
    And print response
    And match response.id == <Id>
    And match response.name contains '<Nombre>'
    * def id = response.id
    Examples:
      | read('classpath:../data/apiPetStore/DatosMascota.csv') |

  @id:2 @ConsultarMascotaRegistrada @GetPet
  Scenario Outline: T-API - Consultar la mascota adicionada
    * header content-type = 'application/json'
    * def id = call read('PetStoreAPI.feature@AdicionarMascota')
    * def id_Masc = id.response.id
    Given url 'https://petstore.swagger.io/v2/pet/'
    And path id_Masc
    When method GET
    Then status 200
    And print response
    And match response.id == <Id>
    And match response.name contains '<Nombre>'
    Examples:
      | read('classpath:../data/apiPetStore/DatosMascota.csv') |

  @id:3 @ModificarNombreMascota @PutPet
  Scenario Outline: T-API - Modificar el nombre de la mascota adicionada
    * header content-type = 'application/json'
    Given url 'https://petstore.swagger.io/v2/pet/'
    And def datos = read('classpath:../data/apiPetStore/Pet.json')
    And set datos
      | path | value      |
      | id   | '<Id>'     |
      | name | '<ModificarNombreMascota>' |
    And print datos
    And request datos
    When method PUT
    Then status 200
    And print response
    And match response.id == <Id>
    And match response.name contains '<ModificarNombreMascota>'
    Examples:
      | read('classpath:../data/apiPetStore/DatosMascota.csv') |

  @id:4 @EliminarMascota @DeletePet
  Scenario: T-API - Eliminar la mascota adicionada
    * header content-type = 'application/json'
    * def id = call read('PetStoreAPI.feature@ModificarNombreMascota')
    * def id = id.response.id
    Given url 'https://petstore.swagger.io/v2/pet/'
    And path id
    When method DELETE
    Then status 200
    And print response
