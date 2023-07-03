//2) Вывести все простые числа от 1 до 1000
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        for (int j = 1; j < 1001; j++) {
            int k = 0;
            for (int i = 1; i < j + 1; i++) {
                if (j % i == 0) {
                    k++;
                }

            }
            if (k == 2) {
                System.out.println(j + " ");
            }
        }
    }
}
