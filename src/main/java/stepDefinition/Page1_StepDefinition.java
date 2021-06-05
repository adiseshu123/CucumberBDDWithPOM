package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.BasePage;
import steps.Page1_Steps;

public class Page1_StepDefinition extends BasePage {

    Page1_Steps page1_steps = new Page1_Steps();

    @Before
    public void initBrowser() {
        openBrowser();
    }

    @After
    public void closeBrowser() {
        quitBrowser();
    }

    @Given("^User able to navigate to required URL$")
    public void user_able_to_navigate_to_required_URL() {
        page1_steps.openPage();
    }

    @Then("^User verifies values on the screen are greater than \"([^\"]*)\"$")
    public void user_verifies_values_on_the_screen_are_greater_than(String value) {
        page1_steps.verifyValuesGreaterThanGivenValue(Integer.parseInt(value));
    }

    @And("^User verifies total balance is current$")
    public void user_verifies_total_balance_is_current() {
        page1_steps.verifyTotalBalanceMatchesSumOfValues();
    }

    @And("^User verifies Currency is \"([^\"]*)\" for all the values$")
    public void user_verifies_Currency_is_for_all_the_values(String currencySymbol) {
        page1_steps.verifyCurrencyForAllValues(currencySymbol);
    }

}
