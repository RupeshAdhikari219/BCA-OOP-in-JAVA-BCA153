package Unit_2_Basic_of_Java_Programming.strings;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray(); 
        for (char ch : charArray) {
            System.out.print(ch + " ");  // Output: H e l l o
        }
    }
}
