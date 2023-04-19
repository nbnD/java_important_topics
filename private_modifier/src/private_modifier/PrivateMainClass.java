package private_modifier;

public class PrivateMainClass {

	private int myPrivateVar=40;
	
	 private void myPrivateMethod() {
	        System.out.println("This is a private method.");
	    }
	
	public static void main(String[] args) {
		PrivateMainClass obj=new PrivateMainClass();
		
		 System.out.println(obj.myPrivateVar);
	        obj.myPrivateMethod();

	}

}
