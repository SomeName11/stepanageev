package ru.job4j;

/**
* Класс Calculate
*
* @author Stepan Ageev (flowryder@mail.ru)
* @since 04.11.2017
*/
public class Calculate {
    /**
	* Метод main, выводит на консоль "Hello World!"
	* @param args
	*/
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
        * Method echo.
        * @param name Your name.
        * @return Echo plus your name.
        */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}