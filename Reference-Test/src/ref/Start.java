package ref;

public class Start {

	public static void main(String[] args) {
		Dog myDog = new Dog("Paula");
		Dog oldDog = myDog;
		
		foo(myDog);
		System.out.println("Name ist Naira?");
		System.out.println(myDog.getName().equals("Naira"));
		
		System.out.println("Hunde noch gleich?");
		System.out.println(myDog == oldDog);
		
		System.out.println("Name von oldDog: " + oldDog.getName());
	}

	public static void foo(Dog d) {
		System.out.println("Name ist Paula?");
		System.out.println(d.getName().equals("Paula"));
		d = new Dog("Fifi");
		d.setName("Naira");
	}
}
