package TableHandlingWithStream;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;


import java.util.List;
import java.util.stream.Collectors;

import static TableHandlingWithStream.BestOsSetUp.driver;

public class TableSteam {



    public void  table(){
        driver.findElement(By.xpath("(//th[@role='columnheader'])[1]")).click();
     List<WebElement> original= driver.findElements(By.xpath("//table[@class='table table-bordered'] //td[1]"));
    List<String> Original1= original.stream().map(s->s.getText()).collect(Collectors.toList());
    List<String> shortedOne=Original1.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(Original1,shortedOne);


    }

    public void price(){
        driver.findElement(By.xpath("(//th[@role='columnheader'])[1]")).click();
       // List<WebElement> original= driver.findElements(By.xpath("//table[@class='table table-bordered'] //td[1]"));
        List<String> price;
        do {
            List<WebElement> original= driver.findElements(By.xpath("//table[@class='table table-bordered'] //td[1]"));
           price = original.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s)).collect(Collectors.toList());
            price.forEach(f -> System.out.println(f));
            if (price.size()<1){
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }

        }while (price.size()<1);



    }

    private static String getPrice(WebElement s) {
      String Priced=  s.findElement(By.xpath(" //td[2]")).getText();
        return Priced;

    }


}
