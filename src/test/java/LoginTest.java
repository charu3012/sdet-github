
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.WebDriverUtility;

public class LoginTest {
    @Test
    void verifyThatUseIsAbleToLoginWithValidUserNameAndPassward(){
        // write code for opening browser
//standard_user
//locked_out_user
//problem_user
//performance_glitch_user
        // Initializes and create object for selenium
      //  WebDriver driver=new ChromeDriver();// object, class,interface, inheritance, implements
       // System.setProperty("webdriver.chrome.driver", "/Users/ashut/IdeaProjects/SDET/Driver/chromedriver.exe");
         // using web driver manager
        WebDriverUtility webDriverUtility=new WebDriverUtility();
       ChromeDriver driver= webDriverUtility.getChromeBrowser();
        // write code for entering credentials
//1. find element
        // 2. send value-- locator

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // code for click

        driver.findElement(By.id("login-button")).click();
        // code for assertion and validation
        ////*[@id="header_container"]/div[2]/span

       boolean isProductTitleDisplayed=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
        Assert.assertTrue(isProductTitleDisplayed);
        Assert.assertEquals(isProductTitleDisplayed,true);
        // quit driver
        driver.quit();

    }

}
