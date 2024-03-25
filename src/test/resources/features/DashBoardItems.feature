Feature: Verify DashBoard Items

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel

  @Sanity
  Scenario: Verify Client,Quote,Policy,Claim details on dash board page
    Then Dash board page displays with total and monthly numbers of client,quote,policy and claim

  @Sanity
  Scenario:Verify the global search functionality for client
    When User get client code from the client list in manage client page
    And Search the same client in the global search on dashboard and click on the go button
    Then User will redirects to manage client page and verify the searched result

  @Sanity
  Scenario: Verify the global search functionality for policy
    When User get policy number from the list of policy in the manage policy page
    And Search the same policy in the global search on dashboard and click on the got button
    Then User will redirects to manage policy page and should able to verify the searched result

#  @Sanity
#  Scenario: Verify the global search functionality for claim
#    When User get claim number from list of claim in manage claim page
#    And Search the same claim in the global search on dashboard and click on the got button
#    Then User will redirects to manage claims page and should able to verify the searched result
