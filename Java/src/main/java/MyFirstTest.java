import org.junit.Test;
import org.testng.annotations.BeforeClass;

public class MyFirstTest {
    @BeforeClass
    public void before(){
        System.out.println("Before class test");
    }

    @Test
    public void myTest(){
        System.out.println(("My test"));
    }
}

//-Dtestng.dtd.http=true
