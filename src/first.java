import java.util.Scanner;
public class first {
    public static void FirstTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string: ");
        String str = scan.next();
        int sum = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++ ) {
            if ( Character.isDigit(chars[i])) {
                sum += Integer.parseInt(Character.toString(chars[i]));
            }
        }
        System.out.println("Total sum of all numbers in string: " + sum);
    }
}
