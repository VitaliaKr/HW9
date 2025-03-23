import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        System.out.println("Результат деления чисел чисел: " + (a / b));
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println("Разница чисел: " + (a - b));
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println("Произведение чисел: " + (a * b));
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println("Сумма чисел: " + (a + b));
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextDouble();
    }
}
