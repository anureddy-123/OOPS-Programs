package studentTest;

class StudentTest {
	int studId;
	String sname;
	double examFee;

	public StudentTest() {
		super();
	}

	public StudentTest(int studId, String sname, double examFee) {
		super();
		this.studId = studId;
		this.sname = sname;
		this.examFee = examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" +" "+ studId + ", sname=" +" "+ sname + ", examFee=" +" "+ examFee + "]";
	}

	//public static void displayDetais() {

	//}

}

class DayScholor extends StudentTest {

	double transportFee;

	public DayScholor() {
		super();
	}

	public DayScholor(double transportFee, int studentId, String sname, Double examFee) {
		super(studentId, sname, examFee);
		this.transportFee = transportFee;
	}

	public void displaydayScholor() {
		System.out.println("DayScholor [transportFee=" + " "+transportFee + ", studentId=" +" "+studId + ", sname=" +" "+sname
				+ ", examFee=" +" "+examFee + "]");
	}

	public double payFee(double amount) {

		if (amount < (transportFee + examFee)) {
			return (transportFee + examFee) - amount;
		}
		else {
			return amount - (transportFee + examFee);
		}
	}

}

class Hosteller extends StudentTest {

	double hostelFee;

	public Hosteller() {
		super();
	}

	public Hosteller(double hostelFee, int studentId, String sname, Double examFee) {
		super(studentId, sname, examFee);
		this.hostelFee = hostelFee;
	}

	public void displayHosteller() {

		System.out.println("Hosteller [hostelFee=" +" "+hostelFee + ", studentId=" +" "+studId + ", sname=" +" "+sname
				+ ", examFee=" +" "+examFee + "]");

	}

	public double payFee(double amount) {

		if (amount < (hostelFee + examFee)) {
			return (hostelFee + examFee) - amount;
		}
		else {
			return amount - (hostelFee + examFee);
		}
	}

}

class Student {
	public static void main(String[] args) {

		DayScholor d = new DayScholor(4000, 1, "anureddy", 3000.0);
		d.displaydayScholor();

		Hosteller h = new Hosteller(60000, 1, "manasa", 2000.0);
		h.displayHosteller();
	}

}
