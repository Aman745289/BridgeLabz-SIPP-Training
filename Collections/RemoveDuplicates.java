package Collections;

import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> inputList = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            inputList.add(sc.nextInt());
        }

        Set<Integer> seen = new LinkedHashSet<>();
        for (int num : inputList) {
            seen.add(num); 
        }

        List<Integer> resultList = new ArrayList<>(seen);
        System.out.println("List after removing duplicates: " + resultList);
    }
}

