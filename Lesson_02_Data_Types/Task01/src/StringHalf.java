import java.util.Scanner;

public class StringHalf {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.print("Enter yuor string: ");
        String yourString = sc.nextLine();
        int numberOfCharacter = yourString.length();       // вычисляем количество символов в строке
        System.out.println("Number of characters in your string: " + numberOfCharacter + ".");
        sc.close();

        // вывести сообщение об ошибке, если ввели только один символ
        if (numberOfCharacter == 1) {
            System.out.println("Вы ввели строку только с одним символом, и её нельзя разбить на две строки");
        }

        // проверяем, чётное или нечётеное количество символов в строке
        if (numberOfCharacter%2 != 0) {
            System.out.println("У вас нечётное количество символов в строке, поэтому разобъём её на две строки"
                    + " по " + ((numberOfCharacter/2)+1) + " и " + numberOfCharacter/2 + " символов" + ".");
            String newFirstString = yourString.substring(0, ((numberOfCharacter/2)+1));         // создаём первую новую строку из первой половинки
            String newSecondString = yourString.substring(((numberOfCharacter/2)+1));           // создаём вторую новую строку из второй половинки
            System.out.println("Your new first string: " + newFirstString + "\n" + "Your new second string: " + newSecondString);
        }
        else {
            System.out.println("Разобъём вашу строку на две строки по " + numberOfCharacter/2 + " символов" + ".");
            String newFirstString = yourString.substring(0, numberOfCharacter/2);
            String newSecondString = yourString.substring(numberOfCharacter/2);
            System.out.println("Your new first string: " + newFirstString + "\n" + "Your new second string: " + newSecondString);
        }


    }
}
