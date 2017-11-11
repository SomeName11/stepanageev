package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void whenPaintBoardThreeByThree() {
        Board board = new Board();
        String result = board.paint(3, 3);
        String expected = "* *" + System.getProperty("line.separator") +
                " * " + System.getProperty("line.separator") +
                "* *" + System.getProperty("line.separator");
        assertThat(result, is(expected));
    }

    @Test
    public void whenPaintBoardFiveByFour() {
        Board board = new Board();
        String result = board.paint(5, 4);
        String expected = "* * *" + System.getProperty("line.separator") +
                " * * " + System.getProperty("line.separator") +
                "* * *" + System.getProperty("line.separator") +
                " * * " + System.getProperty("line.separator");
        assertThat(result, is(expected));
    }
}

