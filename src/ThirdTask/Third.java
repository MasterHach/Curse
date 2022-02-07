package ThirdTask;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Third {
    public static void ThirdTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("\nInput some sentence on russian (separator - one space ('_') ): ");
        String str = scan.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        str = str.trim();
        String words[] = str.split(" ");
        String vowel = "аеёиоуыэюя";
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index >= 0) {
                    count[i] = count[i] + 1;
                }
            }
        }
        System.out.println("\nAmount of vowels in each word:\n");
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(words));
        System.out.println();
        int buf;
        String bufStr;
        for (int i = 0; i < count.length-1; i++) {
            for (int j = i + 1; j < count.length; j++) {
                if(count[i] < count[j]){
                    buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;
                    bufStr = words[i];
                    words[i] = words[j];
                    words[j] = bufStr;
                }
            }
        }
        System.out.println("Sorted mass of words and counts:\n");
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(words));
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index >= 0) {
                    if (j == words[i].length() - 1) {
                        words[i] = words[i].substring(0, j) + words[i].substring(j).toUpperCase();
                    } else {
                        words[i] = words[i].substring(0, j) + words[i].substring(j, j + 1).toUpperCase() + words[i].substring(j + 1, words[i].length());
                    }
                    break;
                }
            }
        }
        System.out.println("Mass with first upper vowel:\n");
        System.out.println(Arrays.toString(words));
        System.out.println();
    }
}
