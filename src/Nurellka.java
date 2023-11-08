import java.util.Scanner;

public class Nurellka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - i - 1))) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
