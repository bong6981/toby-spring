package springstudy.tobyspring.learningtest.template;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcSumTest {
    Calculator calculator;
    String numFilepath;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        this.numFilepath = "numbers.txt";
    }

    @Test
    public void sumOfNumbers() throws IOException {

        int sum = calculator.calSum(getClass().getResource(numFilepath).getPath());
        assertThat(sum).isEqualTo(10);
    }

    @Test
    public void multiplyOfNumbers() throws IOException {
        int sum = calculator.calcMultiply(numFilepath);
        assertThat(sum).isEqualTo(24);
    }

    @Test
    public void concatenateStrings() throws IOException {
        assertThat(calculator.concatenate(this.numFilepath)).isEqualTo(("1234"));
    }
}
