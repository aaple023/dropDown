package FramTestng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {
    @Test(groups={"smoke"})
    public void demo_1(){
        System.out.println("demo_1");
    }
    @Test(dependsOnMethods = "demo_4")
    public void demo_2(){
        System.out.println("demo_2");
    }
    @AfterMethod
    public void demo_3(){
        System.out.println("demo_3");
    }
    @Test
    public void demo_4(){
        System.out.println("demo_4");
    }
    @Test
    public void demT_5(){
        System.out.println("demo_5");
    }
    @Test
    public void demo_6(){
        System.out.println("demo6");
    }
    @BeforeMethod
    public void demo_7(){
        System.out.println("demo7");
    }
}
