package FramTestng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Number_1 {
    @Test
    public void num1(){
        System.out.println("num1");
    }
    @Test
    public void num2(){
        System.out.println("num2");
    }
    @Test(groups={"smoke"})
    public void num3(){
        System.out.println("num3");
    }
    @Test
    public void num4(){
        System.out.println("num4");
    }
    @Parameters({"URL"})
    @Test
    public void num5(String urlName){
        System.out.println("num5");
        System.out.println(urlName);
    }

    @Test
    public void num6(){
        System.out.println("num7");

    }
}
