package single_inheritance;



 class Animal {
	 public void eat() {
	        System.out.println("Eating...");
	    }
}

 class Dog extends Animal{
	public void bark() {
        System.out.println("Barking...");
    }
}


public class Main {

	public static void main(String[] args) {
		 Dog dog = new Dog();
	        dog.eat();  
	        dog.bark(); 
	}

}
