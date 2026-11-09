#Feature: Verify the policy creation of the different product
#
#  Background:
#    Given User should log in with username "sa" and password "H2T~w1£4tG#i" to the admin panel
#    When User clicks on quote icon on left tool bar

    #    Policy creation for Exotic  -> 31 policies

#  @regression
#  Scenario: Verify the Quote and Policy creation for Exotic products with different combinations of plan
#    When User clicks add quote button on manage quote page
#    And Enter client contact information and select "Exotic" product then enter pet info and click on calculate button and Select appropriate policy plan and enter payment details Click on create policy button then Verify the policy details on policy information page
#
##    Policy creation for Cat -> 72
#  @regression
#  Scenario: Verify the Quote and Policy creation for Cat with different plans
#    When User clicks add quote button on manage quote page
#    And Enter client contact information and select product then enter pet information and select appropriate plan and enter payment details then click on create policy button and verify the policy details on policy information page
#
##    Policy creation for Dog  -> 76
#  @regression
#  Scenario: Verify the Quote and Policy creation for Dog with different plans
#    When User clicks add quote button on manage quote page
#    And Enter client contact information and select Dog product then enter pet information and select appropriate plan and enter payment details then click on create policy button and verify the policy details on policy information page
#
#  #    Policy creation for Horse Basic Plan and the combination of different Optional extra -> 27
#  @regression
#  Scenario: Verify the Quote and Policy creation for Horse with Basic Horse Plan and different Optional Extras plans
#    When User clicks add quote button on manage quote page
#    And Enter client contact information and select Horse product then enter pet information and select appropriate plan and enter payment details then click on create policy button and verify the policy details on policy information page
#
##    Policy creation with Basic Plan + Horse Saddlery and tack Optional Extra
#  @regression
#  Scenario: Create the Horse Policy with the Basic Horse plan and the Saddlery and Tack Optional Extra
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the product and enter product details
#    And Select the Basic plan and the Saddlery and Tack optional extra
#    And Enter the policy start date and questions related to the Saddlery and Tack and enter payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated
#
##   Policy creation with Basic Plan + Horse Trailer & Drown vehicle Optional Extra
#  @regression
#  Scenario: Create the Horse Policy with the Basic Horse plan and the Horse Trailers and Horse Drawn Vehicles Optional Extra
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the product and enter product details
#    And Select the Basic plan and the Horse Trailers and Horse Drawn Vehicles Optional Extra
#    And Enter the policy start date and questions related to Horse Trailer and Horse Drawn Vehicle and enter payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Trailer
#
##    Policy creation with Senior Horse Plan A + Horse Saddlery and Tack Optional Extra
#  @regression
#  Scenario: Create the Horse Policy with the Senior Horse plan A and the Saddlery and Tack Optional Extra
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the product and enter product details for Senior Horse Plan "A"
#    And Select the Horse senior plan A and the Saddlery and Tack optional extra
#    And Enter the policy start date and questions related to the Saddlery and Tack and enter payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Saddlery with senior horse
#
##   Policy creation with Senior Horse Plan A + Horse Trailer & Drown vehicle Optional Extra
#  @regression
#  Scenario: Create the Horse Policy with the Senior Horse plan A and the Horse Trailer and Drown Vehicle Optional Extra
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the product and enter product details for Senior Horse Plan "A"
#    And Select the Horse senior plan A and the Horse Trailer and optional extra
#    And Enter the policy start date and questions related to Horse Trailer and Horse Drawn Vehicle and enter payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Trailer with senior horse
#
#  #    Policy creation with Senior Horse Plan B + Horse Saddlery and Tack Optional Extra
#  @regression
#  Scenario: Create the Horse Policy with the Senior Horse plan B and the Saddlery and Tack Optional Extra
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the product and enter product details for Senior Horse Plan "B"
#    And Select the Horse senior plan B and the Saddlery and Tack optional extra
#    And Enter the policy start date and questions related to the Saddlery and Tack and enter payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Saddlery with senior horse Plan B
#
##   Policy creation with Senior Horse Plan B + Horse Trailer & Drown vehicle Optional Extra
#  @regression
#  Scenario: Create the Horse Policy with the Senior Horse plan B and the Horse Trailer and Drown Vehicle Optional Extra
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the product and enter product details for Senior Horse Plan "B"
#    And Select the Horse senior plan B and the Horse Trailer and optional extra
#    And Enter the policy start date and questions related to Horse Trailer and Horse Drawn Vehicle and enter payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Trailer with senior horse Plan B
#
##   Policy creation with Standalone Horse Liability Plan £1,000,000 cover
#  @regression
#  Scenario: Create policy with the standalone Horse Liability product
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the Horse Liability product
#    And Verify the horse liability checkbox is selected and select cover of horse liability is "1M"
#    And Select cover start date and UW questions and payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Liability 1M cover
#
#  #   Policy creation with Standalone Horse Liability Plan £2,000,000 cover
#  @regression
#  Scenario: Create policy with the standalone Horse Liability product
#    When User clicks add quote button on manage quote page
#    And Select existing client and select the Horse Liability product
#    And Verify the horse liability checkbox is selected and select cover of horse liability is "2M"
#    And Select cover start date and UW questions and payment details and click on the create policy button
#    Then Verify the policy get created and appropriate policy premium and policy number get generated for Horse Liability 2M cover
