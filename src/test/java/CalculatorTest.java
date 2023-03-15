import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator casio = new Calculator();
    @Test
    public void testSum(){
        Assert.assertEquals(casio.sum(10,50), 60);
        Assert.assertEquals(casio.sum(1,1), 2);
        Assert.assertEquals(casio.sum(100,100), 200);
        Assert.assertEquals(casio.sum(50,1000), 1050);
        Assert.assertEquals(casio.sum(100000,500), 100500);
        //int sumNumber = casio.sum(5,5);
        //System.out.println(sumNumber);
    }
    @Test
    public void testDivide(){
        Assert.assertEquals(casio.divide(100,50),2);

    }
    public void testSubtract(){
        Assert.assertEquals(casio.subtract(100,50),2);

    }
    public void testMultiply(){
        Assert.assertEquals(casio.multiply(3,50),150);

    }

}
