// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;




public class Driver {
	
	public static void fixTA() throws FileNotFoundException{
		
		
		
		Scanner in = new Scanner(new FileInputStream ("TAs.txt"));
	
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				 String classification = in.next();
				 int nbOfClasses = in.nextInt();
				 int totNbOfWH = in.nextInt();
				 
				
				 Employee ta = new TA(ID, fName, lName, city, hireYear, classification, nbOfClasses, totNbOfWH);
				 arr.add(ta);
				 
				 
			}
			
			in.close();
			
			PrintWriter pw = new PrintWriter (new FileOutputStream ("TAs.txt"));
			
			for(int i =0; i<arr.size();i++){
				TA ta =(TA) arr.get(i);
				 if(!(ta.getClassification().equals("Alum"))){
					 if(i==arr.size()-1)
					 pw.print(ta);
					 
					 else
						 pw.println(ta);
					 }
			}
			
			pw.close();
			
			
			
			
			
			
			
	}
	
public static void addTARecords() throws FileNotFoundException, InputMismatchException{
		
		Scanner in = new Scanner(new FileInputStream ("TAs.txt"));
	
		ArrayList<Long> lng = new ArrayList<Long>();
		ArrayList<Employee> arr = new ArrayList<Employee>();
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				 String classification = in.next();
				 int nbOfClasses = in.nextInt();
				 int totNbOfWH = in.nextInt();
				 
				
				 Employee ta = new TA(ID, fName, lName, city, hireYear, classification, nbOfClasses, totNbOfWH);
				 arr.add(ta);
				 lng.add(ID);
			}
			
			in.close();
			
			Scanner user = new Scanner(System.in);
			System.out.println("Please enter your TA information in the format \nEmployee ID, First Name, Family Name, City of Residence, Hire Year, Classification of TA, Current Number of Classes the TA, Total Number of Working Hours");
			System.out.println("\nFor Example\n		2330909		Evelyn	Andrew		Montreal	2016	Grad	4	23");
			System.out.println("\nTo STOP enter -1");
			System.out.println("\nPlease enter the ID initally only or to STOP ENTER -1");
			
			 
			 String fName = "";
			 String lName="";
			 String city ="";
			 int hireYear=0;
			 String classification="";
			 int nbOfClasses=0;
			 int totNbOfWH =0;
			 
			boolean val = false;
			long ID = user.nextLong();
			boolean finished = false;
			boolean finished2 = false;
			boolean finished3 = false;
			while(!finished){
				if(lng.contains(ID)){
					System.out.println("Please enter a different ID, this ID has already been entered");
					ID = user.nextLong();
				}
				else
					finished = true;
			}
			
			
			if(ID != -1){
				System.out.println("Please enter the rest of the info in one line excluding ID");
				 
				  fName = user.next();
				  lName = user.next();
				  city = user.next();
				  hireYear = user.nextInt();
				  classification = user.next();
				  nbOfClasses = user.nextInt();
				  totNbOfWH = user.nextInt();
				 
				 	
			}
			
			else{
				System.out.println("You have chose to stop adding records");
				val=true;
			}
			
			while(!val){
				 Employee ta = new TA(ID, fName, lName, city, hireYear, classification, nbOfClasses, totNbOfWH);
				 arr.add(ta);
				 lng.add(ID);
				 System.out.println("Please enter all the record info in one line like the example shown above");
				 ID  	   = user.nextLong();
					if(ID == -1){
						System.out.println("You have chose to stop adding records");
						val=true;
						break;
					}
					while(!finished3){
						if(lng.contains(ID)){
							System.out.println("Please enter a different ID, this ID has already been entered");
							if(user.hasNext()){
								String fName1 = user.next();
								 String lName1 = user.next();
								  String city1 = user.next();
								  int hireYear1 = user.nextInt();
								  String classification1 = user.next();
								  int nbOfClasses1 = user.nextInt();
								  int totNbOfWH1 = user.nextInt();
						     
							}
						
							ID = user.nextLong();
							
							
						}
						else
							finished3 = true;
					}
					
				  fName = user.next();
				  lName = user.next();
				  city = user.next();
				  hireYear = user.nextInt();
				  classification = user.next();
				  nbOfClasses = user.nextInt();
				  totNbOfWH = user.nextInt();
			}
			
			PrintWriter pw = new PrintWriter (new FileOutputStream ("TAs.txt"));
			
			for(int i =0; i<arr.size();i++){
				TA ta =(TA) arr.get(i);
				 if(!(ta.getClassification().equals("Alum"))){
					 if(i==arr.size()-1)
					 pw.print(ta);
					 
					 else
						 pw.println(ta);
					 }
			}
			
			pw.close();
			
			System.out.println("All records have been successfully added...");
			
			
			
	}


public static void addFTRecords() throws FileNotFoundException, InputMismatchException{
		
		Scanner in = new Scanner(new FileInputStream ("Full-Time-Faculty.txt"));
	
		ArrayList<Long> lng = new ArrayList<Long>();
		ArrayList<Employee> arr = new ArrayList<Employee>();
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				 long salary = in.nextLong();
				 
				
				 Employee ta = new FullTime(ID, fName, lName, city, hireYear, salary);
				 arr.add(ta);
				 lng.add(ID);
				 
			}
			
			in.close();
			
			Scanner user = new Scanner(System.in);
			System.out.println("Please enter your FULLTIME information in the format \nEmployee ID, First Name, Family Name, City of Residence, Hire Year, Salary");
			System.out.println("\nFor Example\n		9084649		Tara	Richard		Montreal	2005	102000");
			System.out.println("\nTo STOP enter -1");
			System.out.println("\nPlease enter the ID initally only or to STOP ENTER -1");
			
			 
			 String fName = "";
			 String lName="";
			 String city ="";
			 int hireYear=0;
			 long salary =0;
			boolean val = false;
			long ID = user.nextLong();
			boolean finished = false;
			boolean finished2 = false;
			boolean finished3 = false;
			while(!finished){
				if(lng.contains(ID)){
					System.out.println("Please enter a different ID, this ID has already been entered");
					ID = user.nextLong();
				}
				else
					finished = true;
			}
			
			
			
			if(ID != -1){
				System.out.println("Please enter the rest of the info in one line excluding ID");
				 
				  fName = user.next();
				  lName = user.next();
				  city = user.next();
				  hireYear = user.nextInt();
				  salary = user.nextLong();
				 
				 	
			}
			
			else{
				System.out.println("You have chose to stop adding records");
				val=true;
			}
			
			while(!val){
				 Employee ta = new FullTime(ID, fName, lName, city, hireYear, salary);
				 arr.add(ta);
				 lng.add(ID);
				 System.out.println("Please enter all the record info in one line like the example shown above");
				 ID  	   = user.nextLong();
					if(ID == -1){
						System.out.println("You have chose to stop adding records");
						val=true;
						break;
					}
					
					while(!finished3){
						if(lng.contains(ID)){
							System.out.println("Please enter a different ID, this ID has already been entered");
							if(user.hasNext()){
								String fName1 = user.next();
								 String lName1 = user.next();
								  String city1 = user.next();
								  int hireYear1 = user.nextInt();
								  long salary1 = user.nextLong();
						     
							}
						
							ID = user.nextLong();
							
							
						}
						else
							finished3 = true;
					}
				  fName = user.next();
				  lName = user.next();
				  city = user.next();
				  hireYear = user.nextInt();
				  salary = user.nextLong();
				  
			}
			
			PrintWriter pw = new PrintWriter (new FileOutputStream ("Full-Time-Faculty.txt"));
			
			for(int i =0; i<arr.size();i++){
				FullTime ta =(FullTime) arr.get(i);
				 
					 if(i==arr.size()-1)
					 pw.print(ta);
					 
					 else
						 pw.println(ta);
					 
			}
			
			pw.close();
			
			System.out.println("All records have been successfully added...");
			
			
			
	}


public static void addPTRecords() throws FileNotFoundException, InputMismatchException{
		
		Scanner in = new Scanner(new FileInputStream ("Part-Time-Faculty.txt"));
	
		ArrayList<Long> lng = new ArrayList<Long>();
		ArrayList<Employee> arr = new ArrayList<Employee>();
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				  double hourlyRate = in.nextDouble();
				  int numbOfHours= in.nextInt();
					 int numbOfStudents=in.nextInt();
					
				 
				
				 Employee ta = new PartTime(ID, fName, lName, city, hireYear, hourlyRate, numbOfHours,numbOfStudents);
				 arr.add(ta);
				 lng.add(ID);
				 
			}
			
			in.close();
			
			Scanner user = new Scanner(System.in);
			System.out.println("Please enter your PART TIME information in the format \nEmployee ID, First Name, Family Name, City of Residence, Hire Year, Hourly Rate, Number of Hours, Number of Students");
			System.out.println("\nFor Example\n		7790128		Madison Logan		Montreal	2017	45.90	110	  97");
			System.out.println("\nTo STOP enter -1");
			System.out.println("\nPlease enter the ID initally only or to STOP ENTER -1");
			
			 
			 String fName = "";
			 String lName="";
			 String city ="";
			 int hireYear=0;
			 double hourlyRate = 0;
			  int numbOfHours= 0;
				 int numbOfStudents=0;
				
			 
			boolean val = false;
			long ID = user.nextLong();
			boolean finished = false;
			boolean finished2 = false;
			boolean finished3 = false;
			while(!finished){
				if(lng.contains(ID)){
					System.out.println("Please enter a different ID, this ID has already been entered");
					ID = user.nextLong();
				}
				else
					finished = true;
			}
			
			
			
			if(ID != -1){
				System.out.println("Please enter the rest of the info in one line excluding ID");
				 
				  fName = user.next();
				  lName = user.next();
				  city = user.next();
				  hireYear = user.nextInt();
				   hourlyRate = user.nextDouble();
				   numbOfHours= user.nextInt();
					  numbOfStudents=user.nextInt();
					
				 
				 	
			}
			
			else{
				System.out.println("You have chose to stop adding records");
				val=true;
			}
			
			while(!val){
				 Employee ta = new PartTime(ID, fName, lName, city, hireYear, hourlyRate, numbOfHours, numbOfStudents);
				 arr.add(ta);
				 lng.add(ID);
				 System.out.println("Please enter all the record info in one line like the example shown above");
				 ID  	   = user.nextLong();
					if(ID == -1){
						System.out.println("You have chose to stop adding records");
						val=true;
						break;
					}
					while(!finished3){
						if(lng.contains(ID)){
							System.out.println("Please enter a different ID, this ID has already been entered");
							if(user.hasNext()){
								String fName1 = user.next();
								 String lName1 = user.next();
								  String city1 = user.next();
								  int hireYear1 = user.nextInt();
								  double hourlyRate1 = user.nextDouble();
								   int numbOfHours1= user.nextInt();
									  int numbOfStudents1=user.nextInt();
								  
						     
							}
						
							ID = user.nextLong();
							
							
						}
						else
							finished3 = true;
					}
					
				  fName = user.next();
				  lName = user.next();
				  city = user.next();
				  hireYear = user.nextInt();
				  hourlyRate = user.nextDouble();
				   numbOfHours= user.nextInt();
					  numbOfStudents=user.nextInt();
					
			}
			
			PrintWriter pw = new PrintWriter (new FileOutputStream ("Part-Time-Faculty.txt"));
			
			for(int i =0; i<arr.size();i++){
				PartTime ta =(PartTime) arr.get(i);
				 
					 if(i==arr.size()-1)
					 pw.print(ta);
					 
					 else
						 pw.println(ta);
					 
			}
			
			pw.close();
			
			System.out.println("All records have been successfully added...");
			
			
			
	}

	public static double findTermSalary() throws FileNotFoundException{
		Scanner in = null;
		in = new Scanner(new FileInputStream ("Part-Time-Faculty.txt"));
	
		
		LinkedList PT = new LinkedList();
		
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				  double hourlyRate = in.nextDouble();
				 int numbOfHours= in.nextInt();
				int numbOfStudents=in.nextInt();
					
				 
				
				 Employee ta = new PartTime(ID, fName, lName, city, hireYear, hourlyRate, numbOfHours,numbOfStudents);
				 PT.AddToEnd(ta);
				 
				 
			}
			
			in.close();
			
			in = new Scanner(new FileInputStream ("TAs.txt"));
			
			
			LinkedList TA = new LinkedList();
			
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				 String classification = in.next();
				 int nbOfClasses = in.nextInt();
				 int totNbOfWH = in.nextInt();
				 
				
				 Employee ta = new TA(ID, fName, lName, city, hireYear, classification, nbOfClasses, totNbOfWH);
				 TA.AddToEnd(ta);
					 
				}
				
				in.close();
				
				double total = PT.findTermSalary1()+TA.findTermSalary1();
				return total;
			
	}
	
	public static void findHighest_and_Lowest_FT_Salary() throws FileNotFoundException, InputMismatchException{

		Scanner in = new Scanner(new FileInputStream ("Full-Time-Faculty.txt"));
	
		
		    LinkedList FT = new LinkedList();
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				 long salary = in.nextLong();
				 
				
				 Employee ta = new FullTime(ID, fName, lName, city, hireYear, salary);
				 FT.AddToEnd(ta);
				 
			}
			
			in.close();
			
			System.out.println("The max is: "+FT.findMax()+" and the min is: "+FT.findMin());
			
	}
	
	public static void Increase_Staff_Salary() throws FileNotFoundException, InputMismatchException{

		Scanner in = new Scanner(new FileInputStream ("Staff.txt"));
	
		
		    LinkedList ST = new LinkedList();
			while(in.hasNextLine()){
				
				 long ID = in.nextLong();
				 String fName = in.next();
				 String lName = in.next();
				 String city = in.next();
				 int hireYear = in.nextInt();
				 
				  double salary = in.nextDouble() ;
				  String performanceCode= in.next() ;
				  char pf= performanceCode.charAt(0);
				 
				
				 Employee ta = new Staff(ID, fName, lName, city, hireYear, salary,pf);
				 ST.AddToEnd(ta);
				 
			}
			
			in.close();
			 ST.Increase_Staff_Salary1();
			 
			PrintWriter pw = new PrintWriter(new FileOutputStream("Staff.txt"));
			
			for(int i=0; i<ST.getCounter();i++){
				if(i==ST.getCounter()-1)
					 pw.print(ST.getStaff(i));
				else{
				pw.println(ST.getStaff(i));}
				
				
			}
			
			pw.close();
			
	}


	
	

	public static void main(String[] args) {
		
		try{
			
			fixTA();
			addTARecords();
			addPTRecords();
			addFTRecords();
			System.out.println(findTermSalary());
			findHighest_and_Lowest_FT_Salary();
			Increase_Staff_Salary();
			
		}
		
		catch(FileNotFoundException e){
			System.out.println("uma uma");
			System.exit(0);
	
		}
		
try{
			
		
			
		}
		
		catch(Exception e){
			System.out.println("uma uma");
			System.exit(0);
	
		}
		
		
		

	}
	
	

}
