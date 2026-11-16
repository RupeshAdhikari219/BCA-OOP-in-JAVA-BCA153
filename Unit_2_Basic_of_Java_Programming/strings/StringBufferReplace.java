package Unit_2_Basic_of_Java_Programming.strings;

public class StringBufferReplace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.replace(6, 11, "Java");  
        System.out.println(sb);  // Output: Hello Java
    }
}
