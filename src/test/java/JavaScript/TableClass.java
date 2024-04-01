package JavaScript;

import io.github.bonigarcia.wdm.online.GoodVersions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TableClass {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor jb=(JavascriptExecutor)driver;
        jb.executeScript("window.scrollBy(0,500)");
        jb.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        int sum=0;
        List<WebElement> webElements=driver.findElements(By.xpath("//div[@class='tableFixHead']  //td[4]"));
       for (int i=0;i<webElements.size();i++){
         String sum1=webElements.get(i).getText();
         int sum0=Integer.parseInt(sum1);
         sum=sum+sum0;
        }
        System.out.println(sum);
       String allElement=driver.findElement(By.cssSelector(".totalAmount")).getText();
      String allItems= allElement.split(":")[1].trim();
     int num= Integer.parseInt(allItems);
        Assert.assertEquals(sum,num);
        File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sc,new File("/home/amit/Downloads/value.png"));


    }
}
