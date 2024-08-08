public class Nomor_10 {
    public static void main(String[] args) {
        int baris = 5;

        for (int i = 1; i <= baris; i++) {
            int number = i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
