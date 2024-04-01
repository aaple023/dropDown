public class IndiaTraffic implements CentralTraffic,SumTrafic{
    public static void main(String[] args){

CentralTraffic i=new IndiaTraffic();
        i.greenGo();
        i.flashYellow();
        i.redStop();
        IndiaTraffic h=new IndiaTraffic();
        h.run();
        SumTrafic l=new IndiaTraffic();
        l.tangle();
    }

    @Override
    public void greenGo() {
System.out.println("green button");
    }

    @Override
    public void redStop() {
System.out.println("red button");
    }

    @Override
    public void flashYellow() {
        System.out.println("yellow button");

    }

    public void run(){
        System.out.println("hello");
    }

    @Override
    public void tangle() {
        System.out.println("triangles");

    }
}
