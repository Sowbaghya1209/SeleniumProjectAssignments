package org.student;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.getStudentInfo(111);
		obj.getStudentInfo(111, "Sow");
		obj.getStudentInfo("Sowba1300@gmail.com", 123456);
	}

	public void getStudentInfo(int id) {
		System.out.println("ID " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("ID " + id + "   " + "Name: " + name);
	}

	public void getStudentInfo(String email, int phoneNo) {
		System.out.println("Email: " + email + "   " + "PhoneNo: " + phoneNo);
	}

}
