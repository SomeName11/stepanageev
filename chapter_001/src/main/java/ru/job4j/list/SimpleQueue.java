package ru.job4j.list;

import java.util.Iterator;

public class SimpleQueue<E> implements Iterable<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;

    private class Node<E> {
        private E value;
        private Node<E> nextNode;
    }

    public SimpleQueue() {
        firstNode = null;
        lastNode = null;
    }

    public void push(E value) {
        Node<E> oldLastNode = lastNode;
        lastNode = new Node<>();
        lastNode.value = value;
        lastNode.nextNode = null;
        if (isEmpty()) {
            firstNode = lastNode;
        } else {
            oldLastNode.nextNode = lastNode;
        }
    }

    E poll() {
        E item = firstNode.value;
        firstNode = firstNode.nextNode;
        if (isEmpty()) {
            lastNode = null;
        }
        return item;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public Iterator<E> iterator() {
        return new ListIterator<>(firstNode);
    }

    private class ListIterator<T> implements Iterator<T> {
        private Node<T> currentNode;

        ListIterator(Node<T> first) {
            currentNode = first;
        }

        public boolean hasNext() {
            return currentNode != null;
        }

        public T next() {
            T item = currentNode.value;
            currentNode = currentNode.nextNode;
            return item;
        }
    }
}
