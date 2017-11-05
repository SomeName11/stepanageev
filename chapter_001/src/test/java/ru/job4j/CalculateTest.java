package ru.job4j;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Stepan Ageev (flowryder@mail.ru)
 * @version $Id$
 * @since 5.11.2017
 */
public class CalculateTest {
    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Stepan Ageev";
        String expect = "Echo, echo, echo : Stepan Ageev";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}