package JavaWork.JavaHomeWork.JavaHomeWork1;
//Задача: Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
                int n = 0;
                n = i * (i + 1) / 2;
                System.out.println(n);
        } 
    }
}
