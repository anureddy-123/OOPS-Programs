package employeeFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employe {
	int employe_id;
	String employe_name;
	String designation;
	double salary;

	public Employe() {
		super();
	}

	public Employe(int employe_id, String employe_name, String designation, double salary) {
		super();
		this.employe_id = employe_id;
		this.employe_name = employe_name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmploye_id() {
		return employe_id;
	}

	public void setEmploye_id(int employe_id) {
		this.employe_id = employe_id;
	}

	public String getEmploye_name() {
		return employe_name;
	}

	public void setEmploye_name(String employe_name) {
		this.employe_name = employe_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class EmployeeDetails {

	List<Employe> list = new ArrayList<>();

	public List<Employe> getList() {
		return list;
	}

	public void setList(List<Employe> list) {
		this.list = list;
	}

	public void readEmployeeDetails(String fileName) {

		EmployeeDetails empTest = new EmployeeDetails();

		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String string;
			while ((string = br.readLine()) != null) {
				String[] line = string.split(";");

				if (!(string.equals("IdNo"))) {
					Employe emp = new Employe();
					emp.setEmploye_id(Integer.parseInt(line[0]));
					emp.setEmploye_name(line[1]);
					emp.setDesignation(line[2]);
					emp.setSalary(Double.parseDouble(line[3]));
					list.add(emp);
				}

			}

			Iterator <Employe> itr = list.iterator();
			while (itr.hasNext()) {
				Employe e = (Employe) itr.next();
				System.out.println(
						e.getEmploye_id() + " " + e.getEmploye_name() + " " + e.getDesignation() + " " + e.getSalary());
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		EmployeeDetails empTest = new EmployeeDetails();

		empTest.readEmployeeDetails("D:\\data.txt");

	}

}
