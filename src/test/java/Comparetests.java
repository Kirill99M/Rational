import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class Comparetests {
    @Test
    public  void PossitiveWithPositiveSameDenominator(){
        Rational rational = new Rational(1,5);
        Rational rational1 = new Rational(2,5);
        assertEquals("Wrong 1/5 > 2/5",true, rational.less(rational1));
    }
    @Test
    public void NegativeWithNegativeSameDenominator(){
        Rational rational = new Rational(-1,5);
        Rational rational1 = new Rational(-2,5);
        assertEquals("Wrong -1/5 > -2/5",true, rational1.less(rational));
    }
    @Test
    public void compareTestNegativeAndPositive(){
        Rational rational1 = new Rational(1 , 4) ;
        Rational rational5 = new Rational(-2 , 4) ;
        assertEquals("wrong 1 / 4 >  - 2 / 4" , true , rational5.less(rational1));
    }
    @Test
    public void lessTestSameRational(){
        Rational rational1 = new Rational(1 , 4) ;
        assertEquals("Wrong 1/4=1/4",false , rational1.less(rational1));
    }
    @Test
    public void lessTestDifferentDenominator(){
        Rational rational2 = new Rational(2 , 4) ;
        Rational rational3 = new Rational(1 , 3) ;
        assertEquals("wrong 2/4 > 1/3", true , rational3.less(rational2));
    }
    @Test
    public void LessTestwithNegativeDifferentDenominator(){
        Rational rational5 = new Rational(-2 , 4) ;
        Rational rational6 = new Rational( -1 , 3) ;
        assertEquals("Wrong -2/4<-1/3", true , rational5.less(rational6));
    }
    @Test
    public void LessNegativeWithDifferentDenominator(){
        Rational rational4 = new Rational(-1 , 4) ;
        Rational rational5 = new Rational(-2 , 4) ;
        assertEquals("wrong -2/4 < -1/4", true, rational5.less(rational4));
    }
    @Test
    public void LessWithDifferentDenominator(){
        Rational rational1 = new Rational(1 , 4) ;
        Rational rational2 = new Rational(2 , 4) ;
        assertEquals("wrong 1/4 < 2 / 4" , true , rational1.less(rational2));
    }
    @Test
    public void Less0TestWithSameDenominator(){
        Rational rational = new Rational();
        Rational rational1 = new Rational(1 , 1);
        assertEquals("wrong 1/1 > 0", true , rational.less(rational1));
    }
    @Test
    public void Less0testWithDifferentDenominator(){
        Rational rational = new Rational() ;
        Rational rational1 = new Rational(1 , 4) ;
        assertEquals("wrong 0 < 1 / 4",true , rational.less(rational1));
    }
}
