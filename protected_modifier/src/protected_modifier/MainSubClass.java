package protected_modifier;

public class MainSubClass extends MyClass {

	public static void main(String[] args) {
		MainSubClass obj = new MainSubClass();
	        System.out.println(obj.myProtectedVar);
	        obj.myProtectedMethod();

	}

}
