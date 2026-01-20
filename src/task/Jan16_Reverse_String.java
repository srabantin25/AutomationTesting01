package task;

import java.util.Scanner;

public class Jan16_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String l = scanner.nextLine();
        String r = "";
        for ( int i = l.length()-1; i>=0; i--)
        {
            r= r+ l.charAt(i);

        }
        System.out.println(r);

    }
}
