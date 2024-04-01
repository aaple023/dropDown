package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Joy {
    public static  void main(String[] agrs){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        JavascriptExecutor jb=(JavascriptExecutor)driver;
        jb.executeScript("window.scrollBy(0,500)");
        jb.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        jb.executeScript("document.querySelector('.tableFixHead').scrollHeight.toLocaleString");
        driver.close();

    }
}
