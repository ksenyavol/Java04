// Реализовать простой калькулятор
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = Double.parseDouble(Scanner.nextLine());

        System.out.print("Введите оператор: ");
        String op = Scanner.nextLine();

        System.out.print("Введите второе число: ");
        double b = Double.parseDouble(Scanner.nextLine());

        double res = 0;
        if (op.equals("+")) {
            res = a + b;
        }
        else if (op.equals("-")) {
            res = a - b;
        }
        else if (op.equals("*")) {
            res = a * b;
        }
        else if (op.equals("/")) {
            res = a / b;
        }
        else {
            System.out.println("Некорректный оператор!");
        }
        System.out.println(res);
    }
}    