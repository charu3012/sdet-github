package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
   public ChromeDriver getChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        return driver;

    }
}
