Feature: Validar la ubicacion del mejor Datacenter Colombia

  @CP01
  Scenario Outline: Se validara la ubicacion de la empresa Datacenter Colombia S.A.S
    Given El usuario abre google chrome
    When El usuario busca la empresa datacenter en el deveganor de chrome "<searh>"
    And El usuario selecciona la pagina de datacenter colombia SAS
    And El usuario da clicked sobre Contactanos
    And  El usuario busca donde esta ubicada la empresa en la pagina
    Then El usuario deberia ver la ubicacion en un mapa


    Examples:
      | searh             |
      | datacenter colombia |



