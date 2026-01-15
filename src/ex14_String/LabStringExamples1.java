package ex14_String;

public class LabStringExamples1 {
    public static void main(String[] args) {

        String s= "Java";
        char c = s.charAt(2);  //charAt() -> use as index session
        System.out.println(c);
        //Size - is not exists in String
        //Length - is exist in string

        int result = "abc".compareTo("ABC"); //a=97, A=65 diff= 32
        System.out.println(result); // 32
        int result1 = "ABC".compareTo("ABC"); //a=97, A=65 diff= 32
        System.out.println(result1); //0
        int result2 = "ABC".compareTo("abc"); //a=97, A=65 diff= 32
        System.out.println(result2); //-32

        //compareTo- use in collection framework


        int inx = "Java".indexOf("a");
        System.out.println(inx); //1

        int inx2= "Java".lastIndexOf("a");
        System.out.println( inx2);//3


        boolean b = "".isEmpty();
        System.out.println(b); //true

        String s11 = String.join("*", "Java", "Python");
        System.out.println(s11); //java*Python


        String s12 = "Java".replace('a','o');
        System.out.println(s12);//Jovo

        boolean b2= "Java".startsWith("Ja");
        System.out.println(b2);//true

        String s22 = "Java".concat("Mava");
        System.out.println(b2); //JavaMava


    }
}
