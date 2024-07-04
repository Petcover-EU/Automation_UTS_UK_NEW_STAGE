Feature: Verify the End To End scenarios

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on quote icon on left tool bar

  Scenario: Verify the End To End scenario for the Exotic
    Given Add quote and Enter the client details
    When Select Exotic product and enter pet details
    And Select Plan and save quote and get Quote Number
    And Search and Edit the same quote and save application by entering underwriting questions and payment details
    And Create policy by using the same quote number and get policy number
    And Click on the Cog icon on the policy information page and add allocate payment
    And Click on the Cog icon on the policy information page and add endorsement
    And Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined
    And Click on the cog icon on the policy information page and add claim and decline the claim
    And Click on the cog icon on the policy information page and add claim and settle the claim
    And Renew the policy
    And Cancel the policy



