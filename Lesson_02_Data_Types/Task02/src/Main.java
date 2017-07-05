import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String firstNumber = "str1";
        String secondNumber = "str2";

        // Проверяем, вводится ли с склавиатуры число или строка и ссобщаем об ошибке.
        // Предлагаем ввести строку ещё раз.

        boolean boo1 = false;                                   // создаём переменную boo1 которая возвращает true если ввели число и выходим из цикла do-while
        do {                                                    // в противном случае предлагаем ввести строку ещё раз
            Scanner sc1 = new Scanner(System.in);
            sc1.useLocale(Locale.US);                           // прописываем эту строчку, чтобы JDK правильно считывал точки и запятые в типе double
            System.out.print("Enter first number: ");           // то еесть надо писать 5.5  а не 5,5
            if (sc1.hasNextDouble()) {
                boo1 = true;
            }
            else {
                System.out.println("Вы ввели не число. Повторите попытку.");
            }
            firstNumber = sc1.nextLine();
        } while( boo1 == false);


        boolean boo2 = false;
        do {
            Scanner sc2 = new Scanner(System.in);
            sc2.useLocale(Locale.US);
            System.out.print("Enter second number: ");
            if (sc2.hasNextDouble()) {
                boo2 = true;
            }
            else {
                System.out.println("Вы ввели не число. Повторите попытку.");
            }
            secondNumber = sc2.nextLine();
        } while( boo2 == false);


        // преобразовываем наши строки firstNumber и secondNumber в числа
        Double d1 = Double.valueOf(firstNumber);
        Double d2 = Double.valueOf(secondNumber);

        // и сравниваем их
        if (d1.equals(d2)) {
            System.out.print("Числа равны: " + d1 +  " = " + d2);
        }
        else {
            if (d1 > d2) {
                System.out.printf("Первое число больше второго: " + d1 + " > " + d2);
            }
            else {
                System.out.print("Второе число больше первого: " + d1 + " < " + d2);
            }
        }

    }
}
