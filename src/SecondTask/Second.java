package SecondTask;

import java.util.Scanner;

public class Second {
    public static void SecondTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some int number: ");
        int number = scan.nextInt();
        int del = 2;
        System.out.print(number + " = ");
        while (number > 1) {
            if (number % del == 0) {
                System.out.print(del + " * ");
                number = number / del;
            } else {
                del++;
            }
        }
        System.out.print(1);
    }
}
