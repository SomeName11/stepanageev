package ru.job4j.iterators;

import java.util.NoSuchElementException;

public class EvenNumbersIterator implements java.util.Iterator {

    private int[] array;
    private int cursor;

    EvenNumbersIterator(int[] array) {
        this.array = array;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        if (cursor + 1 >= array.length) {
            return false;
        }
        return isEven(array[cursor + 1]);
    }

    @Override
    public Integer next() {
        while (cursor < array.length && !isEven(array[cursor])) {
            cursor++;
        }
        try {
            return array[cursor++];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private boolean isEven(int element) {
        return element % 2 == 0;
    }
}
