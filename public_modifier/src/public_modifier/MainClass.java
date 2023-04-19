package public_modifier;





public class MainClass extends MyClass {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		
		System.out.println(obj.myPublicVar);
        obj.myPublicMethod();

	}

}
