package interview.pageFactory;

import Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Landing_Page{

    @FindBy(how = How.ID, using = "user-name")
    public WebElement username;

    @FindBy(how = How.ID, using = "password")
    public WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    public WebElement login_button;
}
