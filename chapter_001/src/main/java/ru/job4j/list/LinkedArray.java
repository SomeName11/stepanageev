package ru.job4j.list;

import java.util.Iterator;

class LinkedArray<E> implements Iterable<E> {

    private final Node<E> headNode;
    private Node<E> currentNode;

    LinkedArray() {
        headNode = new Node<>(null);
        currentNode = headNode;
    }

    void add(E value) {
        currentNode.nextNode = new Node<>(value);
        currentNode = currentNode.nextNode;
    }

    E get(int index) {
        Node<E> currentNode = headNode;
        int countNodes = 0;

        while (countNodes < index && currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            countNodes++;
        }

        return currentNode.value;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentNode = LinkedArray.this.headNode;

            @Override
            public boolean hasNext() {
                return currentNode.nextNode != null;
            }

            @Override
            public E next() {
                currentNode = currentNode.nextNode;
                return currentNode.value;
            }
        };
    }

    private class Node<T> {
        Node<T> nextNode;
        final T value;

        Node(T value) {
            this.value = value;
            this.nextNode = null;
        }
    }
}
