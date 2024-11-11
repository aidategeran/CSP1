package week5.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Math.random;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    @DisplayName("Adding two numbers correctly")
    void add() {
        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    @DisplayName("Adding many numbers correctly")
    void addMany() {
        assertEquals(15, Calculator.add(getManyNumbers(5)));
    }

    @Test
    void multiply() {
        assertEquals(10, Calculator.multiply(5,2));
    }

     double[] getManyNumbers(int n) {
        double [] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i+1;
        }
        return numbers;
    }
}