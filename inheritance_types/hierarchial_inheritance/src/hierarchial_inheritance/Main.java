package hierarchial_inheritance;

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

class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat(); 
        dog.bark(); 

        cat.eat(); 
        cat.meow();
    }
}
