package JavaScript;



import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    @Test
    public static void numberu(){
        ArrayList<String>  emp= new ArrayList<String>();
        emp.add("neha");
        emp.add("kajal");
        emp.add("arun");
        emp.add("susmit");
        emp.add("nuhu");
        emp.add("natasha");
        emp.add("nimashkshi");
        emp.add("namita");
        ArrayList<String> val=new ArrayList<String>();
        val.add("mom");
        val.add("nbv");
        val.add("sdd");
        val.add("asxc");
        val.add("cfv");
        val.add("zsf");
        val.add("xdcfvg");
        val.add("nupur");
      List<String> names= emp.stream().filter(f->f.startsWith("n")).collect(Collectors.toList());
      names.forEach(g->System.out.println(g));
      List<String> num= Stream.concat(emp.stream(),val.stream()).sorted().collect(Collectors.toList());
      num.forEach(h->System.out.println(h));
      List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
    List<Integer> odd=  numbers.stream().filter(f->f%2==0).sorted().collect(Collectors.toList());
    odd.forEach(j->System.out.println(j));
        long max1= numbers.stream().filter(d -> d % 2 == 0).count();
        System.out.println(max1);

    }
    @Test
    public  void naming(){
        ArrayList<String> emp= new ArrayList<>();
        emp.add("neha");
        emp.add("kajal");
        emp.add("arun");
        emp.add("susmit");
        emp.add("nuhu");
        emp.add("natasha");
        emp.add("nimashkshi");
        emp.add("namita");
     Long all=   emp.stream().filter(s->s.startsWith("n")).count();
     System.out.println(all);


    }
    @Test
    public void jun(){
        Stream.of("neha","bom","mom","vgb");

    }
}
