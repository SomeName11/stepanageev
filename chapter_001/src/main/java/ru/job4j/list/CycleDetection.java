package ru.job4j.list;

class CycleDetection {

    boolean hasCycle(Node firstNode) {

        Node slowNode = firstNode;
        Node fastNode = firstNode;

        while (true) {
            slowNode = slowNode.next;
            if (fastNode.next != null)
                fastNode = fastNode.next.next;
            else
                return false;
            if (slowNode == null || fastNode == null)
                return false;
            if (slowNode == fastNode)
                return true;
        }
    }

    class Node<T> {
        T value;
        Node<T> next;
    }
}
