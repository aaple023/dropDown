import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class candler {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions d=new ChromeOptions();
        d.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(d);
        driver.get("https://www.redbus.in/");
        driver.findElement(By.id("onwardCal")).click();
        Thread.sleep(2000);
        Date d2=new Date();
        SimpleDateFormat dateForm=new SimpleDateFormat("MMMM yyyy");

        System.out.println(dateForm.format(d2));





    }
}
