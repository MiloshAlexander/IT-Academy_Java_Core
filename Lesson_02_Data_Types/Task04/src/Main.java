import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of year: ");
        Integer year = sc.nextInt();
        sc.close();

        if (year<1582) {
            System.out.println("Високосный год считается по Юлинскому календарю.");
            if (year%4 == 0) {
                System.out.println("Leap year.");
            }
        }
        else {
            System.out.println("Високосный год считается по Григореанскому календарю.");
            if (year%400 == 0) {
                System.out.println("Leap year.");
            }
            else {
                if (year%100 == 0) {
                    System.out.println("Not a Leap year.");
                }
                else {
                    if (year%4 == 0) {
                        System.out.println("Leap year.");
                    }
                    else {
                        System.out.println("Not a Leap year.");
                    }
                }
            }
        }

    }
}
