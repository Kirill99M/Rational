import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class ArithmeticTests {
    @Test
    public void PlusWith1NegativeNumber(){
        Rational rational = new Rational(1 , 2);
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("wrong 1/2 + (- 1 / 2 )", new Rational (0 , 1 ) , rational.plus(rational2));
    }
    @Test
    public void PlusNegativeNumbers(){
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("Wrong -1 / 2 + (- 1 / 2)" , new Rational(-1 , 1) , rational2.plus(rational2));
    }
    @Test
    public void PlusZero(){
        Rational rational = new Rational(1 , 2);
        Rational rational1 = new Rational(0 , 2);
        assertEquals("wrong 1/2 + 0", rational , rational.plus(rational1));
    }
    @Test
    public void StandardPlus(){
        Rational rational3 = new Rational(3 , 1);
        Rational rational = new Rational(1 , 2);
        assertEquals("wrong 1/2 + 3 / 1" , new Rational(7 , 2 ), rational.plus(rational3));
    }
    @Test
    public void StadardMinus(){
        Rational rational = new Rational(1 , 2);
        assertEquals("wrong 1/2 - 1/2", new Rational(0 , 1) , rational.minus(rational));
    }
    @Test
    public void NegativeMinusNegative(){
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("Wrong -1 / 2 - (- 1 / 2)" , new Rational(0 , 1) , rational2.minus(rational2));
    }
    @Test
    public void MinusNegativeNumber(){
        Rational rational2 = new Rational(- 1 , 2);
        Rational rational = new Rational(1 , 2);
        assertEquals("wrong 1/2 - (- 1 / 2 )", new Rational (1 , 1 ) , rational.minus(rational2));
    }
    @Test
    public void MinusZero(){
        Rational rational1 = new Rational(0 , 2);
        Rational rational = new Rational(1 , 2);
        assertEquals("wrong 1/2 - 0", rational , rational.minus(rational1));
    }
    @Test
    public void StandardMultiply(){
        Rational rational = new Rational(1 , 2);
        assertEquals("wrong 1/2 * 1/2", new Rational(1 , 4) , rational.multiply(rational));
    }
    @Test
    public void NegativeMultiplyNegative(){
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("Wrong -1 / 2 * (- 1 / 2)" , new Rational( 1 , 4 ) , rational2.multiply(rational2));
    }
    @Test
    public void MultiplyNegativeNumber(){
        Rational rational = new Rational(1 , 2);
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("wrong 1/2 * (- 1 / 2 )", new Rational (-1 , 4 ) , rational.multiply(rational2));
    }
    @Test
    public void MultiplyZero(){
        Rational rational = new Rational(1 , 2);
        Rational rational1 = new Rational(0 , 2);
        assertEquals("wrong 1/2 * 0", rational1 , rational.multiply(rational1));
    }
    @Test
    public void StandardDivide(){
        Rational rational = new Rational(1 , 2);
        assertEquals("wrong (1/2) / (1/2)", new Rational(1 , 1) , rational.divide(rational));
    }
    @Test
    public void DivideWith1Negative(){
        Rational rational = new Rational(1 , 2);
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("wrong (1/2) / (- 1 / 2 )", new Rational (-1 , 1 ) , rational.divide(rational2));
    }
    @Test
    public void NegativeDivideNegative(){
        Rational rational2 = new Rational(- 1 , 2);
        assertEquals("Wrong (-1 / 2) / (- 1 / 2)" , new Rational( 1 , 1 ) , rational2.divide(rational2));
    }
    @Test
    public void Divide0(){
        Rational rational = new Rational(0 , 1) ;
        Rational rational1 = new Rational(1 , 1) ;
        try{
            rational1.divide(rational);
            Assert.fail("division by zero !");
        }
        catch (ArithmeticException thrown){
            Assert.assertEquals("division by zero !",thrown.getMessage());
        }
    }
}
