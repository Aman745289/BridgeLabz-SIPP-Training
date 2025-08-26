package Stream_API;

import java.util.*;
import java.util.stream.*;

public class GroupByFirstChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        Map<Character, List<String>> grouped =
                names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(grouped);
    }
}

