package Unit_6_File_Handling.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Rupesh Adhikari";
        employee.address = "Jhapa";
        employee.SSN = 0;
        employee.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("Unit_6_File_Handling/serialization/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);  // Serializing the object
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }
    }
}

