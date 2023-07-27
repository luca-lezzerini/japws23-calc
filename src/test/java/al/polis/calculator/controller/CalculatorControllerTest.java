/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package al.polis.calculator.controller;

import al.polis.calculator.dto.AddTwoNumbersReqDto;
import al.polis.calculator.dto.LoginReqDto;
import al.polis.calculator.dto.LoginRespDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author henri
 */
public class CalculatorControllerTest {
    
    public CalculatorControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class CalculatorController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        String expResult = "";
        String result = instance.add(dto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class CalculatorController.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.multiply(dto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class CalculatorController.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.subtract(dto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculatorController.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.divide(dto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainder method, of class CalculatorController.
     */
    @Test
    public void testRemainder() {
        System.out.println("remainder");
        AddTwoNumbersReqDto dto = null;
        CalculatorController instance = new CalculatorController();
        double expResult = 0.0;
        double result = instance.remainder(dto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class CalculatorController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        LoginReqDto req = null;
        CalculatorController instance = new CalculatorController();
        LoginRespDto expResult = null;
        LoginRespDto result = instance.login(req);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
