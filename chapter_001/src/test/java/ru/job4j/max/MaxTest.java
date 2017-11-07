package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Класс MaxTest
 *
 * @author Stepan Ageev (flowryder@mail.ru)
 * @since 07.11.2017
 */
public class MaxTest {
    /**
     * Метод whenFirstLessSecond, тестирует метод max на аргументах 1 и 2
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
}
