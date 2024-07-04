package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.EndToEndScenariosPage;
import utils.Common;

public class EndToEndScenariosStep {
    Common common = new Common(DriverFactory.getDriver());
    EndToEndScenariosPage endToEndScenariosPage = new EndToEndScenariosPage(DriverFactory.getDriver());


    @Given("Add quote and Enter the client details")
    public void addQuoteAndEnterTheClientDetails() {
        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetails();
    }

    @When("Select Exotic product and enter pet details")
    public void selectExoticProductAndEnterPetDetails() {
        endToEndScenariosPage.selectExoticProductAndEnterPetDetails();
    }

    String exoticQuoteNumber;

    @And("Select Plan and save quote and get Quote Number")
    public void selectPlanAndSaveQuoteAndGetQuoteNumber() {
        exoticQuoteNumber = endToEndScenariosPage.selectPlanAndSaveQuoteAndGetQuoteNumber();
    }

    @And("Search and Edit the same quote and save application by entering underwriting questions and payment details")
    public void searchAndEditTheSameQuoteAndSaveApplicationByEnteringUnderwritingQuestionsAndPaymentDetails() {
        endToEndScenariosPage.editTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(exoticQuoteNumber);
    }

    String exoticPolicyNumber;
//    String exoticPolicyNumber = "FORT-0032-EBBPPR-00000001";


    @And("Create policy by using the same quote number and get policy number")
    public void createPolicyByUsingTheSameQuoteNumberAndGetPolicyNumber() {
        exoticPolicyNumber = endToEndScenariosPage.createPolicyByEditingSameQuoteAndGetPolicyNumber();
    }

    @And("Click on the Cog icon on the policy information page and add allocate payment")
    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePayment() {
        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePayment(exoticPolicyNumber);
    }

    @And("Click on the Cog icon on the policy information page and add endorsement")
    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsement() {
        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsement(exoticPolicyNumber);
    }

    @And("Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined")
    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndEnterClaimAmountLessThanExcessAndVerifyTheClaimGetDeclined() {
        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclined(exoticPolicyNumber);
    }

    @And("Click on the cog icon on the policy information page and add claim and decline the claim")
    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaim() {
        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnThePolicyAndDeclineTheClaim(exoticPolicyNumber);
    }

    @And("Click on the cog icon on the policy information page and add claim and settle the claim")
    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndSettleTheClaim() {
        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnThePolicyAndSettleTheClaim(exoticPolicyNumber);
    }

    @And("Renew the policy")
    public void renewThePolicy() {
        endToEndScenariosPage.renewThePolicy(exoticPolicyNumber);
    }

    @And("Cancel the policy")
    public void cancelThePolicy() {
        endToEndScenariosPage.cancelThePolicy(exoticPolicyNumber);
    }
}
