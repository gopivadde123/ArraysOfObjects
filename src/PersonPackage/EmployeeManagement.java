package PersonPackage;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = { new Employee("Gopi", 30, Expertise.JAVA), new Employee("Ramu", 28, Expertise.CPP),
				new Employee("Kiran", 35, Expertise.BOTH), new Employee("Somu", 40, Expertise.CPP),
				new Employee("Raju", 55, Expertise.JAVA) };
		int cppExperts = 0;
		int javaExperts = 0;
		int bothExperts = 0;
		for (Employee emp : employees) {
			switch (emp.getExpertise()) {
			case CPP:
				cppExperts++;
				break;
			case JAVA:
				javaExperts++;
				break;
			case BOTH:
				bothExperts++;
				break;
			}
		}
		System.out.println("Number of C++ Experts: " + cppExperts);
		System.out.println("Number of Java Experts: " + javaExperts);
		System.out.println("Number of Experts in both C++ and Java: " + bothExperts);

	}

}
