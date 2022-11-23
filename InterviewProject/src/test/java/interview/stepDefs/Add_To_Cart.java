package interview.stepDefs;

import Utils.Utils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interview.pageFactory.Cart;
import interview.pageFactory.Home_Page;

public class Add_To_Cart extends Utils {

    Home_Page myPage = new Home_Page();
    Cart myCart = new Cart();

    @When("^User select two items$")
    public void user_select_two_items(){

        myPage.product1.click();

        myPage.product2.click();

    }

    @When("^User is on cart$")
    public void user_is_on_cart(){

        myPage.cart.click();
    }

    @Then("^Added items should show in the cart$")
    public void added_items_should_show_in_the_cart(){


    }
}
