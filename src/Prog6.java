
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Prog6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int N = scan.nextInt();
        int[] arr = new int[N];
        List<Integer> al = new ArrayList<>();
        System.out.println("Enter " + N + " elements");
        for (int i = 0; i < N; i++) {
            al.add(scan.nextInt());
        }

// add elements to al, including duplicates
        Set<Integer> hs = new HashSet<>();
        hs.addAll(al);
        al.clear();
        al.addAll(hs);
        
        hs.stream().forEach(System.out::println);

    }
}
