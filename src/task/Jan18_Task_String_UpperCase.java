package task;

import java.util.Scanner;

public class Jan18_Task_String_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new String: ");
        String str = sc.nextLine();
        String upperCase = str.toUpperCase();

        System.out.println("Enter the Uppercase: " + upperCase);
    }
}
