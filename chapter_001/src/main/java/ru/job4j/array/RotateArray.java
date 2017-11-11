package ru.job4j.array;

public class RotateArray {

    public int[][] rotate(int[][] array) {
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - 1 - i; j++) {
                tmp = array[i][j];
                array[i][j] = array[array.length - j - 1][i];
                array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
                array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
                array[j][array.length - i - 1] = tmp;
            }
        }
        return array;
    }
}
