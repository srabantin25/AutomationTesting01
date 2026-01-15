package ex15_StringBuffer_Builder_String;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
