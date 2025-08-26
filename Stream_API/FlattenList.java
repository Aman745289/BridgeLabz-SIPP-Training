package Stream_API;

import java.util.*;
import java.util.stream.*;

public class FlattenList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            int k = sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                temp.add(sc.nextInt());
            }
            list.add(temp);
        }

        list.stream()
            .flatMap(Collection::stream)
            .forEach(num -> System.out.print(num + " "));
    }
}

