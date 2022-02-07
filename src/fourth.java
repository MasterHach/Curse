import java.util.Scanner;
import java.util.ArrayList;
public class fourth {
    String s1 = " ";
    String s2 = " ";
    String s3 = " ";
    String s4 = " ";
    String s5 = " ";
    public void bigOne() {
        s1 = "111 ";
        s2 = " 11 ";
        s3 = " 11 ";
        s4 = " 11 ";
        s5 = "1111";
    }
    public void bigTwo() {
        s1 = "2222";
        s2 = "   2";
        s3 = "2222";
        s4 = "2   ";
        s5 = "2222";
    }
    public void bigThree() {
        s1 = "3333";
        s2 = "   3";
        s3 = "3333";
        s4 = "   3";
        s5 = "3333";
    }
    public void bigFour() {
        s1 = "4  4";
        s2 = "4  4";
        s3 = "4444";
        s4 = "   4";
        s5 = "   4";
    }
    public void bigFive() {
        s1 = "5555";
        s2 = "5   ";
        s3 = "5555";
        s4 = "   5";
        s5 = "5555";
    }
    public void bigSix() {
        s1 = "6666";
        s2 = "6   ";
        s3 = "6666";
        s4 = "6  6";
        s5 = "6666";
    }
    public void bigSeven() {
        s1 = "7777";
        s2 = "   7";
        s3 = "  7 ";
        s4 = " 7  ";
        s5 = "7   ";
    }
    public void bigEight() {
        s1 = "8888";
        s2 = "8  8";
        s3 = " 88 ";
        s4 = "8  8";
        s5 = "8888";
    }
    public void bigNine() {
        s1 = "9999";
        s2 = "9  9";
        s3 = "9999";
        s4 = "   9";
        s5 = "9999";
    }
    public void bigNull() {
        s1 = "0000";
        s2 = "0  0";
        s3 = "0  0";
        s4 = "0  0";
        s5 = "0000";
    }
    public void One() {
        s1 = "*** ";
        s2 = " ** ";
        s3 = " ** ";
        s4 = " ** ";
        s5 = "****";
    }
    public void Two() {
        s1 = "****";
        s2 = "   *";
        s3 = "****";
        s4 = "*   ";
        s5 = "****";
    }
    public void Three() {
        s1 = "****";
        s2 = "   *";
        s3 = "****";
        s4 = "   *";
        s5 = "****";
    }
    public void Four() {
        s1 = "*  *";
        s2 = "*  *";
        s3 = "****";
        s4 = "   *";
        s5 = "   *";
    }
    public void Five() {
        s1 = "****";
        s2 = "*   ";
        s3 = "****";
        s4 = "   *";
        s5 = "****";
    }
    public void Six() {
        s1 = "****";
        s2 = "*   ";
        s3 = "****";
        s4 = "*  *";
        s5 = "****";
    }
    public void Seven() {
        s1 = "****";
        s2 = "   *";
        s3 = "  * ";
        s4 = " *  ";
        s5 = "*   ";
    }
    public void Eight() {
        s1 = "****";
        s2 = "*  *";
        s3 = " ** ";
        s4 = "*  *";
        s5 = "****";
    }
    public void Nine() {
        s1 = "****";
        s2 = "*  *";
        s3 = "****";
        s4 = "   *";
        s5 = "****";
    }
    public void Null() {
        s1 = "****";
        s2 = "*  *";
        s3 = "*  *";
        s4 = "*  *";
        s5 = "****";
    }
    public void Dot() {
        s1 = "  ";
        s2 = "  ";
        s3 = "  ";
        s4 = "**";
        s5 = "**";
    }
    public void FourthTask() {
        ArrayList<String> strings1 = new ArrayList<>();
        ArrayList<String> strings2 = new ArrayList<>();
        ArrayList<String> strings3 = new ArrayList<>();
        ArrayList<String> strings4 = new ArrayList<>();
        ArrayList<String> strings5 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input some number: ");
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        int maxi = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                maxi = Math.max(maxi, Character.getNumericValue(chars[i]));
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigNull();
                } else {
                    Null();
                }
            } else if (chars[i] == '1') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigOne();
                } else {
                    One();
                }
            }
            else if (chars[i] == '2') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigTwo();
                } else {
                    Two();
                }
            }
            else if (chars[i] == '3') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigThree();
                } else {
                    Three();
                }
            }
            else if (chars[i] == '4') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigFour();
                } else {
                    Four();
                }
            }
            else if (chars[i] == '5') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigFive();
                } else {
                    Five();
                }
            }
            else if (chars[i] == '6') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigSix();
                } else {
                    Six();
                }
            }
            else if (chars[i] == '7') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigSeven();
                } else {
                    Seven();
                }
            }
            else if (chars[i] == '8') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigEight();
                } else {
                    Eight();
                }
            }
            else if (chars[i] == '9') {
                if (Character.getNumericValue(chars[i]) == maxi) {
                    bigNine();
                } else {
                    Nine();
                }
            } else if (chars[i] == '.') {
                Dot();
            }
            strings1.add(s1);
            strings2.add(s2);
            strings3.add(s3);
            strings4.add(s4);
            strings5.add(s5);
        }
        for (int i = 0; i < strings1.size(); i++) {
            System.out.print(strings1.get(i));
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < strings2.size(); i++) {
            System.out.print(strings2.get(i));
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < strings3.size(); i++) {
            System.out.print(strings3.get(i));
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < strings4.size(); i++) {
            System.out.print(strings4.get(i));
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < strings5.size(); i++) {
            System.out.print(strings5.get(i));
            System.out.print(" ");
        }
    }
}
