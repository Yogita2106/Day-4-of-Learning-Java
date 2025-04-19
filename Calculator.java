public class Calculator {

    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to add an integer and a double
    public double add(int num1, double num2) {
        return num1 + num2;
    }

    // Method to add an integer and a string
    public String add(int num1, String num2) {
        return num1 + " " + num2;
    }

    // Method to add three integers
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method to add three doubles
    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    // Method to add a string and an integer
    public String add(String str, int num) {
        return str + " " + num;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

       
        System.out.println("Integer addition: " + calculator.add(5, 3)); 
        System.out.println("Double addition: " + calculator.add(2.5, 3.7)); 
        System.out.println("Integer and Double addition: " + calculator.add(5, 2.5)); 
        System.out.println("String and Integer addition: " + calculator.add(5, "Hello")); 
        System.out.println("Three Integer addition: " + calculator.add(2, 3, 4)); 
        System.out.println("Three Double addition: " + calculator.add(1.1, 2.2, 3.3)); 
        System.out.println("String and Integer addition: " + calculator.add("World", 10)); 
    }
}