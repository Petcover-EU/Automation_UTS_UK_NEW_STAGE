#Feature: Verify the End To End scenarios
#
#  Background:
#    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
#    When User clicks on quote icon on left tool bar
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Exotic
#    Given Add quote and Enter the client details
#    When Select Exotic product and enter pet details
#    And Select Plan and save quote and get Quote Number
#    And Search and Edit the same quote and save application by entering underwriting questions and Direct debit payment details
#    And Create policy by using the same quote number and get policy number
#    And Go to the instalment tab and pay the premium of first instalment using Pay now link of Exotic policy
#    And Click on the Cog icon on the policy information page and add allocate payment
#    And Click on the Cog icon on the policy information page and add endorsement
#    And Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined
#    And Click on the cog icon on the policy information page and add claim and decline the claim
#    And Click on the cog icon on the policy information page and add claim and settle the claim with EFT payment
#    And Renew the policy and verify the policy status
#    And Cancel the policy and verify the policy status
##
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Cat
#    Given Add quote and Enter the client details for cat
#    When  Select Cat product and enter the pet details
#    And Select Plan and save the quote of cat and Get quote number
#    And Search and edit the quote number and save application by entering UW questions and Credit card payment details
#    And Create policy by editing the same quote number and get the policy number
#    And Go to the instalment tab and pay the premium of second instalment using Pay now link of Cat policy
#    And Click on the Cog icon on the policy information page and add allocate payment on Cat policy
#    And Click on the Cog icon on the policy information page and add endorsement of Cat policy
#    And Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined of Cat Policy
#    And Click on the cog icon on the policy information page and add claim and decline the claim of Cat policy
#    And Click on the cog icon on the policy information page and add claim and settle the claim with Cheque Payment
#    And Renew the policy and verify the policy status of Cat policy
#    And Cancel the policy and verify the policy status of Cat policy
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Dog
#    Given Add quote and Enter the client details for Dog
#    When Select Dog product and enter the pet details
#    And Select dog plan and save the quote and get quote number
#    And Search and edit the dog quote number and save application by entering UW questions and Direct debit payment details
#    And Create policy by editing the same quote of dog and get the policy number
#    And Go to the instalment tab and pay the premium of first instalment using Pay Now link of Dog policy
#    And Click on the Cog icon on the policy information page and add allocate payment on the Dog policy
#    And Click on the Cog icon on the policy information page and add endorsement of Dog Policy
#    And Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined of Dog Policy
#    And Click on the cog icon on the policy information page and add claim and decline the claim of Dog policy
#    And Click on the cog icon on the policy information page and add claim and settle the claim with EFT payment method
#    And Renew the policy and verify the policy status of Dog policy
#    And Cancel the policy and verify the policy status of Dog policy
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Horse
#    Given Add quote and enter client details for the Horse
#    When Select Horse product and enter the pet details
#    And Select horse insurance basic plan with optional extra and save the quote and get quote number
#    And Search and edit the horse quote and save application by entering UW questions and Direct debit payment details
#    And Create policy by editing the same quote of Horse and get the policy number
#    And Go to the instalment tab and pay the premium of first instalment using Pay Now link of Horse Policy
#    And Click on the Cog icon on the policy information page and add allocate payment on the Horse policy
#    And Click on the Cog icon on the policy information page and add endorsement of Horse Policy
#    And Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined of Horse Policy
#    And Click on the cog icon on the policy information page and add claim and decline the claim of Horse policy
#    And Click on the cog icon on the Horse policy information page and add claim and settle the claim with EFT payment method
#    And Renew the policy and verify the policy status of Horse policy
#    And Cancel the policy and verify the policy status of Horse policy
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Senior Horse
#    Given Add quote and enter client details for the senior Horse
#    When Select Horse product and enter the pet details of senior horse
#    And Select senior horse insurance B with optional extra and save the quote and get quote number
#    And Search and edit the senior horse quote and save application by entering UW questions and Credit card payment details
#    And Create policy by editing the same quote of senior Horse and get the policy number
#    And Go to the instalment tab and pay the premium of first instalment using Pay Now link of Senior Horse
#    And Click on the Cog icon on the policy information page and add allocate payment on the Senior Horse policy
#    And Click on the Cog icon on the policy information page and add endorsement of Senior Horse Policy
#    And Add claim and enter claim amount less than the excess amount and verify the claim gets auto decline for senior horse
#    And Click on the cog icon on the policy information page and add claim and decline the claim by Admin user of Senior Horse policy
#    And Click on the cog icon on the Senior Horse policy information page and add claim and settle the claim with Cheque Payment
#    And Renew the policy and verify the policy status of Senior Horse policy
#    And Cancel the policy and verify the policy status of Senior Horse policy
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Horse Liability cover
#    Given Click on Add quote button and enter client details
#    When Select Horse liability cover option and enter the required details
#    And Verify the Liability plan is selected and save the quote and get quote number
#    And Search and edit the same quote and save application by entering UW questions and Direct debit payment details
#    And Create policy by editing the same quote of Horse liability and get the policy number
#    And Go to the instalment tab and pay the premium of first instalment using Pay Now link of Horse Liability
#    And Click on the Cog icon on the Policy information page and add allocate payment on the Horse Liability cover policy
#    And Click on the Cog icon on the Policy information page and add endorsement on the Horse Liability cover policy
#    And Add claim and enter claim amount less than the excess amount and verify the claim gets auto declined for Horse Liability cover
#    And Add claim and decline the claim by the admin user and verify the claim status is declined
#    And Add claim and Settle the claim with the Electronic Fund Transfer payment
#    And Renew the policy and verify the policy status of Horse Liability cover policy
#    And Cancel the policy and verify the policy status of the Horse Liability cover policy
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Horse Saddlery and Tack
#    Given Click on the add quote button and enter the client details
#    When Select Horse product and select Saddlery and Tack product
#    And Enter Saddlery current market value and save quote by verifying Saddlery Plan is selected on cover table
#    And Search and edit the same quote and save application by entering UW questions and Credit card payment method
#    And Create policy of the Saddlery and tack by editing saved application
#    And Go to instalment tab and pay the premium of the second instalment using Pay Now link of Saddlery policy
#    And Apply add allocate payment on the policy
#    And Apply endorsement on the Horse Saddlery and Tack policy
#    And Add claim on the policy verify the claim gets auto decline due to claim amount is less than the excess value
#    And Add claim on the  policy and decline the claim by admin user
#    And Add claim on the policy and Authorise Approve and settle the claim using cheque payment method
#    And Verify the Renew policy and renewed policy status of Horse saddlery and tack
#    And Verify the Cancel policy and cancelled policy status of Horse saddlery and tack
#
#  @end-to-end
#  Scenario: Verify the end to end scenario of the Horse Trailer and drown vehicle
#    Given Click on the Add quote button and enter the client details
#    When Select Horse product and select Horse Trailer and drown vehicle
#    And Enter Trailer current market value and save quote by verifying Trailer Plan is selected on cover table
#    And Search and edit the same quote and save application by entering UW questions and Direct debit payment method
#    And Create policy of the Trailer and drown vehicle by editing saved application
#    And Go to instalment tab and pay the premium of the first instalment using Pay Now link of Trailer policy
#    And Apply add allocate payment on the Horse trailer policy
#    And Apply endorsement on the Horse Trailer and Drown vehicle policy
#    And Add claim on the Horse Trailer policy verify the claim gets auto decline due to claim amount is less than the excess value
#    And Add claim on the  Horse Trailer policy and decline the claim by admin user
#    And Add claim on the Horse Trailer policy and Authorise Approve and settle the claim using EFT payment method
#    And Verify the Renew policy and renewed policy status of Horse Trailer and Drown vehicle
#    And Verify the Cancel policy and cancelled policy status of Horse Trailer and Drown vehicle