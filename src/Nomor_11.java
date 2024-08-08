public class Nomor_11 {
    public static void main(String[] args) {
        String input = "hello, nama saya budi";
        String reversed = terbalik(input);
        System.out.println(reversed);
    }
    public static String terbalik(String s) {
        char[] characters = s.toCharArray();
        int kiri = 0;
        int kanan = characters.length - 1;

        while (kiri < kanan) {
            char temp = characters[kiri];
            characters[kiri] = characters[kanan];
            characters[kanan] = temp;

            kiri++;
            kanan--;
        }

        return new String(characters);
    }
}
