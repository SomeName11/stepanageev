package ru.job4j.iterators;

import java.util.NoSuchElementException;

public class PrimeIterator implements java.util.Iterator {

    private int[] array;
    private int cursor;

    PrimeIterator(int[] array) {
        this.array = array;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor + 1 < array.length && isPrime(array[cursor + 1]);
    }

    @Override
    public Integer next() {
        while (cursor < array.length && !isPrime(array[cursor])) {
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

    private boolean isPrime(int element) {
        if (element < 2) return false;
        for (int i = 2; i * i <= element; i++) {
            if (element % i == 0) {
                return false;
            }
        }
        return true;
    }
}
