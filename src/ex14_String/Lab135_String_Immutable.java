package ex14_String;

public class Lab135_String_Immutable {

    public static void main(String[] args) {
        String name= "Srabanti";
        boolean result = name.contains("c");
        System.out.println(result);
        //name.toUpperCase();  //new string is created
        name = name.toUpperCase();  // SRABANTI

        System.out.println(name);

        //String are immutable in nature

        //System.out.println(name);
    }
}
