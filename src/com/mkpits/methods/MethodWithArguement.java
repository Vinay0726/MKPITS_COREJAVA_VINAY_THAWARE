package com.mkpits.methods;

public class MethodWithArguement {

	public static void main(String[] args) {
	 String fName="Vinay";
	 String lName="Thaware";
	 String email="Vinay@123";
	 String gender="male";
	 long myMobile=9373007087l;
	 String password="Vinay@123";
	 
	 MethodWithArguement m=new MethodWithArguement();
//	 calling method
//	 (arguement) pass
	 m.getfirstName(fName);
	 m.getlastName(lName);
	 m.getmyEmail(email);
	 m.getmyGender(gender);
	 m.getmyMobile(mobile);
	 m.getmyPassword(password);
	 
	 

	}
//    called method
//	(parameter) hold and use
	public void getmyPassword(String password) {
		System.out.println("Password:"+password);
		
	}

	public void getmyMobile(long mobile) {
//		add new variable & print
		long myNewMobile=7249729185l;
		System.out.println("Mobile:"+myNewMobile);
	}

	public void getmyGender(String gender) {
		System.out.println("Gender:"+gender);
		
	}

	public void getmyEmail(String email) {
		System.out.println("Email:"+email);
		
	}

	public void getlastName(String lName) {
		System.out.println("Last Name:"+lName);
		
	}

	public void getfirstName(String fName) {
		System.out.println("First Name:"+fName);
		
	}

}