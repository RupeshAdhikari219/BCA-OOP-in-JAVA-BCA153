package Unit_2_Basic_of_Java_Programming.strings;

public class StringGetChars {
    public static void main(String[] args) {
        String str = "Java Programming";
        char[] arr = new char[7];  
        str.getChars(5, 12, arr, 0);  // Copies "Program" into arr
        System.out.println(arr);  // Output: Program
    }
}