package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author nico
 *  @version 1.0
 *  @since 2024-11-04
 */
public class CalculatorTest {

    /**
     * The Calculator.
     */
    Calculator calculator=new Calculator();

    /**
     * Test add 2 operatand.
     *
     * @throws Exception the exception
     */
    @Test
    public void testAdd2Operatand() throws Exception {
        double total=calculator.calcular("5+3");
        assertEquals(8, total, 0.0001);
    }


    /**
     * Test add 1 operatand.
     *
     * @throws Exception the exception
     */
    @Test
    public void testAdd1Operatand() throws Exception {
        double total=calculator.calcular("4+3+1");
        assertEquals(8, total, 0.0001);
    }


    /**
     * Test mult 2 operatand.
     *
     * @throws Exception the exception
     */
    @Test
    public void testMult2Operatand() throws Exception {
        double total=calculator.calcular("4*2");
        assertEquals(8, total, 0.0001);
    }


    /**
     * Test 6.
     *
     * @throws Exception the exception
     */
    @Test
    public void test6() throws Exception {
        double total=calculator.calcular("3*2");
        assertEquals(6, total, 0.0001);
    }


    /**
     * Test varios.
     *
     * @throws Exception the exception
     */
    @Test
    public void testVarios() throws Exception {
        double total=calculator.calcular("3+2*2+4");
        assertEquals(11, total, 0.0001);
    }

}
