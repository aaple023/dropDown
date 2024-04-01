import org.testng.annotations.Test;

public class Child {

int i;


    @Test
    public void  count(){
        Parent2 pt=new Parent2(7);
        pt.inciment();
        pt.inciment1();
        pt.inciment3();
        pt.mul();
        pt.mul1();
        pt.mul4();

    }
}
