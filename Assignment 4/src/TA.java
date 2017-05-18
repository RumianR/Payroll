// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class TA extends Employee {
	
	private String classification;
	private int nbOfClasses;
	private int totNbOfWH;
	
	
	
	public TA() {
		super();
		classification = "Grad";
		nbOfClasses = 0;
		totNbOfWH = 0;
	}
	
	public TA(long iD, String fName, String lName, String city, int hireYear,String c, int nb, int tot) {
		super(iD, fName, lName, city, hireYear);
		classification = c;
		nbOfClasses = nb;
		totNbOfWH = tot;
	}
	
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public int getNbOfClasses() {
		return nbOfClasses;
	}
	public void setNbOfClasses(int nbOfClasses) {
		this.nbOfClasses = nbOfClasses;
	}
	public double getTotNbOfWH() {
		return totNbOfWH;
	}
	public void setTotNbOfWH(int totNbOfWH) {
		this.totNbOfWH = totNbOfWH;
	}
	
	public String toString(){
		return super.toString()+"\t"+classification+"\t"+nbOfClasses+"\t"+totNbOfWH;
	}
	
	public double getSalary(){
		if(classification.equals("UGrad"))
			return 18.25*totNbOfWH;
		
			return (1.2*18.25*totNbOfWH);
	}
	

}
