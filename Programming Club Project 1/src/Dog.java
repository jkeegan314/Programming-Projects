
public class Dog {

	String breed;
	public Dog(String type)
	{
		breed = type;
	}
	public void walk()
	{
		System.out.println("I am walking now");
	}
	public void run()
	{
		System.out.println("I am running now");
	}
	public void jump()
	{
		System.out.println("I am jumping now");
	}
	public void changeBreed(String newBreed)
	{
		breed = newBreed;
	}
	public String toString()
	{
		String description = "I am a " + breed;
		return description;
	}
}

