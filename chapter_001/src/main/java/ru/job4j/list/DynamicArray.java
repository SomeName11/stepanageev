package ru.job4j.list;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray<E extends Object> implements Iterable<E> {
    private E[] container = (E[]) new Object[10];
    private int size = container.length;
    private int capacity = 0;
    private int cursor = 0;

    void add(E value) {
        if (capacity < size) {
            container[capacity] = value;
        } else {
            container = Arrays.copyOf(container, ++size);
            container[capacity] = value;
        }
        capacity++;
    }

    Object get(int index) {
        return container[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public Object next() {
                return container[cursor++];
            }
        };
    }
}
