package ru.job4j.list;

import java.util.Iterator;

public class SimpleStack<E> implements Iterable<E> {
    private Node firstNode;


    private class Node {
        private E value;
        private Node nextNode;
    }

    SimpleStack() {
        firstNode = null;
    }


    void push(E value) {
        Node oldFirstNode = firstNode;
        firstNode = new Node();
        firstNode.value = value;
        firstNode.nextNode = oldFirstNode;
    }

    E poll() {
        E value = firstNode.value;
        firstNode = firstNode.nextNode;
        return value;
    }


    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private Node currentNode = firstNode;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E value = currentNode.value;
            currentNode = currentNode.nextNode;
            return value;
        }
    }
}

