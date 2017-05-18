// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class Staff extends Employee {

	private double salary;
	private char performanceCode;
	
	
	public Staff() {
		super();
		salary = 0;
		performanceCode = 'E';
		
	}
	public Staff(long iD, String fName, String lName, String city, int hireYear, double s, char p) {
		super(iD, fName, lName, city, hireYear);
		salary = s;
		performanceCode = p;
		
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getperformanceCode() {
		return performanceCode;
	}
	public void setperformanceCode(char performanceCode) {
		this.performanceCode = performanceCode;
	}
	
	public String toString(){
		return super.toString()+"\t"+salary+"\t"+performanceCode;
	}
	
	public Staff(Staff s){
		super(s);
		salary = s.salary;
		performanceCode = s.performanceCode;
	}
	
	public Staff clone(){
		return new Staff(this);
	}
	

}
