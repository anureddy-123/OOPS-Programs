package javaPrograms;

class AbsStudent {

	String studentName;
	String studentClass;
	protected static int totalNoOfStudents = 800;

	public AbsStudent() {
		super();
	}

	public AbsStudent(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	public void display() {
		System.out.println("AbsStudentTest [studentName="+" "+ studentName + ", studentClass="+" " + studentClass + "]");
	}

}

class ScienceStudent extends AbsStudentTest {

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public void getPercentage(int physicsMarks, int chemistryMarks, int mathsMarks) {

		int totalMarks = physicsMarks + chemistryMarks + mathsMarks;

		int totalpercentage = (totalMarks / 3);

		System.out.println("Science Student" + " " + totalpercentage);
	}

}

class HistoryStudent extends AbsStudent {
	int historyMarks;
	int civicsMarks;

	public void getPercentage(int historyMarks, int civicsMarks) {
		int totalMarks = historyMarks + civicsMarks;

		int totalpercentage = (totalMarks / 2);
		System.out.println("History Student" + " " + totalpercentage);

	}

}

class AbsStudentTest {

	public static void main(String[] args) {

		AbsStudent as = new AbsStudent("Anureddy", "9thStandard");

		System.out.println("TotalNo of Students" +" "+ as.totalNoOfStudents);
		as.display();

		ScienceStudent ss = new ScienceStudent();
		ss.getPercentage(60, 66, 56);
		HistoryStudent hs = new HistoryStudent();
		hs.getPercentage(75, 70);

	}

}
