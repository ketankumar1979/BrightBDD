package Bright;
import org.junit.*;
public class JunitDemo {
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @Before
    public void Before(){
        System.out.println("Before");
    }
    @Test
    public void vipul(){
        System.out.println("vipul method");
    }
    @Test
    public void chirag(){
        System.out.println("chirag method");
    }
    @Test
    public void ketan(){
        System.out.println("ketan method");
    }
    @Test
    public void saj(){
        System.out.println("Saj method");
    }
    @Test
    public void saran(){
        System.out.println("saran method");
    }
    @After
    public void After(){
        System.out.println("After");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("AfterClass");
    }
}
