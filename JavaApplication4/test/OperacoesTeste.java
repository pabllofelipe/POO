/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Calc.Operacoes;
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

public class OperacoesTeste {
    
    public OperacoesTeste() {
    }
    
    @Test
    public void testSomar(){
        System.out.println("Somar:");
        Operacoes instance = new Operacoes (5,5);
        double expResult = 10.0;
        double result = instance.somar();
        assertEquals("Valor da soma nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void testSub(){
        System.out.println("Subtrair:");
        Operacoes instance = new Operacoes (5,5);
        double expResult = 0.0;
        double result = instance.subtrair();
        assertEquals("Valor da subtracao nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void testMult(){
        System.out.println("Multiplicar:");
        Operacoes instance = new Operacoes (5,5);
        double expResult = 25.0;
        double result = instance.multiplicar();
        assertEquals("Valor da multiplicacao nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void testDiv(){
        System.out.println("Dividir:");
        Operacoes instance = new Operacoes (5,5);
        double expResult = 1;
        double result = instance.dividir();
        assertEquals("Valor da divisao nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void raiz(){
        System.out.println("Raiz:");
        Operacoes instance = new Operacoes (25,2);
        double expResult = 5.0;
        double result = instance.raiz();
        assertEquals("Valor da raiz nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void porcentagem(){
        System.out.println("Porcentagem:");
        Operacoes instance = new Operacoes (20, 5);
        double expResult = 1;
        double result = instance.porcentagem();
        assertEquals("Valor da soma nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void fatorial(){
        System.out.println("Dividir:");
        Operacoes instance = new Operacoes (5, 5);
        double expResult = 120;
        double result = instance.fatorial();
        assertEquals("Valor do fatorial nao e o esperado", expResult, result, 0);
    }
    
    @Test
    public void fibonacci(){
        
    }
    
    @BeforeClass
    public static void setUpClass() {
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

}

