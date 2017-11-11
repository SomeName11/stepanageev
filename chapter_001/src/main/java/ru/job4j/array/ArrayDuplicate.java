package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] strings) {
        int duplicateCount = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length - duplicateCount; j++) {
                if (strings[i].equals(strings[j])) {
                    while (j != strings.length - duplicateCount - 1
                            && strings[strings.length - duplicateCount - 1].equals(strings[j])) {
                        duplicateCount++;
                    }
                    String tmp = strings[strings.length - duplicateCount - 1];
                    strings[strings.length - duplicateCount - 1] = strings[j];
                    strings[j] = tmp;
                    duplicateCount++;
                }
            }
        }
        return Arrays.copyOf(strings, strings.length - duplicateCount);
    }
}
