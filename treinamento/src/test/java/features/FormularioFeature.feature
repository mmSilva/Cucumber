#Author: Marcia Silva
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: acessar o site de pesquisa de  veículos e após preencher e enviar
  o formulario salvar o arquivo com as repostas

  @tag1
  Scenario: Cadastro de formulario
    Given eu acesso o site
    And acesso  o formulario de pesquisa
    When eu completo o cadastro
    Then envio minhas repostas

