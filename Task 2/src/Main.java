import java.util.Scanner;

public class Main {
    static int number;

    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        while (true) {
            number = inputNumber();
            printResul();
        }

    }

    public static int inputNumber() {
        System.out.println("Введите целое число: ");
        return new Scanner(System.in).nextInt();
    }

    public static void printResul() {
        System.out.println(number % 2 == 0);
    }
}
