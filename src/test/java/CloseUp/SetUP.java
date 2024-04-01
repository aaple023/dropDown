package CloseUp;

import Drop.StaticDrop;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class SetUP {
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    @BeforeMethod
    public void close(){
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        spark=new ExtentSparkReporter("target/reports.html");
        spark.config().setDocumentTitle("neha Automation");
        spark.config().setReportName("neha first");
        reports=new ExtentReports();
        reports.attachReporter(spark);
        reports.setSystemInfo("tester","neha");



    }
    @Test(groups = {"smoke"})
    public  void drown1() {
        reports.createTest("first run automation");
        StaticDrop drop=new StaticDrop();
        drop.login();

        //drop.dynamic();



    }
    @Test
    public void  login1(){
        StaticDrop drop=new StaticDrop();
        drop.passenger();

    }
    @Test(groups = {"smoke"})
    public  void auto(){
        StaticDrop drop=new StaticDrop();
        drop.autoSuggest();


    }
    @Test(groups = {"smoke"})
    public void check(){
        StaticDrop drop=new StaticDrop();
        drop.checkRadio();

    }
    @Test
    public void jnk() throws IOException {
        StaticDrop drop=new StaticDrop();
        drop.jkn();

    }
   @Test(enabled = false)
    public static void dyan() throws InterruptedException {
        StaticDrop drop=new StaticDrop();
        try {
            drop.dynamic();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
  /*  @Test
    public static void hun(){
        StaticDrop drop=new StaticDrop();
        drop.gyh();

    }*/
    @AfterMethod
    public void nop(){
        driver.quit();
    }
}