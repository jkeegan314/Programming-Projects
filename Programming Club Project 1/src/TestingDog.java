
public class TestingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog dog1 = new Dog("corgy");
Dog anotherdog = new Dog("husky");
dog1.walk();
anotherdog.run();
dog1.changeBreed("doxin");
System.out.println(dog1);
System.out.println(anotherdog);

	}

}
