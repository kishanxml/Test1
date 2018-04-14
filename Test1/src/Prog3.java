
import java.io.*;

class PalindromeNumber {

    public static void main(String[] a) throws IOException {

        for (int n = 100; n < 1000; n++) {
            String original = n + "", reverse = "";
            int length = original.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);
            }
            if (original.equals(reverse)) {
                System.out.println(n);
            }
        }
    }
}
