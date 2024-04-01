public class uper {
    public static void main(String[] args){
        int[] num={2,4,7,5,9,6};
        int even =0;
        int odd=0;

        int[] arg={1,3,5,6,1,3,4,4,5,9};
        for (int k=0;k<arg.length;k++){
            for (int j=k+1;j<arg.length;j++){
                if(arg[k]==arg[j]){
                    System.out.println(arg[j]);
                }
            }
        }
/*
        for (int i=0;i<num.length;i++){
            if(num[i]%2==0){

            even++;


            }
            else {

             odd++;

            }
        }
        System.out.println("even"+even);
     System.out.println("odd"+odd);

     /*   int a=3;
        int b =7;
        int large=a>b?a:b;
        System.out.println(large);*/
       /* String name="Neha Kumar";
        String str="";
        for (int i =0;i<name.length();i++){
           char ch= name.charAt(i);
           str=ch+str;

        }*/

      // System.out.println(str);*/
       /* int upper=0;
        int lower=0;
        for (int i=0;i<name.length();i++){
           char ch= name.charAt(i);
           if(ch>65 && ch<90)
           {
               upper++;

           }
           else {
               lower++;
           }

        }
        System.out.println("upper"+upper);
        System.out.println("lower"+lower);*/

    }
}
