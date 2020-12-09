package runlengthencoding;

import java.util.Scanner;

public class RunLengthEncoding {

    public static void printCompressed(String userString) {
        int x = userString.length();
        for (int i = 0; i < x; i++) {

            // loop through string to count number of occurences for each character
            int count = 1;
            while (i < x - 1 && userString.charAt(i) == userString.charAt(i + 1)) {
                count++;
                i++;
            }

            // Print character and its count
            System.out.print(userString.charAt(i));
            System.out.print(count);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please enter the text you want to be compressed");
            String userString=input.next();
            printCompressed(userString);

        } catch (Exception e) {
            System.out.println("Error: " + e);

        }

    }

}
