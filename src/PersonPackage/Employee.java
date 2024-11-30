package PersonPackage;

public class Employee extends Person {
	private Expertise expertise;

	public Employee(String name, int age, Expertise expertise) {
		super(name, age);
		this.expertise = expertise;
	}

	public Expertise getExpertise() {
		return expertise;
	}

}
