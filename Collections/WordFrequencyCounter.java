package Collections;

import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File(path));
            while (fileScanner.hasNext()) {
                String word = fileScanner.next().toLowerCase().replaceAll("[^a-z]", "");
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

