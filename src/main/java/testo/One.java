package testo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One {
 public static    WebDriver driver;
    @Test
    public void lunch(){
         driver=new ChromeDriver();
        driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");


    }
}
