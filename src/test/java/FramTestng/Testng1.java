package FramTestng;

import org.testng.annotations.Test;

public class Testng1 {
    @Test
    public void test_1(){
        System.out.println("test 1");
    }
    @Test(groups={"smoke"})
    public void test_2(){

        System.out.println("test2");
    }
    @Test
    public void test_3(){
        System.out.println("test3");
    }
    @Test
    public void test_4(){
        System.out.println("test4");
    }
    @Test(enabled = false)
    public void test_5(){
        System.out.println("test5");
    }
    @Test
    public void test_6(){
        System.out.println("test6");
    }
}
