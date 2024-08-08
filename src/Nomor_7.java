import java.util.Scanner;
public class Nomor_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();
        scanner.close();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = isPalindrome(cleanedInput);

        if (isPalindrome) {
            System.out.println("Kata ini adalah palindrome.");
        } else {
            System.out.println("Kata ini bukan palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}