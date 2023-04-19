package multilevel_inheritance;


class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

class Bulldog extends Dog {
    void run() {
        System.out.println("The bulldog is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog();
        bulldog.eat(); 
        bulldog.bark();
        bulldog.run(); 
    }
}