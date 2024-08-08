import java.util.Arrays;
import java.util.Scanner;
public class Nomor_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata pertama: ");
        String firstWord = scanner.nextLine();
        System.out.print("Masukkan kata kedua: ");
        String secondWord = scanner.nextLine();
        scanner.close();

        boolean isAnagram = areAnagrams(firstWord, secondWord);

        if (isAnagram) {
            System.out.println("Kata-kata ini adalah anagram.");
        } else {
            System.out.println("Kata-kata ini bukan anagram.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        String cleanedStr1 = str1.replaceAll("\\s+", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (cleanedStr1.length() != cleanedStr2.length()) {
            return false;
        }

        char[] charArray1 = cleanedStr1.toCharArray();
        char[] charArray2 = cleanedStr2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}


