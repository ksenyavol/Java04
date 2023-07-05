// 2)К калькулятору из предыдущего ДЗ добавить логирование.

package Lesson2;
import java.util.Scanner;
import java.util.logging.Logger;


public class Task22 {
    public static void main(String[] args) {
        StringBuilder strbld = new StringBuilder();
        try (Scanner Scanner = new Scanner(System.in)) {
            Logger Logger1 = Logger.getLogger(Task22.class.getName());

            System.out.print("Введите первое число: ");
            String str_a = Scanner.nextLine();
            double a = Double.parseDouble(str_a);

            System.out.print("Введите оператор: ");
            String op = Scanner.nextLine();

            System.out.print("Введите второе число: ");
            String str_b = Scanner.nextLine();
            double b = Double.parseDouble(str_b);

            double res = 0;

            strbld.append(str_a)
                  .append(op)
                  .append(str_b)
                  .append("=");

            if (op.equals("+")) {
                res = a + b;
                strbld.append(res);
                Logger1.info(strbld.toString());
            }
            else if (op.equals("-")) {
                res = a - b;
                strbld.append(res);
                Logger1.info(strbld.toString());
            }
            else if (op.equals("*")) {
                res = a * b;
                strbld.append(res);
                Logger1.info(strbld.toString());
            }
            else if (op.equals("/")) {
                res = a / b;
                strbld.append(res);
                Logger1.info(strbld.toString());
            }
            else {
                Logger1.info("unsupported operator " + op);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        strbld.delete(0, strbld.length());
    }     
    }
    
