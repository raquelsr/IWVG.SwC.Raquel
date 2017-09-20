package iwvg.swc.raquel.operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction f;
    
    @Before
    public void before() {
        f = new Fraction (4,2);  
    }
    
    @Test
    public void testFractionIntInt() {
        assertEquals(4, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testFraction() {
        f = new Fraction();
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }
    
    @Test
    public void testDecimal() {
        assertEquals(2, f.decimal(), 10e-5);
    }
    
    @Test
    public void testGetNumerator() {
        assertEquals(4, f.getNumerator());
    }
    
    @Test
    public void testGetDenominador() {
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetMayor() {
        assertEquals(4, f.getMayor());
        Fraction f2 = new Fraction (3,8); 
        assertEquals(8, f2.getMayor());
    }
    
    @Test
    public void testSumFiveToNumerator() {
        f.sumFiveToNumerator();
        assertEquals(9, f.getNumerator());
    }
    
    @Test
    public void testDivide() {
        Fraction f1 = new Fraction (4,2); 
        Fraction f2 = new Fraction (8,2); 
        assertEquals(0.5, f.divide(f1,f2), 10e-5);
    }

}
