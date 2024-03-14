package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utils.ScreenRecorderUtil;

public class DashBoardPageSteps {
    ClientPage clientPage=new ClientPage(DriverFactory.getDriver());
    ManageClaimPage manageClaimPage=new ManageClaimPage(DriverFactory.getDriver());
    DashBoardPage dbp=new DashBoardPage(DriverFactory.getDriver());

    @Then("Dash board page displays with total and monthly numbers of client,quote,policy and claim")
    public void dash_board_page_displays_with_total_and_monthly_numbers_of_client_quote_policy_and_claim() {
        String itemsDetails = dbp.verifyClientDetails();
        String itemDetail[] = itemsDetails.split("\s");
        int aLength = itemDetail.length;
        for (int i = 0; i < aLength; i++) {
            if (itemDetail[i].length()>0) {
                System.out.println(itemDetail[i]);
            } else if (itemDetail[i].length()>0) {
                System.out.println(itemDetail[i]);
            } else if (itemDetail[i].length()>0) {
                System.out.println(itemDetail[i]);

            } else {
                Assert.fail();
            }
        }
        String quoteDetails = dbp.verifyQuote();
        System.out.println(quoteDetails);
        String quoteDetail[] = quoteDetails.split("\s");
        int qLength = quoteDetail.length;
        for (int i = 0; i < qLength; i++) {
            if (quoteDetail[i].length() > 0) {
                System.out.println(quoteDetail[i]);
            } else if (quoteDetail[i].length() > 0) {
                System.out.println(quoteDetail[i]);
            } else if (quoteDetail[i].length() > 0) {
                System.out.println(quoteDetail[i]);

            } else {
                Assert.fail();
            }
        }

        String policyDetails = dbp.verifyPolicy();
        String policyDetail[] = policyDetails.split("\s");
        int pLength = policyDetail.length;
        for (int i = 0; i < pLength; i++) {
            if (policyDetail[i].length()>0) {
                System.out.println(policyDetail[i]);
            } else if (policyDetail[i].length()>0) {
                System.out.println(policyDetail[i]);
            } else if (policyDetail[i].length()>0) {
                System.out.println(policyDetail[i]);

            } else {
                Assert.fail();
            }
        }

        String claimDetails = dbp.verifyClaims();
        String claimDetail[] = claimDetails.split("\s");
        int cLength = claimDetail.length;
        for (int i = 0; i < cLength; i++) {
            if (claimDetail[i].length()>0) {
                System.out.println(claimDetail[i]);
            } else if (claimDetail[i].length()>0) {
                System.out.println(claimDetail[i]);
            } else if (claimDetail[i].length()>0) {
                System.out.println(claimDetail[i]);

            } else {
                Assert.fail();
            }
        }
    }
    String clientName = "";

    @When("User get client code from the client list in manage client page")
    public void get_Client_Code_From_The_Client_List_In_Manage_Client_Page() {
        String manageClientText = clientPage.verifyClientManage();
        Assert.assertEquals(manageClientText, "Manage Client", "Manage client text mismatched");
        clientName = dbp.getTheClientNameFromList();
    }

    @And("Search the same client in the global search on dashboard and click on the go button")
    public void searchTheSameClientInTheGlobalSearchOnDashboardAndClickOnTheGoButton() {
        dbp.clickOnTheDashboardIcon();
        dbp.searchTheClientNameInGlobalSearch(clientName);
        System.out.println("Searched client name: " + clientName);
    }

    @Then("User will redirects to manage client page and verify the searched result")
    public void userWillRedirectsToManageClientPageAndVerifyTheSearchedResult() {
        String listOfSearchedClient = dbp.verifyTheSearchedResultOfClientGlobalSearch();
        System.out.println("Global search result: " + listOfSearchedClient);
        if (!listOfSearchedClient.isEmpty()) {
            Assert.assertTrue(listOfSearchedClient.contains(clientName));
        } else System.out.println("Searched client name not found");
    }

    String policyNumber = "";

    @When("User get policy number from the list of policy in the manage policy page")
    public void userGetPolicyNumberFromTheListOfPolicyInTheManagePolicyPage() {
        clientPage.clickOnPolicyIcon();
        policyNumber = dbp.getThePolicyNumberFromManagePolicyPage();
    }

    @And("Search the same policy in the global search on dashboard and click on the got button")
    public void searchTheSamePolicyInTheGlobalSearchOnDashboardAndClickOnTheGotButton() {
        dbp.clickOnTheDashboardIcon();
        dbp.searchThePolicyNumberInGlobalSearch(policyNumber);
        System.out.println("Searched policy number: " + policyNumber);

    }

    @Then("User will redirects to manage policy page and should able to verify the searched result")
    public void userWillRedirectsToManagePolicyPageAndShouldAbleToVerifyTheSearchedResult() {
        String listOfSearchedPolicy = dbp.verifyTheSearchedResultOfPolicy();
        System.out.println("Global search result: " + listOfSearchedPolicy);


        if (!listOfSearchedPolicy.isEmpty()) {
            Assert.assertTrue(listOfSearchedPolicy.contains(policyNumber));
        } else System.out.println("Searched policy number not found");
    }

    String claimNumber = "";

    @When("User get claim number from list of claim in manage claim page")
    public void userGetClaimNumberFromListOfClaimInManageClaimPage() {
        manageClaimPage.clickManageClaimIcon();
        claimNumber = dbp.getClaimNumberFromManageClaimPage();
    }

    @And("Search the same claim in the global search on dashboard and click on the got button")
    public void searchTheSameClaimInTheGlobalSearchOnDashboardAndClickOnTheGotButton() {
        dbp.clickOnTheDashboardIcon();
        dbp.searchTheClaimNumberInGlobalSearch(claimNumber);
        System.out.println("Searched claim number: " + claimNumber);
    }

    @Then("User will redirects to manage claims page and should able to verify the searched result")
    public void userWillRedirectsToManageClaimsPageAndShouldAbleToVerifyTheSearchedResult() {
        String listOfSearchedClaim = dbp.verifyTheSearchedResultOfClaim();
        System.out.println("Global search result claim number: " + listOfSearchedClaim);

        if (!listOfSearchedClaim.isEmpty()) {
            Assert.assertTrue(listOfSearchedClaim.contains(claimNumber));
        } else System.out.println("Searched claim number not found");
    }

    @Given("User import excel data")
    public void userImportExcelData() {
        dbp.readExcel();
    }
}
