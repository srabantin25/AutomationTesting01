package task;

import java.util.Scanner;

public class JAN18_Coding_Task_StringLength {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Enter a new String: ");
     int l = input.length();

        System.out.println(l);
                if (l>10) {
                    System.out.println("String length is grater than 10");
                } else
                    System.out.println("String length is less than 10");
    }

}
