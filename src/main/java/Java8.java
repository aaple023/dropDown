

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;
import static org.apache.commons.lang3.BooleanUtils.forEach;


public class Java8 {
    public static void main(String[] aru){

        // shot array

        int[] a1={9,3,5,2,7,1};
        String g="neha kumari";
        String rev=" ";
        char ch;
        int num=12345678;

        int revs = 0;
        for(int q=0;q<=num;q++){
            int rem=num%10;
            revs=revs*10+rem;
            num=num/10;


        }
        System.out.println(revs);

        for (int i=0;i<g.length();i++){
            ch=g.charAt(i);
            rev=ch+rev;


        }
        System.out.println(rev);

        //Arrays.stream(a1).sorted().forEach(s->System.out.println(s));
//reverse the number of array
        /*for (int i=a1.length-1;i>=0;i--){
            System.out.println(a1[i]);
        }*/

        sort(a1);
        for (int values: a1){
            System.out.println(values);
        }
        String h="Hello WelCome";
        int count=0;
        for (int i=0;i<h.length();i++){
            if(h.charAt(i)=='a'||h.charAt(i)=='e'||h.charAt(i)=='i'||h.charAt(i)=='o'||h.charAt(i)=='u'){
                count++;
                System.out.print(h.charAt(i));
            }



        }
        //System.out.println("number"+count);
   int a=0;
        int b=1;
        int c=1;
        for (int i=0;i<10;i++){
            a=b;
            b=c;
            c=a+b;

        }
        System.out.println("====================");
        System.out.println(c);
        List<Integer> j= Arrays.asList(1,3,5,7,9,8);
        for (int all:j){
            if(all%2==0){
                System.out.println(all);
            }
        }
        int[] array = {1, 2, 3, -1, -2, 4};
        Arrays.sort(array);
        for (int s:array){
            System.out.println(s);
        }
        Arrays.stream(array).sorted().forEach(d->System.out.println(d));
        int[] array1 = { 1, 2, 3, 4, 5 ,9};
        int ars=0;
      // System.out.println( Arrays.stream(array1).count());
        for (int ar:array1){
            ars=ars+ar;
            System.out.println(ar);
        }
        System.out.println(ars);

       List<Integer> c4= Arrays.asList(23,87,45,230,567);
       int xc=c4.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();

System.out.println(xc);
int u=c4.stream().sorted().skip(1).findFirst().get();
System.out.println(u);
int f=c4.stream().min(Collections.reverseOrder()).get();
System.out.println("max="+f);
        int f1=c4.stream().max(Collections.reverseOrder()).get();
        System.out.println("min="+f1);
        c4.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
        System.out.println("-------------------------------------");
        c4.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(s->System.out.println(s));
        Date d=new Date();
        SimpleDateFormat g6=new SimpleDateFormat("M-dd-yyyy");
        System.out.println(d);
        List<Integer> count3= Arrays.asList(1,1,2,2,6,8,9,4,5,7);
       count3.stream().sorted().distinct().collect(Collectors.toList()).forEach(fg->System.out.println(fg));
   System.out.println(     count3.stream().distinct().count());
        System.out.println( count3.stream().count());
        System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        count3.stream().distinct().collect(Collectors.toList()).forEach(s->System.out.println(s));
        System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        System.out.println(count3.stream().distinct().count());
        System.out.println("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        int[] yui={1,2,3,3,4,4,5,7,7,8};
        for (int i=0;i<yui.length;i++){
            for (int j6=i+1;j6<yui.length;j6++){
               if(yui[i]==yui[j6]) {
                   System.out.println(yui[j6]);
               }
            }


        }








    }
}
