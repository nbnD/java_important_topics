package multiple_inheritance;

 interface Animal {
    void eat();
}

 interface CanRun {
    void run();
}

 class Dog implements Animal, CanRun {
    public void eat() {
        System.out.println("Eating...");
    }
    public void run() {
        System.out.println("Running...");
    }
}

public class Main {

	public static void main(String[] args) {
		 Dog dog = new Dog();
	        dog.eat();
	        dog.run(); 
	}

}
