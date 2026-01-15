package ex14_String;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "Java".substring(2); //va
        System.out.println(s);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);  // ['J','a','v','a']

        boolean b = "".isBlank();
        System.out.println(b); //true

        String s2 = "ab".repeat(3);
        System.out.println(s2); //ababab

        boolean b3 = "Java".equalsIgnoreCase("Java");
        System.out.println(b3);//true

        long  count = "a\nb\nc".lines().count();
        System.out.println(count); //3

    }
}
