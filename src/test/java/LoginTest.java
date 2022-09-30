import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    void verifyThatUseIsAbleToLoginWithValidUserNameAndPassward(){
        // write code for opening browser

        // Initializes and create object for selenium
      //  WebDriver driver=new ChromeDriver();// object, class,interface, inheritance, implements
        System.setProperty("webdriver.chrome.driver", "/Users/ashut/IdeaProjects/SDET/Driver/chromedriver.exe");
          ChromeDriver driver =new ChromeDriver();

          driver.get("https://www.saucedemo.com/");

        // write code for entering credentials


// code for click
        // code for assertion and validation

    }

}
