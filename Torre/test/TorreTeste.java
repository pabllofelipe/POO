/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import torre.Torre;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pabllo
 */
public class TorreTeste {
    
    public TorreTeste() {
    }
    
    @Test
    static void Testhanoi() {
        Torre instance = new Torre(3,1,3,2);
        double expResult = 7;
        double result = instance.hanoi();
        assertEquals("Calculo errado", expResult, result, 0);

	}
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
