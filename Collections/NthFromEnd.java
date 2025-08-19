package Collections;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter value of N: ");
        int k = sc.nextInt();

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        for (int i = 0; i < k; i++) {
            if (!fast.hasNext()) {
                System.out.println("N is larger than the list size.");
                return;
            }
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        if (slow.hasNext()) {
            System.out.println("Nth element from the end: " + slow.next());
        } else {
            System.out.println("Element not found.");
        }
    }
}

