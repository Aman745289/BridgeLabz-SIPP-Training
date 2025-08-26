package Stream_API;

import java.util.*;
import java.util.stream.*;

public class NameLengthMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        Map<String, Integer> map = names.stream()
                                        .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(map);
    }
}

