//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
// Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = Scanner.nextInt();
        int sum = (n * (n + 1)) / 2;

        int i;
        int work = 1;
        int stop = n + 1;
        for (i = 1; i < stop; i++){
            work *= i;
        }
        System.out.print("Сумма: ");
        System.out.println(sum);

        System.out.print("Произведение: ");
        System.out.println(work);
    }
}