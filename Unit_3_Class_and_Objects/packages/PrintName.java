package Unit_3_Class_and_Objects.packages;

import Unit_3_Class_and_Objects.packages.myPackage.MyClass;

public class PrintName {
    public static void main(String[] args) {
        String name = "My name is Rupesh Adhikari";
        MyClass obj = new MyClass();
        obj.getNames(name);
    }
}
