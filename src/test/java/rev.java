import java.nio.Buffer;
import java.util.Scanner;

public class rev {
    public static  void  main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        System.out.println("a value before swap"+a);
        System.out.println("Enter the  2nd number:");
      int b=  sc.nextInt();
        System.out.println("b value before swap"+b);
      int c=0;
      c=a;//c=a
      a=b;//b=a
      b=c;
      System.out.println("a value is"+a);
      System.out.println("b value is"+b);

      StringBuffer sb=new StringBuffer();
      sb.append("neha");
      sb.append(sb);
      sb.append("kumari");
        String message = sb.toString();
     StringBuffer rev;
        rev = sb.reverse();
        System.out.println(rev);




      /*  StringBuffer b= new StringBuffer(s);
        b.reverse();
      System.out.println(b);*/

       /* for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);//extracting each element
            s1=ch+s1;//Strong each element
        }
        System.out.println(s1);*/
    }
}
