package Abstracts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Product extends Abstractedness {
    WebDriver driver;
    public Product(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".thumbnail")
    List<WebElement> items;
    By newOnes= By.cssSelector("h3");

    public void action(){
        List<WebElement> item=items;//driver.findElements(By.cssSelector(".thumbnail"));
        WebElement  newOne= item.stream().filter(p->p.findElement(By.cssSelector("h3")).getText().equals("fridge Products")).findFirst().orElse(null);
    newOne.findElement(By.cssSelector("p")).click();

    }
}
