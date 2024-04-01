public class DecimationOfArray {
    public  static  void main(String[] args){
        int min=0;
        int[][] d={{1,2,3},{4,0,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (d[i][j]<min){
                    min=d[i][j];


                }

            }

        }
        System.out.println(min);

    /*int[][] a=new int[2][3];
    a[0][0]=9;
    a[0][1]=8;
    a[0][2]=5;
    a[1][0]=4;
    a[1][1]=7;
    a[1][2]=3;
   // System.out.println(a[1][1]);
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
        }*/
    }
}
