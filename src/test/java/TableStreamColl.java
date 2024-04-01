import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class TableStreamColl {
    @Test
    public static void fun() throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> window = driver.getWindowHandles();
        Iterator<String>it =window.iterator();
        String parentWindowId=it.next();
        String childWindowId=it.next();
        driver.switchTo().window(childWindowId);
        driver.navigate().to("https://rahulshettyacademy.com/");
       String CurseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
       driver.switchTo().window(parentWindowId);
      WebElement name= driver.findElement(By.xpath("(//input[@name='name'])[1]"));
      name.sendKeys(CurseName);
     File scr = name.getScreenshotAs(OutputType.FILE);
     //particulart element
     FileUtils.copyFile(scr,new File("log.png"));
       // FileUtils.copyFile(scr,new File("/home/amit/Downloads/scum.png"));
       System.out.println( name.getRect().getDimension().getHeight());
       System.out.println(name.getRect().getDimension().getWidth());


    }
}
