Feature: End2End  Tests
   Description: test integration search and delete
   
   Scenario Outline: User enter on the details of an project and delete it from search
   
   Given user is logged in "<userName>" , "<password>"
   When  user is in the project list
   And   he adds a new project "<templateName>" , "<projectName>" , "<optionTemplate>" , "<optionSystem>" , "<optionEntities>" , "<optionProjectManager>" , "<optionStatus>" , "<definition>" , "<purpose>" , "<requirement>" , "<effectiveJour>" , "<endJour>" , "<optionDataLineage>" , "<businessCase>" , "<optionSuppliers>" , "<optionParticipants>" , "<optionConsumers>"
   And   he searches for "<projectName>"
   And   he enters on details "<projectName>"
   Then  he deletes the project
   
   Examples:
   | userName | password | templateName | projectName | optionTemplate | optionSystem | optionEntities | optionProjectManager | optionStatus | definition |  purpose  | requirement | effectiveJour | endJour | optionDataLineage | businessCase | optionSuppliers | optionParticipants | optionConsumers |
   | w.chalouati | Wiemhuxium2023* |  | wiem | Default | PeopleSoft | Banque | Chalouati | Approved | definition | purpose | requirement | 15 | 25 | test | business Case Test | w.chalouati@huxium.io | n.benbrahim@huxium.io | yaouimeur@systnaps.com |

