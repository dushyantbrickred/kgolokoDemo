package interview.pageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home_Page{

    @FindBy(how = How.CLASS_NAME,using = "product_sort_container")
    public WebElement drpdown;

    //Product added to cart
    @FindBy(how = How.XPATH, using = "//*[@id='add-to-cart-sauce-labs-onesie']")
    public WebElement product1;

    @FindBy(how = How.XPATH, using = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    public WebElement product2;

    //Navigating to cart
    @FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
    public WebElement cart;

}
