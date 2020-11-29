package pets;

public class Pets {
	private String name;
	private int age;
	private String location;
	private String type;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Pets(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pets dog = new Pets("Fido", 2, "Outside", "Dog");
	System.out.println(dog.getName());
	}

}
