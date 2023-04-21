package method_overriding;

//Also called runtime polymorphism

//It occurs when a subclass has a method with the same name and signature 
//as a method in its superclass. 
//The subclass can override the method to provide its own implementation. 
//The method that gets called is determined at runtime based on the 
//object that the method is called on.

 class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

 class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

 class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
    	Animal animal=new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        animal.makeSound();
        animal1.makeSound(); 
        animal2.makeSound(); 
    }
}

