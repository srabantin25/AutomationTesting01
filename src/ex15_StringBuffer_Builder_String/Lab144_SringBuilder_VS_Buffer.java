package ex15_StringBuffer_Builder_String;

public class Lab144_SringBuilder_VS_Buffer {
    public static void main(String[] args) {

        //String -90%
        String s0 = "Promod";
        String s1 = new String ("Promod");

        //less than -10% used
        StringBuffer stringBuffer = new StringBuffer("Promod");
        StringBuilder stringBuilder = new StringBuilder("Promod");

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());




    }
}
