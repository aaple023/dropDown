package os;

import Abstracts.Abstractedness;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Paging extends Abstractedness {

        WebDriver driver;

        public Paging(WebDriver driver) {
            super(driver);
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

        @FindBy(css = ".thumbnail")
        List<WebElement> items;
        @FindBy(css = ".thumbnail h3")
        List<WebElement> products;
        @FindBy(css = ".thumbnail  p")
        List<WebElement> addToCard;
        @FindBy(css = ".btn.menu-btn")
        WebElement button1;
        @FindBy(xpath = "//a[normalize-space()='Checkout']")
        WebElement button2;
        @FindBy(css=".btn.btn-danger.float-right")
        WebElement button3;
        @FindBy(id="buttonConfirm")
        WebElement button4;

        public void ProductAll() {
            items.size();
            List<WebElement> all = products;
            for (int i = 0; i < all.size(); i++) {
                String g = all.get(i).getText();
                if (g.equalsIgnoreCase("Laptop Products")) {
                    addToCard.get(i).click();

                }
            }
        }
        public  void  button(){
            button1.click();
            button2.click();
            button3.click();
            button4.click();

        }
    }






