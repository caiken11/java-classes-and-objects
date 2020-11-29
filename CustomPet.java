package pets;

public class CustomPet {

	private String name;
	private int furLevel;
	private String type;
	
	public CustomPet() {
		name = "Lost dog";
		furLevel = 2;
		type = "dog";
	}
	public CustomPet(String name, String type) {
		furLevel = 2;
		this.name = name;
		this.type = type;
		
	}
	public CustomPet (String name, int furLevel, String type) {
		this.name = name;
		this.furLevel = furLevel;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFurLevel () {
		return furLevel;
	}
	public void setFurLevel(int furLevel) {
		this.furLevel = furLevel;
	}
	public String getType () {
		return type;
	}
	public void setType(String type) {
		this.type = type; 
	}
	public boolean isFurry () {
		if(this.furLevel >= 2) {
			return true;
		}else {
			return false;
		}
	}
	public String run() {
		return (this.name + "is running");
	}

	public static void main(String[] args) {
		CustomPet dog = new CustomPet();
		System.out.println(dog.getName());
		dog.setName("Spot");
		System.out.println(dog.getName());
		dog.setFurLevel(1);
		System.out.println(dog.isFurry());
		
	}
}
