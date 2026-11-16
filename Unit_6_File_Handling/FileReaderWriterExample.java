package Unit_6_File_Handling;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("Unit_6_File_Handling/input.txt");
            out = new FileWriter("Unit_6_File_Handling/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("File copied!");
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}

