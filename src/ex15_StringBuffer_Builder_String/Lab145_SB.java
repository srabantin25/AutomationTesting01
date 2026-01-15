package ex15_StringBuffer_Builder_String;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Promod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer); //PromodDUtta -- one string is there

        String s = new String("Promod");
        s = s+ "dutta";
        System.out.println(s); //PromodDUtta
        //2 String are present

    }
}
