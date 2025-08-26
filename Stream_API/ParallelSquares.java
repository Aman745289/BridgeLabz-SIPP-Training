package Stream_API;

import java.util.*;
import java.util.stream.*;

public class ParallelSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        numbers.parallelStream()
               .map(num -> num * num)
               .forEach(num -> System.out.print(num + " "));
    }
}
