@Workspace
Feature: Como usuario necesito crear workspace dentro de Clokify
Background:
  Given El usuario se encuentra en el Time Tracker con usuario 'oblivion1609@hotmail.com' y contraseña 'SnapShot33·'


@WorkSpaceExitoso
Scenario: El usuario crea un workspace de forma exitosa
  When El usuario hace click en el menu de workspace
  And El usuario hace click en Manage Workspace
  And El usuario hace click en 'Create New Workspace'
  And El usuario ingresa nombre Work1
  And El usuario hace click en 'Create' para crear el workspace
  Then El usuario confirma en la lista que el workspace Work1 ha sido creado


@WorkSpaceName
Scenario: El usuario cambia el nombre de un Workspace
  When El usuario hace click en el menu de workspace
  And El usuario hace click en Manage Workspace
  And El usuario busca el workspace 'Work1' y hace click en settings
  And El usuario modifica el nombre del workspace ingresando  'Work2'
  Then El usuario verifica el cambio de nombre en la lista de workspace
