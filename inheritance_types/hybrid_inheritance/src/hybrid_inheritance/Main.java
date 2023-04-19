package hybrid_inheritance;

class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    void bark() {
        System.out.println("The dog is barking.");
    }
    
    public void play() {
        System.out.println("The dog is playing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat(); // Output: The animal is eating.
        dog.bark(); // Output: The dog is barking.
        dog.play(); // Output: The dog is playing.
    }
}
