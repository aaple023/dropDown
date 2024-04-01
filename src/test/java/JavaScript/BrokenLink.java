package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert s=new SoftAssert();

       List<WebElement> links= driver.findElements(By.xpath("//li[@class='gf-li'] //a[1]"));

       for (WebElement link:links){
           String url=link.getAttribute("href");
           HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
           connection.setRequestMethod("HEAD");
           connection.connect();
         int responseCode=connection.getResponseCode();
         System.out.println(responseCode);
         s.assertTrue(responseCode<400,"the link is text "+link.getText()+"is broken link"+responseCode);
        /* if (responseCode>400){
             System.out.println("the link is text "+link.getText()+"is broken link"+responseCode);
             Assert.assertTrue(false);
         }*/
       }
       s.assertAll();
       driver.quit();

    }


}
