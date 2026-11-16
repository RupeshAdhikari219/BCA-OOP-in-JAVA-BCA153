package Unit_5_Exception_Handling_and_Multithreading;

public class ErrorExample {
    public static void main(String[] args) {
        try {
            // Trying to create a very large array
            int[] largeArray = new int[Integer.MAX_VALUE];  // This will throw OutOfMemoryError
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred.");
        }
    }
}

