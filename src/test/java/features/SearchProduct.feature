
@tag1
Feature: Search and place order for projects	
Scenario Outline: User search experience

Given User is on GreenCart landing page
When User searched with <Name> and extracted actual name of product
Then User searched for same shortname <Name> in offers page to check if the same product exists

Examples:
|Name|
|Tom|
|Beet|