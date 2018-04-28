package P3;

public class Person {
	String fname, mnames, lname, number;
	long trn;
	int sex;
	Date dob;
	Address address;
	
	public Person(String fname, String mnames,String lname, String number, long trn, int sex,Date dob, Address address){
		this.fname=fname;
		this.mnames=mnames;
		this.lname=lname;
		this.number=number;
		this.trn=trn;
		this.sex=getSex();
		this.dob=dob;
		this.address=getAddress();
		
		
	}
}
