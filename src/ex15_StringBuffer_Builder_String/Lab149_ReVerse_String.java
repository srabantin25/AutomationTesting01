package ex15_StringBuffer_Builder_String;

import java.util.Scanner;

public class Lab149_ReVerse_String {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input = scanner.next();
        String revese = " ";

        for (int i=input.length()-1; i>=0; i-- )
        {
            revese = revese+ input.charAt(i);

        }
        System.out.println(revese);
    }
}
