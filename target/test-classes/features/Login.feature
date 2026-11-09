#Feature:Login To Admin Panel
#
#  Background:
#    Given User is one the website login page

#  @smoke
#  Scenario: Verify Login event
#    When User enters username "sa" and password "Good2go@2019" and click signIn button
#    And User will be able to see dashBoard
#    Then User will be able to see "(en-GB)" text on right top corner of page
#
#  @smoke
#  Scenario: Verify user is not able to login using invalid credentials and get proper validations message
#    When User enters username "saa" and password "Good2go2019" and click signIn button
#    Then User will get proper validation message
