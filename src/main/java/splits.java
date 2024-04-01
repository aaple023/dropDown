import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class splits {
    public  static  void main(String[] args){
        String str1="abc";
        String str2="pqr";
        String str3="zxy";
        String str=str1.concat(str2).concat(str3);
        System.out.println(str);
      //  List<String> concat = Stream.concat(s -> str1,str2,str3).collect(Collectors.toList());
       /* String s="java,maven,jenkins,selenium";
        String[] g= s.split(",");
        for (String h:g){
            System.out.println(h);
        }*/

    }
}
