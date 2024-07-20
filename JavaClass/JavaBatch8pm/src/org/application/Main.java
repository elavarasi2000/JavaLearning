package org.application;

import org.diffpkg.Student;
import org.sample.Company;
import org.sample.Employee;


public class Main {
	
	
	public static void main(String[] args) {
		Company cm = new Company();
		cm.companyName();
		
		Student st = new Student();
		st.studentName();
		
		Employee em = new Employee();
		em.employeeID();
	}


}
