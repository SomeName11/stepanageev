package ru.job4j.max;

/**
 * Класс Max
 *
 * @author Stepan Ageev (flowryder@mail.ru)
 * @since 07.11.2017
 */
public class Max {
    /**
     * Метод max, возвращает большее из двух чисел
     *
     * @param first
     * @param second
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
