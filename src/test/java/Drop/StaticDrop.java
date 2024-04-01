package Drop;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static CloseUp.SetUP.driver;


public class StaticDrop {
    public static void login(){
       WebElement staticDropDown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
        Select s1=new Select(staticDropDown);
        s1.selectByValue("USD");
        System.out.println(s1.getFirstSelectedOption().getText());
        s1.selectByVisibleText("AED");
        System.out.println(s1.getFirstSelectedOption().getText());
        s1.selectByIndex(1);
        System.out.println(s1.getFirstSelectedOption().getText());

    }
    public static void passenger(){
        driver.findElement(By.id("divpaxinfo")).click();
        for (int i=0;i<5;i++){
            if (i==2) {
                driver.findElement(By.id("hrefIncAdt")).click();
            } else if (i==3) {
                driver.findElement(By.id("hrefIncChd")).click();

            }
            else {
                driver.findElement(By.id("hrefIncInf")).click();
            }


        }
        driver.findElement(By.id("btnclosepaxoption")).click();


    }
  public static void dynamic() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

    }
    public  static void autoSuggest(){
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
     List<WebElement> don  = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
 for (WebElement ron:don){
     if(ron.getText().equalsIgnoreCase("india")){
         ron.click();
     }
 }

    }
   public  static  void checkRadio(){
        driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_IndArm']")).click();
        int all=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_IndArm']")).isSelected());
        Assert.assertEquals(6,all);
    }
   public static void  gyh(){
        driver.findElement(By.xpath("label[for='ctl00_mainContent_rbtnl_Trip_1']")).click();
       if( driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
           System.out.println("its is enable");
           Assert.assertTrue(true);
       }
       else{
           Assert.assertTrue(false);
       }

    }
    public static void jkn() throws IOException {
       File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr,new File("/home/amit/Downloads/Screen.png"));
    }

}
