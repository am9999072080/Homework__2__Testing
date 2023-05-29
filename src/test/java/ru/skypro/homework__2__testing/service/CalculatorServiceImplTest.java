package ru.skypro.homework__2__testing.service;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static ru.skypro.homework__2__testing.service.CalculatorConstants.*;

class CalculatorServiceImplTest {
private final  CalculatorServiceImpl service = new CalculatorServiceImpl();
    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectSum(int num1, int num2) {
       assertEquals(num1 + num2, service.sum(num1, num2));
    }
    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectSubtract(int num1, int num2) {
        assertEquals(num1 - num2, service.subtract(num1, num2));
    }
    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectMultiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }
    @MethodSource("provideParams")
    @ParameterizedTest
    public void shouldReturnCorrectDivide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }
    private  static Stream <Arguments> provideParams(){
        return Stream.of(
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, ONE),
                Arguments.of(THREE, TWO),
                Arguments.of(ZERO, ONE),
                Arguments.of(THREE, ONE)
        );

    }
 }