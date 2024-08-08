import java.util.Stack;

public class Nomor_9 {
    public static void main(String[] args) {
        String[] tandaKurung = {"(()(", "()))((", "((()))"};

        for (String tandakurung : tandaKurung) {
            System.out.println(tandakurung + " = " + kurung(tandakurung));
        }
    }

    public static boolean kurung(String s) {
        Stack<Character> stack = new Stack<>();
        boolean hasPair = false;
        int angka = -2;

        for (char c : s.toCharArray()) {
            angka++;
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.push(c);
                    if (s.charAt(angka) == s.charAt(angka+1)) {
                    hasPair = true;
                    }
                }
            }
        }

        return hasPair;
    }
}
