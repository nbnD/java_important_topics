package method_overloading;


//this is also called compile time Polymorphism 
// occurs when there multiple methods with the same name in a class but different arguments
// and parameters. 
//During compilation, 
//Java determines which method to call based on the arguments passed to it.

 class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a+b));
    }
    
    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a+b));
    }
    
    public void add(String a, String b) {
        System.out.println("Concatenation of two strings: " + a.concat(b));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 10);
        calc.add(5.5, 10.5);
        calc.add("Hello ", "World");
    }
}

