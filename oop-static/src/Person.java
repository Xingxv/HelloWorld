
public class Person {

	// TODO

	String name;
	static int count;

	public Person(String name) {
		this.name = name;
	}
	
	public static int getCount() {
		count += 1;
		return count;
	}

}
