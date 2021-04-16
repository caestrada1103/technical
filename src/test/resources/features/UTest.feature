# Autor: Carlos Armando Estrada
@stories
  Feature: u Test
    As a user, i want to create a new user profile on uTest's page with Join Today form
  @scenario1
    Scenario Outline: Create user profile on uTest's page
    Given than Fernando wants to create a user profile on uTest
    When he initiate register's form
      | strName  | strLastName  | strEmail   | strLanguage   | strCity  | strZipCode | strCountry | strMobile | strModel | strOperatingSystem| strPassword |
      | <strName>| <strLastName>| <strEmail> | <strLanguage> | <strCity>|<strZipCode>|<strCountry>|<strMobile>|<strModel>|<strOperatingSystem>| <strPassword> |
    Then he sing in on uTest with his user
    |  strFinalConfirm |
    | <strFinalConfirm> |

    Examples:
    | strName       | strLastName| strEmail                | strLanguage |strCity     |strZipCode|strCountry|strMobile|strModel|strOperatingSystem| strPassword | strFinalConfirm |
    | Pepito Perez  | Ramirez    | estoesuna.prueba@gmail.com | Spanish     |Dosquebradas| 661001   | Colombia |Xiaomi   | Mi A2  |  Android 10  |   Testing1235*  | Complete Setup  |
