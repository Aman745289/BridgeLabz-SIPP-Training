package Linear_and_BinarySearch;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrences {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to count: ");
        String target = sc.next();
        int count = 0;

        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(target)) {
                    count++;
                }
            }
        }

        br.close();
        fr.close();

        System.out.println("Occurrences of \"" + target + "\": " + count);
    }
}

