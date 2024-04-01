package FramTestng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jan {
    @Test(groups={"smoke"})
    public void jan0()
    {
        System.out.println("jan1");
    }
    @Test
    public void jan1(){
        System.out.println("jan2");
    }
    @Test
    public void jan2(){
        System.out.println("jan3");
    }
    @Test(timeOut =4000 )
    public void jan3(){
        System.out.println("jan4");
    }
}
