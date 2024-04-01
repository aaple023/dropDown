public class Expectation {
    public static void main(String[] agr){
        int[] d=new int[5];

        try {
            d[10]=56;

        }
        catch (Exception e ){
            System.out.println(e);
        }
      /*  try {
            int i=100/0;
        }
        catch (Exception e){

            System.out.println(e);
        }
        finally {
            System.out.println("this huge exception");
        }*/
    }
}
