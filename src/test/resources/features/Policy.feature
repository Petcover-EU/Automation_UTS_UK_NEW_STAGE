Feature: Verify Policy Module Features

  Background:
    Given User should log in with username "sa" and password "H2T~w1£4tG#i" to the admin panel
    When User clicks on policy icon on left tool bar

##1
#  @sanity
#  Scenario: List of policies should display by clicking on policy icon on left tool bar
#    Then User can see "Manage Policy" message with all policy data
#
##2
#  @sanity
#  Scenario: Verify dates under start date and end date should display with dd-mm-yyyy format on manage policy page
#    Then All data under Start date and And date displays in dd-mm-yyyy format
#
##3
#  @sanity
#  Scenario: Respected policy information should displays by clicking on individual policy number on manage policy page
#    When User clicks on policy number
#    Then User will redirect to policy information page
#
##4
#  @sanity
#  Scenario:Verify that the user can download the client's policy letter
#    When User clicks on policy number link
#    And User clicks on letter tab on policy information page
#    And User clicks on download icon
#    Then User will able to see downloaded policy page
#
##5
##  @sanity
##  Scenario:Appropriate policy data should display upon selecting an option from the status drop down on managing policy page
##    When User selects any options from status dropdown
##    Then Appropriate data displays on manage policy page depend on drop down option
#
##6
#  @sanity
#  Scenario:Filter policy details on manage policy page upon from and to date value of policy  on manage policy page
#    When User enters value of from and to date value of policy on manage policy page
#    And User clicks on search button on manage policy page
#    Then Details of policy on manage policy page filters upon value of from and to date value of policy
#
##7
#  @sanity
#  Scenario: Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page
#    When User clicks on add claim icon of cog drop down against policy number on manage policy page
#    Then Add claim displays with all details
#
##8
#  @sanity
#  Scenario: Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page
#    When User clicks on add note window icon of cog drop down against policy number on manage policy page
#    Then Add note window displays with all details
#
##9
#  @sanity
#  Scenario: Verify that quote information page should open with all details by clicking on view quote icon of cog drop down against active policy number on manage policy page
#    When User clicks on view quote icon of cog drop down against policy number on manage policy page
#    Then Quote information page displays with all details
#
##10
##  @sanity
##  Scenario: Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And  User clicks on policy number link on manage policy page
##    And User selects add claim page icon option from cog drop down on policy information page
##    Then Add claim page displays with all details
##
###11
##  @sanity
##  Scenario: Add note window displays with all details by clicking add note icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And User clicks on policy number link on manage policy page
##    And User selects add note icon option from cog drop down on policy information page
##    Then Add note window displays with all details
##
###12
##  @sanity
##  Scenario: Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And User clicks on policy number link on manage policy page
##    And User selects add endorsement icon of cog drop down on policy information page
##    Then Policy endorsement page displays with all details
##
###13
##  @sanity
##  Scenario: Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And User clicks on policy number link on manage policy page
##    And User selects view quote icon option from cog drop down on policy information page
##    Then Quote information displays with all required details
##
###14
##  @sanity
##  Scenario: Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And User clicks on policy number link on manage policy page
##    And User selects cancel policy icon of cog drop down on policy information page
##    Then Cancel policy window displays with all required details
##
###15
##  @sanity
##  Scenario:Allocate payment page displays with all details by clicking add allocate payment icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And User clicks on policy number link on manage policy page
##    And User selects add allocate payment icon of cog drop down on policy information page
##    Then Add allocate payment page displays with all details
#
###16
##  @sanity
##  Scenario:Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page
##    When User selects any active option from status dropdown on manage policy page
##    And User clicks on policy number link on manage policy page
##    And User selects add account maintenance icon of cog drop down on policy information page
##    Then Client account maintenance displays with all details
#
##17
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on transactions tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on transactional tab on policy information page
#    Then User will able to see appropriate data
#
##18
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on insurer tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on insurer tab on policy information page
#    Then User will able to see appropriate data upon clicking insurer tab
#
##19
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on claim tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on claim tab on policy information page
#    Then User will able to see appropriate data upon clicking claim tab
#
##20
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on reversal claim tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on reversal claim tab on policy information page
#    Then User will able to see appropriate data upon clicking reversal claim tab
#
##21
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on credit note tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on credit note tab on policy information page
#    Then User will able to see appropriate data upon clicking credit note tab
#
##22
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on policy invoice credit note tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on policy invoice credit note tab on policy information page
#    Then User will able to see appropriate data upon clicking policy invoice credit note tab
#
##23
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on notes tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on notes tab on policy information page
#    Then User will able to see appropriate data upon clicking notes tab
#
##24
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on installment tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on installment tab on policy information page
#    Then User will able to see appropriate data upon clicking installment tab
#
##25
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on exclusion tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on exclusion tab on policy information page
#    Then User will able to see appropriate data upon clicking exclusion tab
#
##26
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on history tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on history tab on policy information page
#    Then User will able to see appropriate data upon clicking history tab
#
##27
#  @sanity
#  Scenario:Verify appropriate details should reflect by clicking on policy ledger tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on policy ledger tab on policy information page
#    Then User will able to see appropriate data upon clicking policy ledger tab

  ##NEW

  @stage
  Scenario:Verify a negative underwriting confirmation does not allow silent policy creation-Introductory Cover / Cat.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-Introductory Cover Cat
    And User select calculate button and select UW section table
    And field UW quation information
    Then User verify Worning message


  @stage
  Scenario: Verify payment validation prevents policy creation when required tender details are missing-CoverMy Breakdown / Vehicle Cover / European Cover Yes.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover Yes
    And User select calculate button
  And field UW quation information-CoverMy Breakdown Vehicle Cover European Cover Yes
    Then User verify Worning message-CoverMy Breakdown Vehicle Cover European Cover Yes

  @stage
  Scenario:Verify payment validation prevents policy creation when required tender details are missing-CoverMy Breakdown / Vehicle Cover / European Cover NO.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover NO
    And User select calculate button NO
    And field UW quation information-CoverMy Breakdown Vehicle Cover European Cover NO
    Then User verify Worning message-CoverMy Breakdown Vehicle Cover European Cover No

    ##NewCode
  @stage
  Scenario:Verify the complete journey from quote creation to policy creation Introductory Cover Cat
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-Introductory Cover Cat
    And User select plane and calculate option Introductory Cover Cat
    And User save and reopend quote
    And User field UW detail and select create policy option
    Then User verify detail Introductory Cover Cat

  @stage
  Scenario: Verify the complete journey from quote creation to policy creation Introductory Cover Dog Pedigree
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-Introductory Cover Dog
    And User select plane and calculate option Introductory Cover Dog
    And User save and reopend quote
    And User field UW detail and select create policy option
    Then User verify detail Introductory Cover Dog

  @stage
  Scenario: Verify the complete journey from quote creation to policy creation Introductory Cover Dog mixed-breed
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-Introductory Cover mixed-breed
    And User select plane and calculate option Introductory Cover Dog
    And User save and reopend quote
    And User field UW detail and select create policy option
    Then User verify detail Introductory Cover Dog

  @stage
  Scenario:Verify the complete quote-to-policy journey for CoverMy Breakdown Vehicle Cover with European Cover enabled.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover Yes
    And User select calculate button
    And User Field UW detail and select Payment Details with Cover European Cover Yes
    And User select create policy option Cover European Cover Yes
    Then User verify create policy detail

  @stage
  Scenario:Verify the complete quote-to-policy journey for CoverMy Breakdown Vehicle Cover with European Cover enabled with Save Application
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover Yes
    And User select calculate button
    And User Field UW detail and select Payment Details with Cover European Cover Yes
  And User select Save Application option and again select Payment Details with Cover European Cover Yes
    And User select create policy option Cover European Cover Yes
    Then User verify create policy detail

  @stage
  Scenario:Verify the complete quote-to-policy journey for CoverMy Breakdown Vehicle Cover with European Cover No.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover NO
    And User select calculate button No
    And User Field UW detail and select Payment Details with Cover European Cover NO
    And User select create policy option Cover European Cover NO
    Then User verify create policy detail


  @stage
  Scenario:Verify the complete quote-to-policy journey for CoverMy Breakdown Vehicle Cover with European Cover enabled with Save Application
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover NO
    And User select calculate button No
    And User Field UW detail and select Payment Details with Cover European Cover NO
    And User select Save Application option and again select Payment Details with Cover European Cover NO
    And User select create policy option Cover European Cover NO
   Then User verify create policy detail


  @stage
  Scenario:Verify the complete quote-to-policy journey for CoverMy Breakdown Vehicle Cover with European Cover No with premium values verify.
    When Select Add Quote
    And User select Existing Client number and all client detail Autofield
    And Select product and field pet detail-CoverMy Breakdown Vehicle Cover European Cover NO
    And User select calculate button No
    And User Field UW detail and select Payment Details with Cover European Cover NO
    And User select create policy option Cover European Cover NO
    Then User verify create policy detail with premium values