import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import os.Bast;

public class error extends Bast {


        @Test
        public  void loginUser1() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@class='btn ml-3']")).click();
            driver.findElement(By.id("email")).sendKeys("nkk2274221@gmail.com");
            driver.findElement(By.id("password")).sendKeys("12345");
            driver.findElement(By.cssSelector(".btn.btn-outline-primary.btn-block")).click();
            driver.findElement(By.cssSelector(".text-success")).click();
            Assert.assertTrue(true);

        }
        @Test
        public  void loginUser2() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@class='btn ml-3']")).click();
            driver.findElement(By.id("email")).sendKeys("nkk22740221@gmail.com");
            driver.findElement(By.id("password")).sendKeys("123450");
            driver.findElement(By.cssSelector(".btn.btn-outline-primary.btn-block")).click();
            driver.findElement(By.cssSelector(".text-success")).click();
            Assert.assertTrue(false);

        }


    }

