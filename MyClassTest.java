import org.junit.Test;
import static org.junit.Assert.*;


public class MyClassTest {

    @Test
    public void multiply() throws Exception {
        MyClass tester = new MyClass();
        assertEquals(5, tester.multiply(1, 5));
    }

    @Test
    public void test2() throws Exception {
        MyClass x = new MyClass();
        assertEquals(-10, x .multiply(-2,5));

    }

    @Test
    public void multiplyby0() throws Exception {
        MyClass y = new MyClass();
        assertEquals(0, y.multiply(0, 0));
    }

    @Test
    public void test4() throws Exception{
        MyClass z = new MyClass();
        assertEquals(1,z.multiply(-1,-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void tet5() throws Exception{
        MyClass a =new MyClass();
        a.multiply(1000,-3000);
    }

}