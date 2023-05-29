package ru.skypro.homework__2__testing.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.skypro.homework__2__testing.service.CalculatorConstants.*;
import static ru.skypro.homework__2__testing.service.CalculatorConstants.ZERO;

public class CalculatorServiceImplParamTest {
    private final  CalculatorServiceImpl service = new CalculatorServiceImpl();
    @Test
    public void shouldReturnCorrectSum1() {
        assertEquals(ONE + TWO, service.sum(ONE, TWO));
    }
    @Test
    public void shouldReturnCorrectSum2() {
        assertEquals(ONE + THREE, service.sum(ONE, THREE));
    }

    @Test
    public void shouldReturnCorrectSubtract1() {
        assertEquals(THREE - TWO, service.subtract(THREE, TWO));
    }
    @Test
    public void shouldReturnCorrectSubtract2() {
        assertEquals(THREE - ZERO, service.subtract(THREE, ZERO));
    }

    @Test
    public void shouldReturnCorrectMultiply1() {
        assertEquals(THREE * TWO, service.multiply(THREE, TWO));
    }
    @Test
    public void shouldReturnCorrectMultiply2() {
        assertEquals(ONE * TWO, service.multiply(ONE, TWO));
    }

    @Test
    public void shouldReturnCorrectDivide1() {
        assertEquals(THREE / TWO, service.divide(THREE, TWO));
    }
    @Test
    public void shouldReturnCorrectDivide2() {
        assertEquals(TWO / ONE, service.divide(TWO, ONE));
    }
}
