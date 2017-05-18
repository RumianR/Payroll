// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class Employee implements Ordered{
	
	private long ID;
	private String fName;
	private String lName;
	private String city;
	private int hireYear;
	
	
	
	public Employee(long iD, String fName, String lName, String city, int hireYear) {
		ID = iD;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.hireYear = hireYear;
	}
	

	public Employee() {
		ID = 11111111;
		this.fName = "Default";
		this.lName = "Employee";
		this.city = "Paris";
		this.hireYear = 1535;
	}
	
	
	


	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public String toString() {
		if(city.length()<8)
		return ID+"\t"+ fName+"\t"+ lName+"\t"+ city+"\t\t"+ hireYear;
		else
			return ID+"\t"+ fName+"\t"+ lName+"\t"+ city+"\t"+ hireYear;
	}
	
	public boolean equals(Object o){
		if(this == null || o == null || ( this.getClass() != o.getClass() )  )
			return false;
		else{
			Employee e = (Employee) o;
			return this.ID == e.ID;
		}
			
	}
	
	public boolean precedes (Employee e){
		return this.hireYear < e.hireYear;
		
	}
	
	public boolean follows (Employee e){
		return this.hireYear > e.hireYear;
		
	}
	
	public double getSalary(){
		return 0;
	}
	
	public Employee(Employee e){
		ID = e.ID;
		this.fName = e.fName;
		this.lName = e.lName;
		this.city = e.city;
		this.hireYear = e.hireYear;

	}
	
	public Employee clone(){
		return new Employee(this);
	}
	
	

}
