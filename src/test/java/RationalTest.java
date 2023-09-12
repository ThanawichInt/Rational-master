import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSub() throws Rational.Illegal {
        Rational x = new Rational(5,10);
        Rational y = new Rational(1,10);
        x.subtract(y);
        Assert.assertEquals(2, x.numerator);
    }

    @Test
    public void testMul() throws Rational.Illegal {
        Rational x = new Rational(2,4);
        Rational y = new Rational(2,4);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testDiv() throws Rational.Illegal {
        Rational x = new Rational(2,4);
        Rational y = new Rational(2,4);
            x.divide(y);
            Assert.assertEquals(1, x.numerator);
            Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testConstruct(){
        Rational x = new Rational();
        assertEquals(0, x.numerator);
        assertEquals(0, x.denominator);
    }

    @Test
    public void testParaConstruct() throws Rational.Illegal{
        Rational x = new Rational(1,2);
        assertEquals(1, x.numerator);
        assertEquals(2, x.denominator);
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        assertEquals("1/2", x.toString());
      
    }

    @Test
    public void testEqual() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,2);
        assertTrue(x.equals(y));
    }

    @Test
    public void testCompareTo() throws Rational.Illegal {
        Rational x = new Rational(2,2);
        Rational y = new Rational(1,2);
        assertEquals(1,x.compareTo(y));
    }

}
