package day2;

import java.sql.Date;

public class OverloadingDemo {
	
	public void add() {
		System.out.println("add without paramters");
	}
	public void add(int num1,int num2) {
		System.out.println("add with two paramters");

	}
	public void add(int...numbers) {
		int sum=0;
		System.out.println("add with var args paramters");
		for(int i:numbers) {
				sum+=i;
		}
		System.out.println("Sum of all the numbers are :"+sum);
	}
	public void admitPatient(String patientName,String symptoms) {
		System.out.println("admitting pateint with doctor details");
	}
	public void admitPatient(String patientName,String symptoms,String doctorName) {
		
	}
	public static void main(String[] args) {
			System.out.println(98.98);
			System.out.println(true);
			System.out.println("KK");
			
			OverloadingDemo demo = new OverloadingDemo();
			demo.add(12,99,998,887);
			demo.add(12,99,8);

			
	}
}
