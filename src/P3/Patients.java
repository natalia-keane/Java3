package P3;

import java.util.Date;

public class Patients {
	String fname, mnames, lname, number;
	long trn;
	int sex;
	Date dob;
	Address address;
	float height, weight;
	
	public Patients(String fname, String mnames, String lname, String number, long trn, int sex, Date dob, Address address, float height, float weight){
		this.fname=fname;
		this.mnames=mnames;
		this.lname=lname;
		this.number=number;
		this.trn=trn;
		this.dob=dob;
		this.address=address;
		this.height=height;
		this.weight=weight;
		 
	}
	}
