

Feature: Logueo en la aplicación Clockify

  Background:
    Given el usuario abrió la URL https://app.clockify.me/es/login
    And el usuaio se registró en clockify
  @Smoke_Loguin
  Scenario: loguin exitoso con correo y password validos
    When el usuario hace click en el link Iniciar sesión manualmente
    And el usuario hace click en campo input email e ingresa el correo electronico valido nestorcordoba@gmail.com
    And el usuario hace click en campo input password e ingresa el pass valido clockify01
    And el usuario hace click en botón submit INICIAR SESIÓN
    Then el usuario inicia sesion correctamente posisicionandose en el modulo RASTREADOR
