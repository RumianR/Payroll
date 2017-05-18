// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class FullTime extends Employee{
	
	private long salary;
	
	

	public FullTime() {
		super();
		this.salary=0;
		
	}

	public FullTime(long iD, String fName, String lName, String city, int hireYear,long s) {
		super(iD, fName, lName, city, hireYear);
		this.salary=s;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return super.toString()+"\t"+salary;
	}

}
