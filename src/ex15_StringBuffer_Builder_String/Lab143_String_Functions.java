package ex15_StringBuffer_Builder_String;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Sonal";
        System.out.println(name.length()); //5
        System.out.println(name. charAt(3));//a

        // 2. concat()
        System.out.println(name.concat("Patel")); //SonalPatel

        //3. Contains()
        System.out.println(name.contains("om"));//false


        //4.equals()
        System.out.println(name.equals("Sonal"));//true

        //5.equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal")); //true

        //6. indexof()
        System.out.println(name.indexOf('o'));//1

        String s1= "madam";
        System.out.println(s1.indexOf("m")); //0 - taken only first one

        //7. length()
        System.out.println(name.length());//5

        //8.replace( , )
        System.out.println(name.replace("S","P")); //Ponal

        //9.substring( , )
        System.out.println(name.substring(1,3)); //on

        //10.toLowerCase()
        System.out.println(name.toLowerCase());//sonal

        //11.toUpperCase()
        System.out.println(name.toUpperCase());//SONAL

        //12. startsWith()
        System.out.println(name.startsWith("S"));//true

        //13. endWith()
        System.out.println(name.endsWith("a")); //false

        //14. trim() -use to remove the spaces
        String name3 = "     Sonal Harish     ";
        System.out.println(name3.trim());//sonal harish

        //15. compareTo()
        System.out.println(name.compareTo("Sonal"));//0

        //-------

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder); //Sonal

        stringBuilder.reverse();
        System.out.println(stringBuilder); //lanos

        StringBuilder sb= new StringBuilder("Hi");
        System.out.println(sb.toString());//Hi

    }
}
