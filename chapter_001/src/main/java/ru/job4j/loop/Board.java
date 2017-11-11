package ru.job4j.loop;

public class Board {

    public String paint(int width, int height) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        result.append("*");
                    } else {
                        result.append(" ");
                    }
                } else {
                    if (j % 2 == 0) {
                        result.append(" ");
                    } else {
                        result.append("*");
                    }
                }
            }
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }
}
