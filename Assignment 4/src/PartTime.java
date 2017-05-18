// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------
public class PartTime extends Employee{
	
		private double hourlyRate;
		private int numbOfHours;
		private int numbOfStudents;
		
		
		public PartTime() {
			super();
			hourlyRate = 0;
			numbOfHours = 0;
			numbOfStudents = 0;
		}
		
		public PartTime(long iD, String fName, String lName, String city, int hireYear, double a, int b, int c) {
			super(iD, fName, lName, city, hireYear);
			hourlyRate = a;
			numbOfHours = b;
			numbOfStudents = c;
		}
		
		public double getHourlyRate() {
			return hourlyRate;
		}
		
		public void setHourlyRate(double hourlyRate) {
			this.hourlyRate = hourlyRate;
		}
		
		public double getNumbOfHours() {
			return numbOfHours;
		}
		
		public void setNumbOfHours(int numbOfHours) {
			this.numbOfHours = numbOfHours;
		}
		
		public int getnumbOfStudents() {
			return numbOfStudents;
		}
		
		public void setnumbOfStudents(int numbOfStudents) {
			this.numbOfStudents = numbOfStudents;
		}

		
		public String toString() {
			return super.toString()+"\t"+hourlyRate+"\t"+numbOfHours+"\t"+numbOfStudents;
		}
		
		public double getSalary(){
			double x = hourlyRate*numbOfHours;
			if(numbOfStudents>=40&&numbOfStudents<=60){
				return x+500;
			}
			else if(numbOfStudents>60)
				return x+1000;
			return x;
		}
		
		
	

}
