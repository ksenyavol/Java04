package Lesson3;
import java.util.ArrayList;
// import java.util.Random;
import java.util.Collections;
// import javax.lang.model.util.Elements;

// Пусть дан произвольный список целых чисел.

public class Task31 {
    // static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        numbers.add(1);
        numbers.add(10);
        numbers.add(16);

        System.out.println("Список: " + numbers);
// 1) Нужно удалить из него чётные числа
        // numbers.removeIf(n -> n % 2 == 0);

        // System.out.println("Список без четных чисел: " + numbers);
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }

    }
