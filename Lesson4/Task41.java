package Lesson4;
// import java.util.Random;
import java.util.Deque;
import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.Scanner;
// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном 
// порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два 
// числа должны быть отрицательными.

public class Task41 {

    public static boolean isDigit(String s) throws NumberFormatException {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    private static int stackFill(String[] arr, Deque<Integer> stack, int sign) throws NumberFormatException 
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (isDigit(arr[i])) stack.push(Integer.parseInt(arr[i]));
            else sign *= -1;
        }
        return sign;       
    } 
    private static double fillResult(Deque<Integer> stack, double sl) throws NumberFormatException
    {
        int size = stack.size();
        for (int i = 0; i < size; i++)
        {
            sl = sl + stack.pop() * Math.pow(10, i);
            sl = (int)sl;
        }
        return sl;
    }
    public static void main(String[] args) throws NumberFormatException
    {
        System.out.print("\033[H\033[2J");
        Deque<Integer> firstSt = new ArrayDeque<>();
        Deque<Integer> secondSt = new ArrayDeque<>();
        Deque<Integer> sumSt = new ArrayDeque<>();
        Deque<Integer> multSt = new ArrayDeque<>();
        System.out.println("\nВведите первое число: ");
        Scanner firstStr = new Scanner(System.in);
        String[] first = firstStr.next().split("");

        System.out.println("\nВведите второе число: ");
        Scanner secondStr = new Scanner(System.in);
        String[] second = secondStr.next().split("");
        int sign1 = 1;
        int sign2 = 1;
        sign1 *= stackFill(first, firstSt, sign1);
        sign2 *= stackFill(second, secondSt, sign2);
        System.out.println("\nСодержимое первого стека: " + firstSt);
        System.out.println("Знак первого стека: " + sign1);

        System.out.println("\nСодержимое второго стека: " + secondSt);
        System.out.println("Знак второго стека: " + sign2);
        double sl1 = 0;
        double sl2 = 0;
        sl1 = fillResult(firstSt, sl1);
        sl2 = fillResult(secondSt, sl2);
        int sum = (int)sl1 * sign1 + (int)sl2 * sign2;
        int mult = (int)sl1 * sign1 * (int)sl2 * sign2;

        System.out.println("\nСумма слагаемых: " + sum);
        System.out.println("Произведение множителей: " + mult);
        String sumStr = Integer.toString(sum);
        String[] sumArr = sumStr.split("");

        String multStr = Integer.toString(mult);
        String[] multArr = multStr.split("");
        int sumSign = 1;
        int multSign = 1;
        sumSign *= stackFill(sumArr, sumSt, sumSign);

        multSign *= stackFill(multArr, multSt, multSign);
        System.out.println("\nСодержимое стека суммы: " + sumSt);
        System.out.println("Знак суммы: " + sumSign);
        System.out.println("\nСодержимое стека произведения: " + multSt);
        System.out.println("Знак произведения: " + multSign + "\n");
    }
}