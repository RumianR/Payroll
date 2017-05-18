

public class LinkedList {
	
	private class Node{
		private Node next;
		private Employee value;
		
		public Node (){
			next = null;
			value = null;
		}
		public Node(Employee e, Node x){
			this.next = x;
			this.value = e;
		}
	}
	
	private Node head=null;
	private Node tail = head;
	private  int counter=0;
	
	public int getCounter(){
		return counter;
	}
	
	public LinkedList(){
		head = null;
		tail = head;
		
	}
	
	public void AddToEnd(Employee e){
		
		if(head == null){
			head = new Node(e,null);
			tail = head;
			
		}
		
		else{
			tail.next = new Node(e,null);
			tail = tail.next;
		}
		
		counter++;
		
	}
	
	public boolean AddBefore(Employee b, Employee e){//adding e before b
		if (head == null || !head.value.equals(b)){
			return false;
			
		}
		
		else if(head.value.equals(b)){
			head = new Node(e,head);
			counter++;
			return true;
		}
		
		else{
			Node t=head;
			while(t.next!=null && !t.next.equals(e)){
				t = t.next;
			}
			
			if(t.next==null)
				return false;
			
			t.next= new Node(e,t.next);
			
			t=null;
			counter++;
			return true;
			
		}
		
		
		
	}
	

	public double findTermSalary1(){
		double total = 0;
		Node t = head;
		while(t!=null){
			
		
			
			total += t.value.getSalary();
			t=t.next;
		}
		
		
		
		return total;
	}
	
	public double findMax(){
		double max = 0;
		Node t = head;
		while(t!=null){
			if(t.value.getSalary()>max){
				max = t.value.getSalary();
			}
		t=t.next;
		}
		return max;
	}
	public double findMin(){
		double min = 99999999;
		Node t = head;
		while(t!=null){
			if(t.value.getSalary()<min){
				min = t.value.getSalary();
			}
		t=t.next;
		}
		return min;
	}
	
	public void Increase_Staff_Salary1(){
		char c;
		Node t = head;
		while(t!=null){
			Staff s = (Staff)t.value;
			 c = s.getperformanceCode();
			 
			
		if(c == 'A'){
			s.setSalary(1.08*s.getSalary());
			s.setperformanceCode('E');
			
		}
		else if(c == 'B'){
			s.setSalary(1.06*s.getSalary());
			s.setperformanceCode('E');
			
								}
		else if(c == 'C'){
			s.setSalary(1.03*s.getSalary());
			s.setperformanceCode('E');
			
			}
		else if(c == 'D'){
			s.setSalary(1.01*s.getSalary());
			s.setperformanceCode('E');
			
		}
		
		t= t.next; 
		}
			 
			
		
	}
	
	public Staff getStaff(int i){
		if(head==null)
			return null;
		
		
		else if(i==0){
			return ((Staff)head.value.clone());
		}
			
		Node t = head;
		int c=0;
		
		while(t!=null && (i)!=c){
			c++;
			t=t.next;
			
			
		}
		return ((Staff)t.value.clone());
	}
	
	
	
	

}
