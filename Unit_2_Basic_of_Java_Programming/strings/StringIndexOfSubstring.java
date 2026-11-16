package Unit_2_Basic_of_Java_Programming.strings;

public class StringIndexOfSubstring {
    public static void main(String[] args) {
        String strOrig = "Hello BCA Nepal";
        int id = strOrig.indexOf("BCA");
        
        if (id == -1)
            System.out.println("BCA not found");
        else
            System.out.println("Found 'BCA' at index " + id);
    }
}