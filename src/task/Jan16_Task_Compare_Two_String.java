package task;

import java.util.Scanner;

public class Jan16_Task_Compare_Two_String {
    public static void main(String[] args) {
        Scanner str1 = new Scanner(System.in);
        System.out.println(" Enter a name1: ");
        String nameOne = str1.nextLine();

        Scanner str2 = new Scanner(System.in);
        System.out.println(" Enter a name2: ");
        String nameTwo = str1.nextLine();

        if  (nameOne.equals(nameTwo))
        {
            System.out.println("Both the string are same");
        }
        else {
            System.out.println("Both the string are not same");
        }




    }
}
