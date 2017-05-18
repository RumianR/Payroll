// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class Service extends Bills {
	
	private String Service_Name;
	private int Number_Hours;
	private double Hour_Rate;
	private double Total_Bill;
	
	public Service(){
		super();
		Service_Name = "NAV";
		Number_Hours = 9999;
		Hour_Rate = 0;
	}
	
	public Service(long id, String name, long sy, long billn, String sup, int sub, double ama, double tot){
		super( id,  name,  sy,  billn);
		Service_Name = sup;
		Number_Hours =sub ;
		Hour_Rate = ama;
		Total_Bill = tot;
	}
	
	public Service(Service e){
		super(e.getSupplier_ID(),e.getCompany_Name(),e.getStart_Year(), e.getBill_Number());
		Service_Name = e.Service_Name;
		Number_Hours = e.Number_Hours;
		Hour_Rate = e.Hour_Rate;
		Total_Bill = e.Hour_Rate;
	}

	public String getService_Name() {
		return Service_Name;
	}

	public void setService_Name(String Service_Name) {
		Service_Name = Service_Name;
	}

	public int getNumber_Hours() {
		return Number_Hours;
	}

	public void setNumber_Hours(int Number_Hours) {
		Number_Hours = Number_Hours;
	}

	public double getHour_Rate() {
		return Hour_Rate;
	}

	public void setHour_Rate(double Hour_Rate) {
		Hour_Rate = Hour_Rate;
	}
	
	

	
	public double getTotal_Bill() {
		return Total_Bill;
	}

	public void setTotal_Bill(double total_Bill) {
		Total_Bill = total_Bill;
	}

	public String toString() {
		return super.toString()+ Service_Name+" "+super.getCompany_Name()+" "+super.getStart_Year()+" "+super.getBill_Number()+" "+Number_Hours+" "+Hour_Rate+" "+Total_Bill;
	}
	
	public boolean equals(Object o){
		if(this == null || o == null || ( this.getClass() != o.getClass() )  )
			return false;
		else{
			Service e = (Service) o;
			return this.getSupplier_ID() == e.getSupplier_ID();
		}
			
	}
	
	public Service clone(){
		return new Service(this);
	}
	
	
	
	

}
