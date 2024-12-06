Feature: Verify Quote Module Features

  Background:
    Given User should log in with username "sa" and password "H2T~w1£4tG#i" to the admin panel
    When User clicks on quote icon on left tool bar

#  @sanity
#  Scenario: Manage Quote page displays with list of quotes by clicking on quote icon on left tool bar.
#    Then Manage quote page displays with list of quote
#
#  @sanity
#  Scenario:To verify dates under Quote date and Expire date columns displays in dd-mm-yyyy format
#    Then User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format
#
#  @sanity
#  Scenario: One can redirect to add quote page by clicking add quote button on top right corner of manage quote
#    When User clicks add quote button on manage quote page
#    Then User will able to see add quote page with data
#
#  @sanity
#  Scenario:On the Add Quote page, verify that the Product dropdown appears with list of products
#    When User clicks on add quote button
#    Then On add quote page product dropdown will appear with desired list
#
#  @sanity
#  Scenario:Data under total and monthly premium column should prefixed by £ sign
#    Then User will able to see  all data under total and monthly premium colum prefixed by £ sign
#
#  @sanity
#  Scenario: Respected quote information page will be displayed upon clicking quote number on manage quote page
#    When User clicks on quote number on manage quote page
#    Then Quote Information page displays with details
#
#  @sanity
#  Scenario: Items on manage quote page displays upon option selects from quote status dropdown
#    When User selects appropriate option from quote status dropdown
#    Then Respected data will be displayed on Manage quote page
#
#  @sanity
#  Scenario: Fetch list of quote based on product option from product dropdown on manage quote page
#    When User selects appropriate option from product dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display
#
#  @sanity
#  Scenario: Fetch list of quote based on option from Is referred dropdown on manage quote page
#    When User selects appropriate option from Is referred dropdown on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate list of quote will display upon drop down option
#
#
##  Scenario: Fetch list of quote based on option from division dropdown on manage quote page
##    When User selects appropriate option from division dropdown on manage quote page
##    And User clicks on search button on manage quote page
##    Then Appropriate list of quote will display upon division drop down option
##
##  @sanity
##  Scenario: Fetch list of quote based on pet id products checkbox on manage quote page
##    When User selects pet id products checkbox on manage quote page
##    And User clicks on search button on manage quote page
##    Then Appropriate list of quote will display upon pet id products checkbox on manage quote page
#
#
#  @sanity
#  Scenario:Verify include payment feature of quote module
#    When User selects include payment only quotes checkbox
#    And User clicks on search button on manage quote page
#    Then Appropriate quote list displays on manage quote page
#
#  @sanity
#  Scenario:To check whether user will able able to redirect and see data on microchip file upload page after clicking on upload microchip button on manage quote page
#    When User clicks on upload microchip file button
#    Then User will be able to see microchip file upload page with data
#
#
##  @sanity
##  Scenario:Upload details window should open by clicking on file name link on microchip file upload page
##    When User clicks on upload microchip file button
##    And User clicks on filename link on upload microchip page
##    Then Upload details window displays with all details
##
##
##  Scenario:Verify that quote information page displays with same status code on by clicking on quote code on manage quote page
##    When User clicks on quote number link on manage quote page
##    Then Quote information page displays with sane status code
##
##  @sanity
##  Scenario:verify functionality of upload file feature  on microchip upload file page
##    When User clicks on upload microchip file button
##    And user click on upload file button
##    Then user will able to upload file
##
##  @sanity
##  Scenario:Pending Microchip displays with details by clicking on pending microchip button on manage quote page
##    When User clicks on pending microchip file button
##    Then Pending Microchip page displays with details
#
#  @sanity
#  Scenario:Fetch quotation based on quote number on manage quote page
#    When User enters quote number inside search box on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate quote information displays on manage quote page
#
#  @sanity
#  Scenario:Fetch quotation based on quote number on manage quote page
#    When User enters quote number inside search box on manage quote page
#    And User clicks on search button on manage quote page
#    Then Appropriate quote information displays on manage quote page
#
##  @sanity
##  Scenario: Edit quote details and verifies the same
##    When User enters quote number inside search box on manage quote page
##    And User clicks on search button on manage quote page
##    And User clicks on quote number from list of quote on manage quote page
##    And User selects edit quote option from cog icon on quote information page
##    Then User can edit all required field on edit quote page
##
##  @sanity
##  Scenario: Edit quote details and verifies the same
##    When User selects edit quote option from cog icon on quote information page
##    Then User can edit all required field on edit quote page

  ## New Code
  @sanity
  Scenario:Verify that required client and pet fields are validated when left blank-CoverMy Pet /Cat.
    When Select quote Icone
    And User clicks on Add quote Option then select Product -CoverMy PetCat
    Then User not field all Mandatory field and select caclulate Option

  @sanity
  Scenario: Verify that required client and pet fields are validated when left blank-CoverMy Pet /Dog.
    When Select quote Icone
    And User clicks on Add quote Option then select Product -CoverMy PetDog
    Then User not field all Mandatory field and select caclulate Option

  @sanity
  Scenario: Confirm a past date is accepted and eligibility is assessed correctly-Enter Current Date-Exotic Direct.
    When Select quote Icone
    And User clicks on Add quote Option then select Product-Exotic Direct
    And User select Existing Client number and all client detail Autofield
    And User select pet BOB currect date
    Then User verify worning message


  @sanity
  Scenario:Verify that a future birth/hatch date is rejected-Exotic Direct.
    When Select quote Icone
    And User clicks on Add quote Option then select Product-Exotic Direct
    And User select Existing Client number and all client detail Autofield
    And User select pet BOB Next date
    Then User verify worning message
  @sanity
  Scenario: Verify consistent rejection of a date several months in the future-Exotic Direct.
    When Select quote Icone
    And User clicks on Add quote Option then select Product-Exotic Direct
    And User select Existing Client number and all client detail Autofield
    And User select pet BOB Next Month
    Then User verify worning message


  @sanity
  Scenario: Ensure an invalid date is rejected-Enter invalid date formate-Exotic Direct.
    When Select quote Icone
    And User clicks on Add quote Option then select Product-Exotic Direct
    And User select Existing Client number and all client detail Autofield
    And User select pet BOB currect date-invalid date formate
    Then User verify worning message
  @sanity
  Scenario:Verify required-field validation.-Date test box blank-Exotic Direct
    When Select quote Icone
    And User clicks on Add quote Option then select Product-Exotic Direct
    And User select Existing Client number and all client detail Autofield
    And User select pet BOB currect date-Test box blank
    Then User verify worning message

    ###New create

  @sanity
  Scenario:Verify that a quote can be saved and reopened with its previously entered data-CoverMy Pet /Cat.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And User select product and field detail CoverMy Pet Cat
    And User select plane and calculate option
    And User save and reopend quote
    Then User verify detail

   @sanity
  Scenario: Verify that a quote can be saved and reopened with its previously entered data - CoverMy Pet Dog
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And User select product and field detail CoverMy Pet Dog
    And User select plane and calculate option CoverMy Pet Dog
    And User save and reopend quote
    Then User verify detail

  @sanity
  Scenario:Verify that a quote can be saved and reopened with its previously entered data -Introductory Cover Cat
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-Introductory Cover Cat
    And User select plane and calculate option Introductory Cover Cat
    And User save and reopend quote
    Then User verify detail

  @sanity
  Scenario:Verify that a quote can be saved and reopened with its previously entered data -Introductory Cover Dog
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-Introductory Cover Dog
    And User select plane and calculate option Introductory Cover Dog
    And User save and reopend quote
    Then User verify detail

  @sanity
  Scenario: Verify old horse save quote after successful calculation behaviour across the Old Horse quote journey.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail old horse
    And User select plane and calculate option old horse
    And User save old horse quote
    Then User verify old horse detail