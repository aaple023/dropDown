package Abstracts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static os.Bast.driver;

public class Abstractedness {
    WebDriver driver;
    public Abstractedness(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void ab(By findBy){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(String.valueOf(findBy))));
    }

}
