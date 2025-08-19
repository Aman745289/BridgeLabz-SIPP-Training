package Collections;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the list: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arrayList.add(val);
            linkedList.add(val);
        }

        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
