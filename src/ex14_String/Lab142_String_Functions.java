package ex14_String;

public class Lab142_String_Functions {

    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s2 = new String("World"); //OA

        String str1 = "Hello";  //SCP
        String str2 = "Hello"; //SCP
        String str3 = new String ("Hello"); //OA
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println( str1.equals(str3)); //true


        ;

    }

}
