//package steps;
//
//import factory.DriverFactory;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import pages.PolicyCreationScenariosPage;
//import utils.Common;
//
//public class PolicyCreationScenariosStep {
//    Common common = new Common(DriverFactory.getDriver());
//
//    PolicyCreationScenariosPage policyCreationScenariosPage = new PolicyCreationScenariosPage(DriverFactory.getDriver());
//
//    @And("Enter client contact information and select {string} product then enter pet info and click on calculate button and Select appropriate policy plan and enter payment details Click on create policy button then Verify the policy details on policy information page")
//    public void enterClientContactInformationAndSelectProductThenEnterPetInfoAndClickOnCalculateButtonAndSelectAppropriatePolicyPlanAndEnterPaymentDetailsClickOnCreatePolicyButtonThenVerifyThePolicyDetailsOnPolicyInformationPage(String product) {
//        policyCreationScenariosPage.createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForExoticProduct(product);
//    }
//
//    @And("Enter client contact information and select product then enter pet information and select appropriate plan and enter payment details then click on create policy button and verify the policy details on policy information page")
//    public void enterClientContactInformationAndSelectProductThenEnterPetInformationAndSelectAppropriatePlanAndEnterPaymentDetailsThenClickOnCreatePolicyButtonAndVerifyThePolicyDetailsOnPolicyInformationPage() {
//        policyCreationScenariosPage.createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForCatProduct();
//    }
//
//    @And("Enter client contact information and select Dog product then enter pet information and select appropriate plan and enter payment details then click on create policy button and verify the policy details on policy information page")
//    public void enterClientContactInformationAndSelectDogProductThenEnterPetInformationAndSelectAppropriatePlanAndEnterPaymentDetailsThenClickOnCreatePolicyButtonAndVerifyThePolicyDetailsOnPolicyInformationPage() {
//        policyCreationScenariosPage.createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForDogProduct();
//    }
//
//    @And("Enter client contact information and select Horse product then enter pet information and select appropriate plan and enter payment details then click on create policy button and verify the policy details on policy information page")
//    public void enterClientContactInformationAndSelectHorseProductThenEnterPetInformationAndSelectAppropriatePlanAndEnterPaymentDetailsThenClickOnCreatePolicyButtonAndVerifyThePolicyDetailsOnPolicyInformationPage() {
//        policyCreationScenariosPage.createAndVerifyPoliciesWithMultipleSetOfDataAndCombinationOfPlanForHorseProduct();
//    }
//
////Create the Horse Policy with the Basic Horse plan and the Saddlery and Tack Optional Extra
//
//    @And("Select existing client and select the product and enter product details")
//    public void selectExistingClientAndSelectTheProductAndEnterProductDetails() {
//        policyCreationScenariosPage.selectExistingClientFromTheDropdown();
//    }
//
//    @And("Select the Basic plan and the Saddlery and Tack optional extra")
//    public void selectTheBasicPlanAndTheSaddleryAndTackOptionalExtra() {
//        policyCreationScenariosPage.selectHorseBasicPlanAndSaddleryAndTackOptionalExtra();
//    }
//
//    @And("Enter the policy start date and questions related to the Saddlery and Tack and enter payment details and click on the create policy button")
//    public void enterThePolicyStartDateAndQuestionsRelatedToTheSaddleryAndTackAndEnterPaymentDetailsAndClickOnTheCreatePolicyButton() {
//        policyCreationScenariosPage.enterCoverStartDateAndQuestionaryForTheSaddleryAndTackPlan();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGenerated() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("302.33");
//    }
//
//    //Create the Horse Policy with the Basic Horse plan and the Horse Trailers and Horse Drawn Vehicles Optional Extra
//
//    @And("Select the Basic plan and the Horse Trailers and Horse Drawn Vehicles Optional Extra")
//    public void selectTheBasicPlanAndTheHorseTrailersAndHorseDrawnVehiclesOptionalExtra() {
//        policyCreationScenariosPage.selectHorseBasicPlanAndHorseTrailersAndHorseDrawnVehiclesOptionalExtra();
//    }
//
//    @And("Enter the policy start date and questions related to Horse Trailer and Horse Drawn Vehicle and enter payment details and click on the create policy button")
//    public void enterThePolicyStartDateAndQuestionsRelatedToHorseTrailerAndHorseDrawnVehicleAndEnterPaymentDetailsAndClickOnTheCreatePolicyButton() {
//        policyCreationScenariosPage.enterCoverStartDateAndQuestionaryForTheHorseTrailersAndHorseDrawnVehiclePlan();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Trailer")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseAndVehicle() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("409.01");
//    }
//
//    @And("Select existing client and select the product and enter product details for Senior Horse Plan {string}")
//    public void selectExistingClientAndSelectTheProductAndEnterProductDetailsForSeniorHorsePlan(String seniorHorsePlan) {
//        policyCreationScenariosPage.selectExistingClientFromTheDropdownAndEnterDetailsForSeniorHorsePlan(seniorHorsePlan);
//    }
//
//    @And("Select the Horse senior plan A and the Saddlery and Tack optional extra")
//    public void selectTheHorseSeniorPlanAAndTheSaddleryAndTackOptionalExtra() {
//        policyCreationScenariosPage.selectHorseSeniorPlanAndSaddleryAndTackOptionalExtra();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Saddlery with senior horse")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseSaddleryWithSeniorHorse() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("303.80");
//    }
//
//    @And("Select the Horse senior plan A and the Horse Trailer and optional extra")
//    public void selectTheHorseSeniorPlanAAndTheHorseTrailerAndOptionalExtra() {
//        policyCreationScenariosPage.selectHorseSeniorPlanAndHorseTrailerAndDrownVehicleOptionalExtra();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Trailer with senior horse")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseTrailerWithSeniorHorse() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("481.32");
//    }
//
//    @And("Select the Horse senior plan B and the Saddlery and Tack optional extra")
//    public void selectTheHorseSeniorPlanBAndTheSaddleryAndTackOptionalExtra() {
//        policyCreationScenariosPage.selectHorseSeniorPlanBAndSaddleryAndTackOptionalExtra();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Saddlery with senior horse Plan B")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseSaddleryWithSeniorHorsePlanB() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("331.80");
//    }
//
//    @And("Select the Horse senior plan B and the Horse Trailer and optional extra")
//    public void selectTheHorseSeniorPlanBAndTheHorseTrailerAndOptionalExtra() {
//        policyCreationScenariosPage.selectHorseSeniorPlanBAndHorseTrailerAndDrownVehicleOptionalExtra();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Trailer with senior horse Plan B")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseTrailerWithSeniorHorsePlanB() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("509.32");
//    }
//
//    @And("Select existing client and select the Horse Liability product")
//    public void selectExistingClientAndSelectTheHorseLiabilityProduct() {
//        policyCreationScenariosPage.selectHorseLiabilityProduct();
//    }
//
//    @And("Verify the horse liability checkbox is selected and select cover of horse liability is {string}")
//    public void verifyTheHorseLiabilityCheckboxIsSelectedAndSelectCoverOfHorseLiability(String coverLevel) {
//        policyCreationScenariosPage.verifyTheHorseLiabilityPlanIsSelected(coverLevel);
//    }
//
//    @And("Select cover start date and UW questions and payment details and click on the create policy button")
//    public void selectCoverStartDateAndUWQuestionsAndPaymentDetailsAndClickOnTheCreatePolicyButton() {
//        policyCreationScenariosPage.selectCoverStartDateAndEnterUWQuestionsEnterPaymentDetailsAndClickOnCreatePolicy();
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Liability 1M cover")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseLiability() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("54.60");
//    }
//
//    @Then("Verify the policy get created and appropriate policy premium and policy number get generated for Horse Liability 2M cover")
//    public void verifyThePolicyGetCreatedAndAppropriatePolicyPremiumAndPolicyNumberGetGeneratedForHorseLiability2MCover() {
//        policyCreationScenariosPage.verifyThePolicyInformationAndPolicyPremiumOnPolicyInformationPage("77.00");
//    }
//}
