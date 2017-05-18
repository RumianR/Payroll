// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	
	public static void addBills() throws FileNotFoundException{
		
Scanner in = new Scanner(new FileInputStream ("Bills.txt"));

	
		ArrayList<Long> lng = new ArrayList<Long>();
		ArrayList<Bills> arr = new ArrayList<Bills>();
		
			while(in.hasNext()){
				
				long Supplier_ID = in.nextLong();
				String Supplier_Name = in.next();
				String Company_Name = in.next();
				long Start_Year= in.nextLong();
				long Bill_Number = in.nextInt();
				
				if(in.hasNext()){
					String Subscription_Type = in.next();
					double Subscription_Amount = in.nextDouble();
					if(in.hasNextLine())
					 in.nextLine();
				
				arr.add(new Subscription(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Subscription_Type, Subscription_Amount));
				lng.add(Supplier_ID);
				
					
				}
				
				else{
					int Number_Hours = in.nextInt();
					double Hour_Rate = in.nextDouble();
					double Total_Bill = in.nextDouble();
					if(in.hasNextLine())
						 in.nextLine();
					
				arr.add(new Service(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Number_Hours, Hour_Rate,Total_Bill));
				lng.add(Supplier_ID);
					
				}
				
				
				
				 
				
				 
				 
			}
			
			in.close();
			
			Scanner user = new Scanner(System.in);
			
			
			
			
			System.out.println("\nPlease enter the Supplier ID initally only or to STOP ENTER -1");
			
			 
			long Supplier_ID = 999999;
			String Supplier_Name = "NAV";
			String Company_Name = "Bell";
			int Start_Year= 2000;
			long Bill_Number = 99999;
			String Subscription_Type = "Press";
			double Subscription_Amount = 0;
			int Number_Hours = 0;
			double Hour_Rate = 0;
			double Total_Bill = 0;
			
			
			String type = "";
			boolean val = false;
			
			Supplier_ID = user.nextLong();
			if(Supplier_ID!=-1){
			System.out.println("Please Type subscription or service \n ");
			type = user.next();}
			boolean finished = false;
			boolean finished2 = false;
			boolean finished3 = false;
			while(!finished){
				if(lng.contains(Supplier_ID)){
					System.out.println("Please enter a different ID, this ID has already been entered");
					Supplier_ID = user.nextLong();
				}
				else
					finished = true;
			}
			if(Supplier_ID != -1){
				
				if( type.equals("subscription")){
				
				System.out.println("Please enter the rest of the info in one line excluding ID\n");
				System.out.println("For example\n");
				System.out.println("	Supplier Name, Company Name, start Year, Bill number, subscription type, Subscription amount");
				 
				 
				 Supplier_Name = user.next();
				 Company_Name = user.next();
				 Start_Year= user.nextInt();
				 Bill_Number = user.nextInt();
				 Subscription_Type = user.next();
			     Subscription_Amount = user.nextDouble();
				 
				  
				}
				
				else{

					System.out.println("Please enter the rest of the info in one line excluding ID\n");
					System.out.println("For example\n");
					System.out.println("	Service Name, Company Name, Start Year, Bill number, Number of hours, hour rate, and Total bill");
					 
					 
					 Supplier_Name = user.next();
					 Company_Name = user.next();
					 Start_Year= user.nextInt();
					 Bill_Number = user.nextInt();
					 Number_Hours = user.nextInt();
					 Hour_Rate = user.nextDouble();
					 Total_Bill = user.nextDouble();
					
				}
				 
				 	
			}
			
			else{
				System.out.println("You have chose to stop adding bill records");
				val=true;
			}
			
			while(!val){
				if(type.equals("subscription")){
				 Bills sub = new Subscription(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Subscription_Type, Subscription_Amount);
				 arr.add(sub);
				 lng.add(Supplier_ID);
				
				 System.out.println("Please enter all the record info in one line like the example shown above but enter the ID before all that");
				 Supplier_ID  	   = user.nextLong();
					if(Supplier_ID == -1){
						System.out.println("You have chose to stop adding records");
						val=true;
						break;
					}
					
					 while(!finished2){
							if(lng.contains(Supplier_ID)){
								System.out.println("Please enter a different ID, this ID has already been entered");
								if(user.hasNext()){
								String Supplier_Name1 = user.next();
								 String Company_Name1 = user.next();
								int Start_Year1= user.nextInt();
								 int Bill_Number1 = user.nextInt();
								 String Subscription1_Type = user.next();
							     Double Subscription1_Amount = user.nextDouble();
							     
								}
							
								Supplier_ID = user.nextLong();
								
								
							}
							else
								finished2 = true;
						}
					 Supplier_Name = user.next();
					 Company_Name = user.next();
					 Start_Year= user.nextInt();
					 Bill_Number = user.nextInt();
					 Subscription_Type = user.next();
				     Subscription_Amount = user.nextDouble();
				}
				
				else{
					Bills serv = new Service(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Number_Hours, Hour_Rate,Total_Bill);
					 arr.add(serv);
					 lng.add(Supplier_ID);
					
					 System.out.println("Please enter all the record info in one line like the example shown above but enter the ID before all that");
					 Supplier_ID  	   = user.nextLong();
						if(Supplier_ID == -1){
							System.out.println("You have chose to stop adding records");
							val=true;
							break;
						}
						 while(!finished3){
								if(lng.contains(Supplier_ID)){
									System.out.println("Please enter a different ID, this ID has already been entered");
									if(user.hasNext()){
									String Supplier_Name1 = user.next();
									 String Company_Name1 = user.next();
									int Start_Year1= user.nextInt();
									 int Bill_Number1 = user.nextInt();
									int  Number_Hours1 = user.nextInt();
									 double Hour_Rate1 = user.nextDouble();
									 double Total_Bill1 = user.nextDouble();
								     
									}
								
									Supplier_ID = user.nextLong();
									
									
								}
								else
									finished3 = true;
							}
						 Supplier_Name = user.next();
						 Company_Name = user.next();
						 Start_Year= user.nextInt();
						 Bill_Number = user.nextInt();
						 Number_Hours = user.nextInt();
						 Hour_Rate = user.nextDouble();
						 Total_Bill = user.nextDouble();
				}
			}
			
			PrintWriter pw = new PrintWriter (new FileOutputStream ("Bills.txt"));
			
			for(int i =0; i<arr.size();i++){
				
					 
					 pw.println(arr.get(i));
					 
					 
					
			}
			
			pw.close();
			
			System.out.println("All records have been successfully added...");
			
			
			
	}
	
	public static double findSupllierTotal_Bills() throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileInputStream ("Bills.txt"));

			
				
				ArrayList<Bills> arr = new ArrayList<Bills>();
				
					while(in.hasNext()){
						
						long Supplier_ID = in.nextLong();
						String Supplier_Name = in.next();
						String Company_Name = in.next();
						long Start_Year= in.nextLong();
						long Bill_Number = in.nextInt();
						
						if(in.hasNext()){
							String Subscription_Type = in.next();
							double Subscription_Amount = in.nextDouble();
							if(in.hasNextLine())
							 in.nextLine();
						
						arr.add(new Subscription(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Subscription_Type, Subscription_Amount));
						
						
							
						}
						
						else{
							int Number_Hours = in.nextInt();
							double Hour_Rate = in.nextDouble();
							double Total_Bill = in.nextDouble();
							if(in.hasNextLine())
								 in.nextLine();
							
						arr.add(new Service(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Number_Hours, Hour_Rate,Total_Bill));
						
							
						}
						
						
						
						 
						
						 
						 
					}
					
					in.close();
					Service a = new Service(2, "", 2,2 , "", 2, 2,2);
					Subscription b = new Subscription(2, "", 2,2 , "", "", 2);
					double cost =0;
					for(int i=0; i<arr.size();i++){
						if(arr.get(i).getClass()== a.getClass()){
							Service l = (Service)arr.get(i);
							cost+=l.getTotal_Bill();
						}
						
						else if(arr.get(i).getClass()== b.getClass()){
							Subscription m = (Subscription)arr.get(i);
							cost+=m.getSubscription_Amount();
						}
						
					}
					
					return cost;
			}
	
	
	public static void findHighest_and_LowestService() throws FileNotFoundException{

		Scanner in = new Scanner(new FileInputStream ("Bills.txt"));

			
				ArrayList<Long> lng = new ArrayList<Long>();
				ArrayList<Bills> arr = new ArrayList<Bills>();
				LinkedList ll = new LinkedList();
				
					while(in.hasNext()){
						
						long Supplier_ID = in.nextLong();
						String Supplier_Name = in.next();
						String Company_Name = in.next();
						long Start_Year= in.nextLong();
						long Bill_Number = in.nextInt();
						
						if(in.hasNextInt()){
							
						
							int Number_Hours = in.nextInt();
							double Hour_Rate = in.nextDouble();
							double Total_Bill = in.nextDouble();
							if(in.hasNextLine())
								 in.nextLine();
							
							ll.AddToEnd(new Service(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Number_Hours, Hour_Rate,Total_Bill));
						
						
						
						 
						
						 
						 
					}
						
						else{
							String Subscription_Type = in.next();
							double Subscription_Amount = in.nextDouble();
							if(in.hasNextLine())
							 in.nextLine();
						}
						
					}
					
					in.close();
					Service sc = new Service();
					for(int i=0 ; i<arr.size(); i++){
						
							if(arr.get(i).getClass()==sc.getClass())
							System.out.println(arr.get(i));
						
					}
						
			System.out.println("The max is: "+ll.findMax()+" and the min is: "+ll.findMin());
			
			
			
			
			
	}
	public static void removeBill(long billNumb) throws FileNotFoundException, InputMismatchException{
		
		
			
			Scanner in = new Scanner(new FileInputStream ("Bills.txt"));

				
					ArrayList<Long> lng = new ArrayList<Long>();
					ArrayList<Bills> arr = new ArrayList<Bills>();
					
						while(in.hasNext()){
							
							long Supplier_ID = in.nextLong();
							String Supplier_Name = in.next();
							String Company_Name = in.next();
							long Start_Year= in.nextLong();
							long Bill_Number = in.nextInt();
							
							if(in.hasNext()){
								String Subscription_Type = in.next();
								double Subscription_Amount = in.nextDouble();
								if(in.hasNextLine())
								 in.nextLine();
							
							arr.add(new Subscription(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Subscription_Type, Subscription_Amount));
							lng.add(Supplier_ID);
							
								
							}
							
							else{
								int Number_Hours = in.nextInt();
								double Hour_Rate = in.nextDouble();
								double Total_Bill = in.nextDouble();
								if(in.hasNextLine())
									 in.nextLine();
								
							arr.add(new Service(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Number_Hours, Hour_Rate,Total_Bill));
							lng.add(Supplier_ID);
								
							}
							
							
							
							 
							
							 
							 
						}
						
						in.close();
						
						for(int i=0; i<arr.size();i++){
							if(arr.get(i).getBill_Number()==billNumb){
								arr.remove(i);
								System.out.println("The bill has been successfully removed...");
							}
							
							
								
						}
						
			
			PrintWriter pw = new PrintWriter (new FileOutputStream ("Bills.txt"));
			
			for(int i =0; i<arr.size();i++){
				
				 pw.println(arr.get(i));
	
			}
			
			pw.close();
			
			
			
			
			
	}

	
	
	public static void updateBill() throws FileNotFoundException, InputMismatchException{
		
		Scanner in = new Scanner(new FileInputStream ("Bills.txt"));

		
		ArrayList<Long> lng = new ArrayList<Long>();
		ArrayList<Bills> arr = new ArrayList<Bills>();
		
			while(in.hasNext()){
				
				long Supplier_ID = in.nextLong();
				String Supplier_Name = in.next();
				String Company_Name = in.next();
				long Start_Year= in.nextLong();
				long Bill_Number = in.nextInt();
				
				if(in.hasNext()){
					String Subscription_Type = in.next();
					double Subscription_Amount = in.nextDouble();
					if(in.hasNextLine())
					 in.nextLine();
				
				arr.add(new Subscription(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Subscription_Type, Subscription_Amount));
				lng.add(Bill_Number);
				
					
				}
				
				else{
					int Number_Hours = in.nextInt();
					double Hour_Rate = in.nextDouble();
					double Total_Bill = in.nextDouble();
					if(in.hasNextLine())
						 in.nextLine();
					
				arr.add(new Service(Supplier_ID, Company_Name, Start_Year,Bill_Number , Supplier_Name, Number_Hours, Hour_Rate,Total_Bill));
				lng.add(Bill_Number);
					
				}
				
				
				
				 
				
				 
				 
			}
			
			in.close();
			
			Service sc = new Service();
			Scanner user = new Scanner(System.in);
			System.out.println("Please Enter a Bill Number you'd like to modify ");
			long billNum = user.nextLong();
			if(lng.contains(billNum)){
				for(int i=0;i<arr.size();i++){
					if(arr.get(i).getBill_Number()==billNum){
						System.out.println("Please enter a new supplier id: ");
						long Supplier_ID = user.nextLong();
						System.out.println("Please enter a new company name: ");
						String Company_Name = user.next();
						System.out.println("Please enter a new start year: ");
						long Start_Year= user.nextLong();

						if(arr.get(i).getClass()==sc.getClass()){
							System.out.println("Bill detected as a service please enter the following information: ");
							System.out.println("Please enter a new service name: ");
							String Service_Name = user.next();
							System.out.println("Please enter a new number of hours: ");
							int Number_Hours = user.nextInt();
							System.out.println("Please enter a new hourly rate");
							double Hour_Rate = user.nextDouble();
							System.out.println("Please enter a new total");
							double Total_Bill = user.nextDouble();
							arr.set(i, new Service(Supplier_ID, Company_Name, Start_Year, billNum , Service_Name, Number_Hours, Hour_Rate,Total_Bill));
						}
						else {
							System.out.println("Bill detected as a subsciption please enter the following information:");
							System.out.println("Please enter a new supplier name");
							String Supplier_Name = user.next();
							System.out.println("Please enter a new subscription type");
							String Subscription_Type = user.next();
							System.out.println("Please enter a subscription amount");
							double Subscription_Amount = user.nextDouble();
							arr.set(i, new Subscription(Supplier_ID, Company_Name, Start_Year, billNum , Supplier_Name, Subscription_Type, Subscription_Amount));
						}
					}
					
				}
			}
			else{
				System.out.println("This Bill number does not exist");
				return;
				}
			 
			PrintWriter pw = new PrintWriter (new FileOutputStream ("Bills.txt"));
			
			for(int i =0; i<arr.size();i++){
				Bills ba = (Bills) arr.get(i);
				 if(i==arr.size()-1)
					 pw.print(ba);
					 
					 else
						 pw.println(ba);
					 
	
			}
			
			pw.close();
			
			System.out.println("All records have been successfully added...");
			
			
			
	}


	

	public static void main(String[] args) {
		try{
			System.out.println("Calling method to add Bills");
			addBills();
			System.out.println("\nCalling method to add Bills again in case you want to add a different type of bill");
			addBills();
			System.out.println("\nCalling method to find total");
			System.out.println("The total price is "+findSupllierTotal_Bills());
			
			Scanner user = new Scanner(System.in);
			
			System.out.println("\nPlease enter a bill you'd like to remove: ");
			long billnum = user.nextLong();
			removeBill(billnum);
			
			updateBill();
			findHighest_and_LowestService();}
		catch (FileNotFoundException e){
			System.out.println("File was not found");
		}
		
		catch (InputMismatchException e){
			System.out.println("Input Mismatch Exception");
		}
		
		

	}

}
