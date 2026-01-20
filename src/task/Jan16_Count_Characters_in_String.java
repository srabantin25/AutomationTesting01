package task;

import java.util.Scanner;

public class Jan16_Count_Characters_in_String {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String l = scanner.nextLine();
        int count = 0;
        for (int i=0; i< l.length();i++){
            if(l.charAt(i)!= ' ' ){
                count++;
            }
        }
        System.out.println("Total number of characters (excluding spaces): " + count);

        }
    }

