package com.openclassrooms.calculator;

import org.junit.*;
import org.junit.runner.RunWith;

import java.time.Instant;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static Calculator calculator;
    private static Instant startedAt;

    @BeforeClass
    public static void timeStamp() {
        startedAt = Instant.now();
        System.out.println("Test started at: " + startedAt);
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public static void tearDown() {
        calculator = null;
    }

    @Test (timeout = 500)
    public void add_shouldReturnTheSum_ofTwoNumbers() throws InterruptedException {
        //arrange
        Integer expected = 3;
        //act
        Integer result = calculator.add(1, 2);
        //assert
        assertEquals(expected, result);
        sleep(499);
    }

    @Test
    public void multiply_shouldReturnTheProduct_ofTwoNumbers() {
        //arrange
        Integer expected = 28;
        //act
        Integer result = calculator.multiply(4, 7);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void convertKilometresToMiles_shouldReturnMiles() {
        Integer expected = 10;
        Integer result = calculator.convertKilometresToMiles(16);
        assertEquals(expected, result);
    }

}
