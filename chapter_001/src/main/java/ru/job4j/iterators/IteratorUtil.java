package ru.job4j.iterators;

class IteratorUtil {
    static int[] convertFromMatrixToArray(int[][] matrix) {
        int[] result = new int[getNumOfElements(matrix)];
        int count = 0;
        for (int[] array : matrix) {
            for (int i : array) {
                result[count] = i;
                count++;
            }
        }
        return result;
    }

    private static int getNumOfElements(int[][] matrix) {
        int size = 0;
        for (int[] i : matrix) {
            size += i.length;
        }
        return size;
    }
}
