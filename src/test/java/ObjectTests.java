import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class ObjectTests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }
    @Test
    public void ConstructorWithNegativeNumbers(){
        Rational rational2 = new Rational(-1 , 1 );
        assertEquals("-1/1 constructor returns wrong numerator" , -1 , rational2.getNumerator());
        assertEquals("-1/1 constructor returns wrong denominator", 1 , rational2.getDenominator());
    }
    @Test
    public void ConstructorWithpositivenumbers(){
        Rational rational = new Rational(1 ,1);
        assertEquals("1/1 constructor returns wrong numerator" , 1 , rational.getNumerator());
        assertEquals("1/1 constructor returns wrong denominator", 1 , rational.getDenominator());
    }
    @Test
    public void SdandardRationalToString(){
        Rational rational = new Rational(1 , 1);
        assertEquals("Rational 1/1 return wrong tostring","1/1",rational.toString());
    }
    @Test
    public void RationalToStringwith1Negative(){
        Rational rational2 = new Rational(1 , - 1 );
        assertEquals("Rational -1/1 return wrong tostring", "-1/1" , rational2.toString());
    }
    @Test
    public void RationalToStringwith2negative(){
        Rational rational3 = new Rational(- 1 , - 1 );
        assertEquals("Rational -1/-1 return wrong tostring", "1/1" , rational3.toString());
    }
    @Test
    public void RationalToStringwith0(){
        Rational rational1 = new Rational(0 , - 1);
        assertEquals("Rational 0/1 return wrong tostring","0/1" , rational1.toString());
    }
    @Test
    public void setzero(){
        Rational rational = new Rational(1 , 1 );
        try{
            rational.setDenominator(0);
            Assert.fail("division by zero!");
        }
        catch (Exception thrown){
            Assert.assertEquals("division by zero !" , thrown.getMessage());
        }
    }
    @Test
    public void divisionzero(){
        try{
            Rational rational = new Rational(1 , 0);
            Assert.fail("division by zero !");
        }
        catch (ArithmeticException thrown){
            Assert.assertEquals("division by zero !",thrown.getMessage());
        }
    }

    @Test
    public void ReduceWith0(){
        Rational rational = new Rational(0 , 444);
        assertEquals("wrong reduce 0/444", 0 , rational.getNumerator());
        assertEquals("wrong reduce 0/444", 1 , rational.getDenominator());
    }
    @Test
    public void StandardReducewith2Divider(){
        Rational rational1 = new Rational(16 , 36);
        assertEquals("wrong reduce 16/36", 4 , rational1.getNumerator());
        assertEquals("wrong reduce 16/36", 9 , rational1.getDenominator());
    }
    @Test
    public void StandardReducewith1Divider(){
        Rational rational = new Rational(2,30);
        assertEquals("Wrong reduce 2/30",1, rational.getNumerator());
        assertEquals("Wrong reduce 2/30",15, rational.getDenominator());
    }
    @Test
    public void NegativeReduceWith1Divider(){
        Rational rational2 = new Rational(-2 , 30);
        assertEquals("wrong reduce -2/30", -1 , rational2.getNumerator());
        assertEquals("wrong reduce -2/30", 15 , rational2.getDenominator());
    }
    @Test
    public void NegativeReduceWith2Divider(){
        Rational rational3 = new Rational(45 , - 90) ;
        assertEquals("wrong reduce 45/-90", -1 , rational3.getNumerator());
        assertEquals("wrong reduce 45/-90", 2 , rational3.getDenominator());
    }
}