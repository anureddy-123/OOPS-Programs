package javaPrograms;

class Employee {

	int empId;
	String ename;
	double salary;

	public Employee() {
		super();
		System.out.println("EmployeeDetails");
	}

	public Employee(int empId, String ename, double salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return ename;
	}

	public void seteName(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

enum ManagerType {
	HR, Sales;
}

class Manager extends Employee {

	ManagerType type;

	public Manager() {
		super();
	}

	public Manager(ManagerType type, int employeeId, String name, double salary) {
		super(employeeId, name, salary);
		this.type = type;
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	public void setMgrSalary() {

		if (type == ManagerType.HR) {

			salary = salary + 10000;
		}

		else {

			salary = salary + 5000;

		}
	}

	public void display() {
		System.out.println(
				"Manager [type=" + type + ", employeeId=" + empId + ", name=" + ename + ", Salary=" + salary + "]");
	}

}

class Clerk extends Employee {

	int speed;
	int accuracy;
	int increment = 0;

	public Clerk() {
		super();
	}

	public Clerk(int speed, int accuracy, int employeeId, String name, double salary) {
		super(employeeId, name, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public void setClerkSalary() {
		if (increment == 0) {
			if (speed >= 70 && accuracy >= 80) {
				salary = salary + 1000;
				increment++;
			}
		}

	}

	public void display() {
		System.out.println("Clerk [speed=" + speed + " " + ",accuracy=" + accuracy + ", employeeId=" + empId + " "
				+ ", name=" + ename + ", Salary=" + " " + salary + "]");
	}

}

class EmployeeClerk {

	public static void main(String[] args) {

		Manager m = new Manager(ManagerType.HR, 111, "Anureddy", 50000.0);
		m.setMgrSalary();
		m.display();
		Clerk e = new Clerk(90, 85, 1, "Manasa", 30000.0);
		e.setClerkSalary();
		e.display();

	}

}
