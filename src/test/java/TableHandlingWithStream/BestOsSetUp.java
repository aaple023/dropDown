package TableHandlingWithStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BestOsSetUp {
    public static WebDriver driver;
    @BeforeMethod
    public static void SetUp(){
        driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
    @Test
    public static void run(){
        TableSteam t=new TableSteam();
        t.table();
    }
    @Test
    public static void jun(){
        TableSteam t=new TableSteam();
        t.price();


    }
}
