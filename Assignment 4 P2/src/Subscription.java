// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class Subscription extends Bills {
	
	private String Supplier_Name;
	private String Subscription_Type;
	private double Subscription_Amount;
	
	public Subscription(){
		super();
		Supplier_Name = "NAV";
		Subscription_Type = "Yearly";
		Subscription_Amount = 0;
	}
	
	public Subscription(long id, String name, long sy, long billn, String sup, String sub, double ama){
		super( id,  name,  sy,  billn);
		Supplier_Name = sup;
		Subscription_Type = sub;
		Subscription_Amount = ama;
	}
	
	public Subscription(Subscription e){
		super(e.getSupplier_ID(),e.getCompany_Name(),e.getStart_Year(), e.getBill_Number());
		Supplier_Name = e.Supplier_Name;
		Subscription_Type = e.Subscription_Type;
		Subscription_Amount = e.Subscription_Amount;
	}

	public String getSupplier_Name() {
		return Supplier_Name;
	}

	public void setSupplier_Name(String supplier_Name) {
		Supplier_Name = supplier_Name;
	}

	public String getSubscription_Type() {
		return Subscription_Type;
	}

	public void setSubscription_Type(String subscription_Type) {
		Subscription_Type = subscription_Type;
	}

	public double getSubscription_Amount() {
		return Subscription_Amount;
	}

	public void setSubscription_Amount(double subscription_Amount) {
		Subscription_Amount = subscription_Amount;
	}

	
	public String toString() {
		return super.toString()+ Supplier_Name+" "+super.getCompany_Name()+" "+super.getStart_Year()+" "+super.getBill_Number()+" "+Subscription_Type+" "+Subscription_Amount;
	}
	
	public boolean equals(Object o){
		if(this == null || o == null || ( this.getClass() != o.getClass() )  )
			return false;
		else{
			Subscription e = (Subscription) o;
			return this.getSupplier_ID() == e.getSupplier_ID();
		}
			
	}
	
	public Subscription clone(){
		return new Subscription(this);
	}
	
	
	
	

}
