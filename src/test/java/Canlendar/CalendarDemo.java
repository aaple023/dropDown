package Canlendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CalendarDemo {
    public  static void main(String[] args){
        String monthNumber="6";
        String date="15";
        String year="2027";
        String[] v={monthNumber,date,year};
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
        driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
        driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
        driver.findElement(By.xpath("(//*[@class='react-calendar__tile react-calendar__decade-view__years__year'])[6]")).click();
        driver.findElement(By.xpath("(//*[@class='react-calendar__tile react-calendar__year-view__months__month'])[6]")).click();
        driver.findElement(By.xpath("//*[@aria-label='15 June 2027']")).click();
       // driver.findElement(By.xpath("//*[@aria-label='+date+ June +year+']")).click();
      // System.out.println( driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input")));
        List<WebElement> f=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i=0;i<f.size();i++){
            System.out.println(f.get(i).getAttribute("value"));
            Assert.assertEquals(f.get(i).getAttribute("value"),v[i]);

        }
        driver.quit();








    }
}
