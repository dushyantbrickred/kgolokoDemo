package interview.stepDefs;

import Utils.Utils;
import interview.pageFactory.Home_Page;
import interview.pageFactory.Landing_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;


public class Arrange_items extends Utils{

    Landing_Page landingPage = new Landing_Page();
    Home_Page homePage = new Home_Page();

    @Given("^User site is loaded successfully$")
    public void user_site_is_loaded_successfully(){

    }

    @Given("^User enter username$")
    public void user_enter_username(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.username.sendKeys("standard_user");
    }

    @Given("^User enter password$")
    public void user_enter_password(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.password.sendKeys("secret_sauce");
    }

    @Given("^User is logged in$")
    public void user_is_logged_in(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.login_button.click();
    }

    @When("^User select order of arrangement as \"([^\"]*)\"$")
    public void user_select_order_of_arrangement_as(String arg1){

        Select drpArrangingOrder = new Select(homePage.drpdown);
        drpArrangingOrder.deselectByVisibleText(arg1);
    }

    @Then("^Items are arranged according to the order selected$")
    public void items_are_arranged_according_to_the_order_selected(){

    }

}
