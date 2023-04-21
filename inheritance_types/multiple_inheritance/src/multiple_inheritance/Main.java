package multiple_inheritance;

 interface Animal {
    void eat();
}

 interface CanRun {
    void run();
}
 interface Bark{
	 void bark();
 }

 class Dog implements Animal, CanRun,Bark {
    public void eat() {
        System.out.println("Eating...");
    }
    public void run() {
        System.out.println("Running...");
    }
    
    public void bark() {
    	 System.out.println("Barking...");
    }
    
}

public class Main {

	public static void main(String[] args) {
		 Dog dog = new Dog();
	        dog.eat();
	        dog.run(); 
	        dog.bark();
	}

}
