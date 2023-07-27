/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package al.polis.calculator.controller;

import al.polis.calculator.dto.AddTwoNumbersReqDto;
import al.polis.calculator.dto.LoginReqDto;
import al.polis.calculator.dto.LoginRespDto;
import static org.testng.Assert.*;

/**
 *
 * @author henri
 */
public class CalculatorControllerNGTest {
    
    public CalculatorControllerNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of add method, of class CalculatorController.
     */
    @org.testng.annotations.Test
    public void testAdd() {
        System.out.println("add");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        String expResult = "";
        String result = instance.add(dto);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class CalculatorController.
     */
    @org.testng.annotations.Test
    public void testMultiply() {
        System.out.println("multiply");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.multiply(dto);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class CalculatorController.
     */
    @org.testng.annotations.Test
    public void testSubtract() {
        System.out.println("subtract");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.subtract(dto);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculatorController.
     */
    @org.testng.annotations.Test
    public void testDivide() {
        System.out.println("divide");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.divide(dto);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainder method, of class CalculatorController.
     */
    @org.testng.annotations.Test
    public void testRemainder() {
        System.out.println("remainder");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.remainder(dto);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class CalculatorController.
     */
    @org.testng.annotations.Test
    public void testLogin() {
        System.out.println("login");
        LoginReqDto req = null;
        CalculatorController instance = new CalculatorController();
        LoginRespDto expResult = null;
        LoginRespDto result = instance.login(req);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
