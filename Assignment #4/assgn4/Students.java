package overloading.assgn4;

public class Students {

	public void getStudentInfo() {
		System.out.println("Student Information");
		System.out.println("***********************");
	}
	
	//Method Overloading with 2 arguments
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID is: "+id);
		System.out.println("Student Name is: "+name);
		System.out.println("*******************************************");
	}

	//Method Overloading with 3 arguments
	public void getStudentInfo(int id, String name, String email, long phonenumber) {
		System.out.println("Student ID is: "+id);
		System.out.println("Student Name is: "+name);
		System.out.println("Student Email ID is: "+email);
		System.out.println("Student Phone Number is: "+phonenumber);
	}

	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo();
		std.getStudentInfo(101, "Naveen");//Method Overloading with 2 arguments
		std.getStudentInfo(102, "Kumar", "testleaf.com", 123456789l); //Method Overloading with 3 arguments
	}

}
