package P3;

import java.util.Date;

public class Employee {
	String fname, mnames, lname, number, department;
	long trn;
	int sex;
	Date dob; 
	Address address; 
	float height, weight;
	
	
	public Employee(String fname, String mnames,String lname, String number, long trn, int sex, Date dob, Address address, float height, float weight, String department){
		this.fname=fname;
		this.mnames=mnames;
		this.lname=lname;
		this.number=number;
		this.trn=trn;
		this.dob=dob;
		this.address=address;
		this.height=height;
		this.weight=weight;
		this.sex=sex;
		this.department=department;
		 
		
	}
	

}
