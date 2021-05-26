package employee;

class Employee1 {

	int employeeId;
	String employeeName;
	double basicSalary;
	double grossSalary;

	public Employee1() {
		super();
		System.out.println("default");
	}

	public Employee1(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;

	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = grossSalary;
	}

}

class Manager extends Employee1 {

	public Manager() {
		System.out.println("default manager");

	}

	public Manager(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);

	}

	@Override
	public void setBasicSalary(double basicSalary) {
		grossSalary = basicSalary + ((15 * basicSalary) / 100);
	}

	public void displayManager() {
		System.out.println("Manager [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary="
				+ basicSalary + ", grossSalary=" + grossSalary + "]");
	}

}

class Trainee extends Employee1 {

	public Trainee() {
		System.out.println("default trainee");

	}

	public Trainee(int employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);

	}

	@Override
	public void setBasicSalary(double basicSalary) {
		grossSalary = basicSalary + ((10 * basicSalary) / 100);
	}

	public void displayTrainee() {
		System.out.println("Trainee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary="
				+ basicSalary + ", grossSalary=" + grossSalary + "]");
	}

}

public class EmployeeManager {
	public static void main(String[] args) {
		Manager m = new Manager(101, "sravya", 80000.00);
		m.setBasicSalary(4000);
		m.displayManager();
		Trainee t = new Trainee(100, "Anushareddy", 50000.0);
		t.setBasicSalary(2000);
		t.displayTrainee();
	}

}
