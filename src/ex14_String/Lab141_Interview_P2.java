package ex14_String;

public class Lab141_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";// SCP=1

        String s2 = new String( "Hello");
        String s3 = new String( "Hello");
        String s5 = new String( "Hello"); //OA= 3

        //== comparison - String check the ref in string.

        System.out.println(s1==s3); // both are not same
        System.out.println(s1==s2); //both are not same
        System.out.println(s2==s3); // both are not same

        System.out.println(s1==s4); // both are the same now.
        System.out.println(s3==s5); // both are not same as both are belong to the object area.

        //equals (content) -> value

        System.out.println(s1.equals(s2)); // compare the values only
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s5)); // in tht case they are not equal
        System.out.println(s3.equalsIgnoreCase(s5));

        // equalsIgnoreCase -> promod, Promod, PROMOD,
        //== - check for thr ref
        // equals operator assignment the value.









    }
}
