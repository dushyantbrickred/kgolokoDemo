package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

    public WebDriver driver;

    public  Utils(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Morris Komana\\IdeaProjects\\InterviewProject\\drivers\\chromedriver2.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
}
