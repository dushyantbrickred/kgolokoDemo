package interview.pageFactory;

import Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cart{

    @FindBy(how = How.XPATH, using = "//*[@id='item_2_title_link']/div")
    public WebElement product1;

    @FindBy(how = How.XPATH, using = "//*[@id='item_0_title_link']/div")
    public WebElement product2;

}
