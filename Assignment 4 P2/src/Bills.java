// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------

public class Bills  {
	private long Supplier_ID;
	private String Company_Name;
	private long Start_Year;
	private long Bill_Number;
	private double Hour_Rate;
	
	public Bills(){
		Supplier_ID= 10000000;
		Company_Name = "Bell Canada";
		Start_Year = 1939;
		Bill_Number = 999999;
	}
	
	public Bills(long id, String name, long sy, long billn){
		Supplier_ID= id;
		Company_Name = name;
		Start_Year = sy;
		Bill_Number = billn;
	}
	
	public Bills(Bills e){
		Supplier_ID= e.getSupplier_ID();
		Company_Name = e.getCompany_Name();
		Start_Year = e.Start_Year;
		Bill_Number = e.Bill_Number;
	}

	public long getSupplier_ID() {
		return Supplier_ID;
	}
	public double getHour_Rate() {
		return Hour_Rate;
	}

	public void setSupplier_ID(long supplier_ID) {
		Supplier_ID = supplier_ID;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public long getStart_Year() {
		return Start_Year;
	}

	public void setStart_Year(long start_Year) {
		Start_Year = start_Year;
	}

	public long getBill_Number() {
		return Bill_Number;
	}

	public void setBill_Number(long bill_Number) {
		Bill_Number = bill_Number;
	}

	
	public String toString() {
		return Supplier_ID+" ";
	}
	
	public boolean equals(Object o){
		if(this == null || o == null || ( this.getClass() != o.getClass() )  )
			return false;
		else{
			Bills e = (Bills) o;
			return this.Supplier_ID == e.Supplier_ID;
		}
			
	}
	
	public Bills clone(){
		return new Bills(this);
	}
	
	
	
	

}
