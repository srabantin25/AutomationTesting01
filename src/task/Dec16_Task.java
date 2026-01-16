package task;

import java.util.Scanner;

public class Dec16_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new String: ");
        String l = scanner.next();
        String r = "";
         for (int i= l.length()-1; i>=0; i--)
        {
            r= r + l.charAt(i);

        }
        System.out.println(r);
    }

}
