package Unit_2_Basic_of_Java_Programming.strings;

public class StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(6, "Java ");
        System.out.println(sb);  // Output: Hello Java World
    }
}
