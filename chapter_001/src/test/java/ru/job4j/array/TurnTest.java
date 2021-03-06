package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] result = turn.back(new int[]{2, 6, 1, 4});
        int[] expected = {4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] result = turn.back(new int[]{1, 2, 3, 4, 5});
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}

