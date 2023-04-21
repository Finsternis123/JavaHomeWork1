package JavaWork.JavaHomeWork.JavaHomeWork1;
import java.util.Scanner;
//Реализовать простой калькулятор
public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите операцию(1 = Сложить,2 = умножить): ");
        int x = iScanner.nextInt();
            if (x != 1 && x != 2){
                System.out.println("Можно ввести либо 1, либо 2");
            } else{
                System.out.printf("Введите первую цифру: ");
                int a = iScanner.nextInt();
                System.out.printf("Введите вторую цифру: ");
                int b = iScanner.nextInt();
                if (x == 1){
                    a = a + b;
                    System.out.println(a);
                } else if (x == 2){
                    a = a * b;
                    System.out.println(a);
                }
            }       
        iScanner.close();
    }  
}