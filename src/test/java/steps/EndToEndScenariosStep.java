//package steps;
//
//import factory.DriverFactory;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import pages.EndToEndScenariosPage;
//
//public class EndToEndScenariosStep {
//    EndToEndScenariosPage endToEndScenariosPage = new EndToEndScenariosPage(DriverFactory.getDriver());
//
//    String exoticQuoteNumber;
//    String exoticPolicyNumber;
//
//    String catQuoteNumber;
//    String catPolicyNumber;
//
//    String dogQuoteNumber;
//    String dogPolicyNumber;
//
//    String horseQuoteNumber;
//    String horsePolicyNumber;
//
//    String seniorHorseQuoteNumber;
//    String seniorHorsePolicyNumber;
//
//    String horseLiabilityCoverQuoteNumber;
//    String horseLiabilityCoverPolicyNumber;
//
//    String horseSaddleryQuoteNumber;
//    String horseSaddleryPolicyNumber;
//
//    String horseTrailerQuoteNumber ;
//    String horseTrailerPolicyNumber = "HERN-00011-HTHDV-00000002";
//
////    Verify the end to end scenario of the Exotic
//
//    @Given("Add quote and Enter the client details")
//    public void addQuoteAndEnterTheClientDetails() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetails(26, "Exotic");
//    }
//
//    @When("Select Exotic product and enter pet details")
//    public void selectExoticProductAndEnterPetDetails() {
//        endToEndScenariosPage.selectExoticProductAndEnterPetDetails();
//    }
//
//    @And("Select Plan and save quote and get Quote Number")
//    public void selectPlanAndSaveQuoteAndGetQuoteNumber() {
//        exoticQuoteNumber = endToEndScenariosPage.selectPlanAndSaveQuoteAndGetQuoteNumber();
//    }
//
//    @And("Search and Edit the same quote and save application by entering underwriting questions and Direct debit payment details")
//    public void searchAndEditTheSameQuoteAndSaveApplicationByEnteringUnderwritingQuestionsAndPaymentDetails() {
//        endToEndScenariosPage.editTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(exoticQuoteNumber);
//    }
//
//    @And("Create policy by using the same quote number and get policy number")
//    public void createPolicyByUsingTheSameQuoteNumberAndGetPolicyNumber() {
//        exoticPolicyNumber = endToEndScenariosPage.createPolicyByEditingSameQuoteAndGetPolicyNumber();
//    }
//
//    @And("Go to the instalment tab and pay the premium of first instalment using Pay now link of Exotic policy")
//    public void goToTheInstalmentTabAndPayThePremiumUsingPayNowLinkOfFirstInstalment() {
//        endToEndScenariosPage.payTheFirstInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Click on the Cog icon on the policy information page and add allocate payment")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePayment() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(exoticPolicyNumber);
//    }
//
//    @And("Click on the Cog icon on the policy information page and add endorsement")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsement() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsement(exoticPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndEnterClaimAmountLessThanExcessAndVerifyTheClaimGetDeclined() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclined(exoticPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and decline the claim")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaim() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnThePolicyAndDeclineTheClaim(exoticPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and settle the claim with EFT payment")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndSettleTheClaimWithEFTPayment() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnThePolicyAndSettleTheClaim(exoticPolicyNumber);
//    }
//
//    @And("Renew the policy and verify the policy status")
//    public void renewThePolicyOfExoticProduct() {
//        endToEndScenariosPage.renewThePolicyOfExoticProduct(exoticPolicyNumber);
//    }
//
//    @And("Cancel the policy and verify the policy status")
//    public void cancelThePolicy() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(exoticPolicyNumber);
//    }
//
////    Verify the end to end scenario of the Cat
//
//    @Given("Add quote and Enter the client details for cat")
//    public void addQuoteAndEnterTheClientDetailsForCat() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetails(7, "Cat");
//    }
//
//    @When("Select Cat product and enter the pet details")
//    public void selectCatProductAndEnterThePetDetails() {
//        endToEndScenariosPage.selectCatProductAndEnterPetDetails();
//    }
//
//    @And("Select Plan and save the quote of cat and Get quote number")
//    public void selectPlanAndSaveTheQuoteOfCatAndGetQuoteNumber() {
//        catQuoteNumber = endToEndScenariosPage.selectPlanAndSaveQuoteAndGetTheQuoteNumber();
//    }
//
//    @And("Search and edit the quote number and save application by entering UW questions and Credit card payment details")
//    public void searchAndEditTheQuoteNumberAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails() {
//        endToEndScenariosPage.editTheQuoteAndSaveApplicationByEnteringUWQuestions(catQuoteNumber);
//    }
//
//    @And("Create policy by editing the same quote number and get the policy number")
//    public void createPolicyByEditingTheSameQuoteNumberAndGetThePolicyNumber() {
//        catPolicyNumber = endToEndScenariosPage.createPolicyByEditingSameQuoteOfCatAndGetPolicyNumber();
//    }
//
//    @And("Go to the instalment tab and pay the premium of second instalment using Pay now link of Cat policy")
//    public void goToTheInstalmentTabAndPayThePremiumUsingPayNowLink() {
//        endToEndScenariosPage.payTheInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Click on the Cog icon on the policy information page and add allocate payment on Cat policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePaymentOnCatPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(catPolicyNumber);
//    }
//
//    @And("Click on the Cog icon on the policy information page and add endorsement of Cat policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsementOfCatPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOfCatPolicy(catPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined of Cat Policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndEnterClaimAmountLessThanExcessAndVerifyTheClaimGetDeclinedOfCatPolicy() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfCatPolicy(catPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and decline the claim of Cat policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndDeclineTheClaimOfCatPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnThePolicyAndDeclineTheClaimForCat(catPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and settle the claim with Cheque Payment")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndSettleTheClaimWithChequePayment() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnThePolicyAndSettleTheClaimWithChequePayment(catPolicyNumber);
//    }
//
//    @And("Renew the policy and verify the policy status of Cat policy")
//    public void renewThePolicyAndVerifyThePolicyStatusOfCatPolicy() {
//        endToEndScenariosPage.renewTheCatPolicyAndVerifyStatus(catPolicyNumber);
//    }
//
//    @And("Cancel the policy and verify the policy status of Cat policy")
//    public void cancelThePolicyAndVerifyThePolicyStatusOfCatPolicy() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(catPolicyNumber);
//    }
//
////    Verify the end to end scenario of the Dog
//
//    @Given("Add quote and Enter the client details for Dog")
//    public void addQuoteAndEnterTheClientDetailsForDog() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetailsForDogQuote(11, "Dog");
//    }
//
//    @When("Select Dog product and enter the pet details")
//    public void selectDogProductAndEnterThePetDetails() {
//        endToEndScenariosPage.selectDogProductAndEnterPetDetails();
//    }
//
//    @And("Select dog plan and save the quote and get quote number")
//    public void selectDogPlanAndSaveTheQuoteAndGetQuoteNumber() {
//        dogQuoteNumber = endToEndScenariosPage.selectDogPlanAndSaveTheQuoteAndGetQuoteNumber();
//    }
//
//    @And("Search and edit the dog quote number and save application by entering UW questions and Direct debit payment details")
//    public void searchAndEditTheDogQuoteNumberAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails() {
//        endToEndScenariosPage.editTheDogQuoteAndSaveApplicationByEnteringUWQuestions(dogQuoteNumber);
//    }
//
//    @And("Create policy by editing the same quote of dog and get the policy number")
//    public void createPolicyByEditingTheSameQuoteOfDogAndGetThePolicyNumber() {
//        dogPolicyNumber = endToEndScenariosPage.createPolicyByEditingTheDogQuoteNumberAndGetPolicyNumber();
//    }
//
//    @And("Go to the instalment tab and pay the premium of first instalment using Pay Now link of Dog policy")
//    public void goToTheInstalmentTabAndPayThePremiumUsingPayNowLinkUsingDirectDebitPaymentMethod() {
//        endToEndScenariosPage.payTheFirstInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Click on the Cog icon on the policy information page and add allocate payment on the Dog policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePaymentOnTheDogPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(dogPolicyNumber);
//    }
//
//    @And("Click on the Cog icon on the policy information page and add endorsement of Dog Policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsementOfDogPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOfDogPolicy(dogPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined of Dog Policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndEnterClaimAmountLessThanExcessAndVerifyTheClaimGetDeclinedOfDogPolicy() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfDogPolicy(dogPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and decline the claim of Dog policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndDeclineTheClaimOfDogPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheDogPolicyAndDeclineTheClaim(dogPolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and settle the claim with EFT payment method")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndSettleTheClaimWithEFTPaymentMethod() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheDogPolicyAndSettleTheClaim(dogPolicyNumber);
//    }
//
//    @And("Renew the policy and verify the policy status of Dog policy")
//    public void renewThePolicyAndVerifyThePolicyStatusOfDogPolicy() {
//        endToEndScenariosPage.renewTheDogPolicyAndVerifyTheStatus(dogPolicyNumber);
//
//    }
//
//    @And("Cancel the policy and verify the policy status of Dog policy")
//    public void cancelThePolicyAndVerifyThePolicyStatusOfDogPolicy() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(dogPolicyNumber);
//    }
//
////    Verify the end to end scenario of the Horse
//
//    @Given("Add quote and enter client details for the Horse")
//    public void addQuoteAndEnterClientDetailsForTheHorse() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetailsForHorseQuote(2, "Horse");
//    }
//
//    @When("Select Horse product and enter the pet details")
//    public void selectHorseProductAndEnterThePetDetails() {
//        endToEndScenariosPage.selectHorseProductAndEnterPetInformation();
//    }
//
//    @And("Select horse insurance basic plan with optional extra and save the quote and get quote number")
//    public void selectHorseInsuranceBasicPlanWithOptionalExtraAndSaveTheQuoteAndGetQuoteNumber() {
//        horseQuoteNumber = endToEndScenariosPage.selectHorseBasicInsurancePlanWithOptionalExtrasAndSaveQuote();
//    }
//
//    @And("Search and edit the horse quote and save application by entering UW questions and Direct debit payment details")
//    public void searchAndEditTheHorseQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails() {
//        endToEndScenariosPage.editTheHorseQuoteAndSaveApplicationByEnteringUWQuestions(horseQuoteNumber);
//    }
//
//    @And("Create policy by editing the same quote of Horse and get the policy number")
//    public void createPolicyByEditingTheSameQuoteOfHorseAndGetThePolicyNumber() {
//        horsePolicyNumber = endToEndScenariosPage.createPolicyByEditingTheHorseQuoteNumberAndGetPolicyNumber();
//    }
//
//    @And("Go to the instalment tab and pay the premium of first instalment using Pay Now link of Horse Policy")
//    public void goToTheInstalmentTabAndPayThePremiumOfFirstInstalmentUsingPayNowLinkOfHorsePolicy() {
//        endToEndScenariosPage.payTheFirstInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Click on the Cog icon on the policy information page and add allocate payment on the Horse policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePaymentOnTheHorsePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(horsePolicyNumber);
//    }
//
//    @And("Click on the Cog icon on the policy information page and add endorsement of Horse Policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsementOfHorsePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOfHorsePolicy(horsePolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and Enter claim amount less than Excess and verify the claim get declined of Horse Policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndEnterClaimAmountLessThanExcessAndVerifyTheClaimGetDeclinedOfHorsePolicy() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorsePolicy(horsePolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and decline the claim of Horse policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndDeclineTheClaimOfHorsePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorsePolicyAndDeclineTheClaim(horsePolicyNumber);
//    }
//
//    @And("Click on the cog icon on the Horse policy information page and add claim and settle the claim with EFT payment method")
//    public void clickOnTheCogIconOnTheHorsePolicyInformationPageAndAddClaimAndSettleTheClaimWithEFTPaymentMethod() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorsePolicyAndSettleTheClaim(horsePolicyNumber);
//    }
//
//    @And("Renew the policy and verify the policy status of Horse policy")
//    public void renewThePolicyAndVerifyThePolicyStatusOfHorsePolicy() {
//        endToEndScenariosPage.renewTheHorsePolicyAndVerifyTheStatus(horsePolicyNumber);
//    }
//
//    @And("Cancel the policy and verify the policy status of Horse policy")
//    public void cancelThePolicyAndVerifyThePolicyStatusOfHorsePolicy() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(horsePolicyNumber);
//    }
//
////    Verify the end to end scenario of the Senior Horse
//
//    @Given("Add quote and enter client details for the senior Horse")
//    public void addQuoteAndEnterClientDetailsForTheSeniorHorse() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetailsForSeniorHorseQuote(22, "Horse");
//    }
//
//    @When("Select Horse product and enter the pet details of senior horse")
//    public void selectHorseProductAndEnterThePetDetailsOfSeniorHorse() {
//        endToEndScenariosPage.selectHorseProductAndEnterPetInformationOfSeniorHorse();
//    }
//
//    @And("Select senior horse insurance B with optional extra and save the quote and get quote number")
//    public void selectSeniorHorseInsuranceBWithOptionalExtraAndSaveTheQuoteAndGetQuoteNumber() {
//        seniorHorseQuoteNumber = endToEndScenariosPage.selectSeniorHorseBInsurancePlanWithOptionalExtrasAndSaveQuote();
//    }
//
//    @And("Search and edit the senior horse quote and save application by entering UW questions and Credit card payment details")
//    public void searchAndEditTheSeniorHorseQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails() {
//        endToEndScenariosPage.editTheQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(seniorHorseQuoteNumber);
//    }
//
//    @And("Create policy by editing the same quote of senior Horse and get the policy number")
//    public void createPolicyByEditingTheSameQuoteOfSeniorHorseAndGetThePolicyNumber() {
//        seniorHorsePolicyNumber = endToEndScenariosPage.createPolicyByEditingTheSeniorHorseQuoteNumberAndGetPolicyNumber();
//    }
//
//    @And("Go to the instalment tab and pay the premium of first instalment using Pay Now link of Senior Horse")
//    public void goToTheInstalmentTabAndPayThePremiumOfFirstInstalmentUsingPayNowLink() {
//        endToEndScenariosPage.payTheInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Click on the Cog icon on the policy information page and add allocate payment on the Senior Horse policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePaymentOnTheSeniorHorsePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(seniorHorsePolicyNumber);
//    }
//
//    @And("Click on the Cog icon on the policy information page and add endorsement of Senior Horse Policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsementOfSeniorHorsePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOnSeniorHorsePolicy(seniorHorsePolicyNumber);
//    }
//
//    @And("Add claim and enter claim amount less than the excess amount and verify the claim gets auto decline for senior horse")
//    public void addClaimAndEnterClaimAmountLessThanTheExcessAmountAndVerifyTheClaimGetsAutoDeclineForSeniorHorse() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfSeniorHorsePolicy(seniorHorsePolicyNumber);
//    }
//
//    @And("Click on the cog icon on the policy information page and add claim and decline the claim by Admin user of Senior Horse policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddClaimAndDeclineTheClaimByAdminUserOfSeniorHorsePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheSeniorHorsePolicyAndDeclineTheClaimByAdminUser(seniorHorsePolicyNumber);
//    }
//
//    @And("Click on the cog icon on the Senior Horse policy information page and add claim and settle the claim with Cheque Payment")
//    public void clickOnTheCogIconOnTheSeniorHorsePolicyInformationPageAndAddClaimAndSettleTheClaimWithChequePayment() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheSeniorHorsePolicyAndSettleTheClaimWithChequePayment(seniorHorsePolicyNumber);
//    }
//
//    @And("Renew the policy and verify the policy status of Senior Horse policy")
//    public void renewThePolicyAndVerifyThePolicyStatusOfSeniorHorsePolicy() {
//        endToEndScenariosPage.renewTheSeniorHorsePolicyAndVerifyTheStatus(seniorHorsePolicyNumber);
//    }
//
//    @And("Cancel the policy and verify the policy status of Senior Horse policy")
//    public void cancelThePolicyAndVerifyThePolicyStatusOfSeniorHorsePolicy() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(seniorHorsePolicyNumber);
//    }
//
////    Verify the end to end scenario of the Horse Liability cover
//
//    @Given("Click on Add quote button and enter client details")
//    public void clickOnAddQuoteButtonAndEnterClientDetailsForTheHorseLiabilityCover() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetailsOfHorseLiability(28, "Horse");
//    }
//
//    @When("Select Horse liability cover option and enter the required details")
//    public void selectHorseLiabilityCoverOptionAndEnterTheRequiredDetails() {
//        endToEndScenariosPage.selectHorseProductAndEnterPetInformationOfHorseLiability();
//    }
//
//    @And("Verify the Liability plan is selected and save the quote and get quote number")
//    public void verifyTheLiabilityPlanIsSelectedAndSaveTheQuoteAndGetQuoteNumber() {
//        horseLiabilityCoverQuoteNumber = endToEndScenariosPage.verifyTheHorseLiabilityPlanIsSelectedAndSaveQuoteAndGetQuoteNumber();
//    }
//
//    @And("Search and edit the same quote and save application by entering UW questions and Direct debit payment details")
//    public void searchAndEditTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndDirectDebitPaymentDetails() {
//        endToEndScenariosPage.editTheLiabilityQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(horseLiabilityCoverQuoteNumber);
//    }
//
//    @And("Create policy by editing the same quote of Horse liability and get the policy number")
//    public void createPolicyByEditingTheSameQuoteOfHorseLiabilityAndGetThePolicyNumber() {
//        horseLiabilityCoverPolicyNumber = endToEndScenariosPage.createPolicyByEditingTheHorseLiabilityQuoteNumberAndGetPolicyNumber();
//    }
//
//    @And("Go to the instalment tab and pay the premium of first instalment using Pay Now link of Horse Liability")
//    public void goToTheInstalmentTabAndPayThePremiumOfFirstInstalmentUsingPayNowLinkOfHorseLiability() {
//        endToEndScenariosPage.payTheFirstInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Click on the Cog icon on the Policy information page and add allocate payment on the Horse Liability cover policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddAllocatePaymentOnTheHorseLiabilityCoverPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(horseLiabilityCoverPolicyNumber);
//    }
//
//    @And("Click on the Cog icon on the Policy information page and add endorsement on the Horse Liability cover policy")
//    public void clickOnTheCogIconOnThePolicyInformationPageAndAddEndorsementOnTheHorseLiabilityCoverPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOnHorseLiabilityPolicy(horseLiabilityCoverPolicyNumber);
//    }
//
//    @And("Add claim and enter claim amount less than the excess amount and verify the claim gets auto declined for Horse Liability cover")
//    public void addClaimAndEnterClaimAmountLessThanTheExcessAmountAndVerifyTheClaimGetsAutoDeclinedForHorseLiabilityCover() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorseLiabilityPolicy(horseLiabilityCoverPolicyNumber);
//    }
//
//    @And("Add claim and decline the claim by the admin user and verify the claim status is declined")
//    public void addClaimAndDeclineTheClaimByTheAdminUserAndVerifyTheClaimStatusIsDeclined() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorseLiabilityPolicyAndDeclineTheClaim(horseLiabilityCoverPolicyNumber);
//    }
//
//    @And("Add claim and Settle the claim with the Electronic Fund Transfer payment")
//    public void addClaimAndSettleTheClaimWithTheElectronicFundTransferPayment() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorseLiabilityPolicyAndSettleTheClaim(horseLiabilityCoverPolicyNumber);
//    }
//
//    @And("Renew the policy and verify the policy status of Horse Liability cover policy")
//    public void renewThePolicyAndVerifyThePolicyStatusOfHorseLiabilityCoverPolicy() {
//        endToEndScenariosPage.renewTheHorseLiabilityPolicyAndVerifyTheStatus(horseLiabilityCoverPolicyNumber);
//    }
//
//    @And("Cancel the policy and verify the policy status of the Horse Liability cover policy")
//    public void cancelThePolicyAndVerifyThePolicyStatusOfTheHorseLiabilityCoverPolicy() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(horseLiabilityCoverPolicyNumber);
//    }
//
////    Verify the end to end scenario of the Horse Saddlery and Tack
//
//    @Given("Click on the add quote button and enter the client details")
//    public void clickOnTheQuoteButtonAndEnterTheClientDetails() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetailsOfHorseSaddleryAndTack(30, "Horse");
//    }
//
//    @When("Select Horse product and select Saddlery and Tack product")
//    public void selectHorseProductAndSelectSaddleryAndTackProduct() {
//        endToEndScenariosPage.selectHorseSaddleryAndTackProduct();
//    }
//
//    @And("Enter Saddlery current market value and save quote by verifying Saddlery Plan is selected on cover table")
//    public void enterSaddleryCurrentMarketValueAndSaveQuoteByVerifyingSaddleryPlanIsSelectedOnCoverTable() {
//        horseSaddleryQuoteNumber = endToEndScenariosPage.enterHorseSaddleryCurrentMarketValueAndSaveQuote(30);
//    }
//
//    @And("Search and edit the same quote and save application by entering UW questions and Credit card payment method")
//    public void searchAndEditTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndCreditCardPaymentMethod() {
//        endToEndScenariosPage.editTheSaddleryQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(horseSaddleryQuoteNumber);
//    }
//
//    @And("Create policy of the Saddlery and tack by editing saved application")
//    public void createPolicyOfTheSaddleryAndTackByEditingSavedApplication() {
//        horseSaddleryPolicyNumber = endToEndScenariosPage.createPolicyByEditingTheHorseSaddleryQuoteNumberAndGetPolicyNumber();
//    }
//
//    @And("Go to instalment tab and pay the premium of the second instalment using Pay Now link of Saddlery policy")
//    public void goToInstalmentTabAndPayThePremiumOfTheSecondInstalmentUsingPayNowLinkOfSaddleryPolicy() {
//        endToEndScenariosPage.payTheInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Apply add allocate payment on the policy")
//    public void applyAddAllocatePaymentOnThePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(horseSaddleryPolicyNumber);
//    }
//
//    @And("Apply endorsement on the Horse Saddlery and Tack policy")
//    public void applyEndorsementOnTheHorseSaddleryAndTackPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOnHorseSaddleryAndTackPolicy(horseSaddleryPolicyNumber);
//    }
//
//    @And("Add claim on the policy verify the claim gets auto decline due to claim amount is less than the excess value")
//    public void addClaimOnThePolicyVerifyTheClaimGetsAutoDeclineDueToClaimAmountIsLessThanTheExcessValue() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorseSaddleryPolicy(horseSaddleryPolicyNumber);
//    }
//
//    @And("Add claim on the  policy and decline the claim by admin user")
//    public void addClaimOnThePolicyAndDeclineTheClaimByAdminUser() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorseSaddleryPolicyAndDeclineTheClaim(horseSaddleryPolicyNumber);
//    }
//
//    @And("Add claim on the policy and Authorise Approve and settle the claim using cheque payment method")
//    public void addClaimOnThePolicyAndAuthoriseApproveAndSettleTheClaimUsingChequePaymentMethod() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorseSaddleryPolicyAndSettleTheClaim(horseSaddleryPolicyNumber);
//    }
//
//    @And("Verify the Renew policy and renewed policy status of Horse saddlery and tack")
//    public void verifyTheRenewPolicyAndRenewedPolicyStatusOfHorseSaddleryAndTack() {
//        endToEndScenariosPage.renewTheHorseSaddleryPolicyAndVerifyTheStatus(horseSaddleryPolicyNumber);
//    }
//
//    @And("Verify the Cancel policy and cancelled policy status of Horse saddlery and tack")
//    public void verifyTheCancelPolicyAndCancelledPolicyStatusOfHorseSaddleryAndTack() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(horseSaddleryPolicyNumber);
//    }
//
////    Verify the end to end scenario of the Horse Trailer and drown vehicle
//
//    @Given("Click on the Add quote button and enter the client details")
//    public void clickOnTheAddQuoteButtonAndEnterTheClientDetails() {
//        endToEndScenariosPage.clickOnAddQuoteButtonAndEnterClientDetailsForTheHorseTrailerAndDrownVehicle(31, "Horse");
//    }
//
//    @When("Select Horse product and select Horse Trailer and drown vehicle")
//    public void selectHorseProductAndSelectHorseTrailerAndDrownVehicle() {
//        endToEndScenariosPage.selectHorseTrailerAndDrownVehicleProduct();
//    }
//
//    @And("Enter Trailer current market value and save quote by verifying Trailer Plan is selected on cover table")
//    public void enterTrailerCurrentMarketValueAndSaveQuoteByVerifyingTrailerPlanIsSelectedOnCoverTable() {
//        horseTrailerQuoteNumber = endToEndScenariosPage.enterHorseTrailerCurrentMarketValueAndSaveQuote(31);
//    }
//
//    @And("Search and edit the same quote and save application by entering UW questions and Direct debit payment method")
//    public void searchAndEditTheSameQuoteAndSaveApplicationByEnteringUWQuestionsAndDirectDebitPaymentMethod() {
//        endToEndScenariosPage.editTheHorseTrailerQuoteAndSaveApplicationByEnteringUWQuestionsAndPaymentDetails(horseTrailerQuoteNumber);
//    }
//
//    @And("Create policy of the Trailer and drown vehicle by editing saved application")
//    public void createPolicyOfTheTrailerAndDrownVehicleByEditingSavedApplication() {
//        horseSaddleryPolicyNumber = endToEndScenariosPage.createPolicyByEditingTheHorseTrailerQuoteNumberAndGetPolicyNumber();
//    }
//
//    @And("Go to instalment tab and pay the premium of the first instalment using Pay Now link of Trailer policy")
//    public void goToInstalmentTabAndPayThePremiumOfTheSecondInstalmentUsingPayNowLinkOfTrailerPolicy() {
//        endToEndScenariosPage.payTheFirstInstallmentsUsingPayNowButtonInInstallmentTab();
//    }
//
//    @And("Apply add allocate payment on the Horse trailer policy")
//    public void applyAddAllocatePaymentOnTheHorseTrailerPolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddAllocatePaymentByBankTransfer(horseTrailerPolicyNumber);
//    }
//
//    @And("Apply endorsement on the Horse Trailer and Drown vehicle policy")
//    public void applyEndorsementOnTheHorseTrailerAndDrownVehiclePolicy() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddEndorsementOnHorseTrailerAndDrownVehiclePolicy(horseTrailerPolicyNumber);
//    }
//
//    @And("Add claim on the Horse Trailer policy verify the claim gets auto decline due to claim amount is less than the excess value")
//    public void addClaimOnTheHorseTrailerPolicyVerifyTheClaimGetsAutoDeclineDueToClaimAmountIsLessThanTheExcessValue() {
//        endToEndScenariosPage.addClaimAndEnterClaimAmountLessThanExcessAmountAndVerifyClaimStatusIsDeclinedOfHorseTrailerPolicy(horseTrailerPolicyNumber);
//    }
//
//    @And("Add claim on the  Horse Trailer policy and decline the claim by admin user")
//    public void addClaimOnTheHorseTrailerPolicyAndDeclineTheClaimByAdminUser() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorseTrailerPolicyAndDeclineTheClaim(horseTrailerPolicyNumber);
//    }
//
//    @And("Add claim on the Horse Trailer policy and Authorise Approve and settle the claim using EFT payment method")
//    public void addClaimOnTheHorseTrailerPolicyAndAuthoriseApproveAndSettleTheClaimUsingChequePaymentMethod() {
//        endToEndScenariosPage.clickOnTheCogIconAndAddClaimOnTheHorseTrailerPolicyAndSettleTheClaim(horseTrailerPolicyNumber);
//    }
//
//    @And("Verify the Renew policy and renewed policy status of Horse Trailer and Drown vehicle")
//    public void verifyTheRenewPolicyAndRenewedPolicyStatusOfHorseTrailerAndDrownVehicle() {
//        endToEndScenariosPage.renewTheHorseTrailerPolicyAndVerifyTheStatus(horseTrailerPolicyNumber);
//    }
//
//    @And("Verify the Cancel policy and cancelled policy status of Horse Trailer and Drown vehicle")
//    public void verifyTheCancelPolicyAndCancelledPolicyStatusOfHorseTrailerAndDrownVehicle() {
//        endToEndScenariosPage.verifyTheCancelThePolicy(horseTrailerPolicyNumber);
//    }
//}
