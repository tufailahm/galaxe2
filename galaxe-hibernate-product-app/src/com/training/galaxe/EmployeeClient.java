package com.training.galaxe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Contract_Employee;
import com.training.galaxe.model.Employee;
import com.training.galaxe.model.Regular_Employee;

public class EmployeeClient {

	public EmployeeClient() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("Nagendra");
		
		
		Regular_Employee regular_Employee = new Regular_Employee();
		regular_Employee.setName("Akshay");
		regular_Employee.setSalary(33000);
		regular_Employee.setBonus(29000);
		
		Contract_Employee contract_Employee = new Contract_Employee();
		contract_Employee.setName("Tufail");
		contract_Employee.setPay_per_hour(1000);
		contract_Employee.setContract_duration("128");
		
		
		session.save(employee);
		session.save(regular_Employee);
		session.save(contract_Employee);
		
		
		transaction.commit();
		session.close();
		sf.close();	
		System.out.println("Done");
	}
}
