package Lesson2;

// 1.Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
// import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task21 {
    public static void Main() {
        final int[] arr = {2, 6, 0, 1, 3, 8};

        Logger Logger1 = Logger.getLogger(Task21.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        Logger1.info(Arrays.toString(arr) + " исходное состояние\n");
        int tmp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        // Logger.log(Level.WARNING);
        Logger1.info(Arrays.toString(arr) + " итерация " + j + "\n");
        }
    }

}
    
