// -----------------------------------------------------
// Assignment #4
//
// Written by: Mohammad Naimur Rashid 40027867
// -----------------------------------------------------

public class LinkedList {
	
	private class Node{
		private Node next;
		private Bills value;
		
		public Node (){
			next = null;
			value = null;
		}
		public Node(Bills e, Node x){
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
	
	public void AddToEnd(Bills e){
		
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
	
	public boolean AddBefore(Bills b, Bills e){//adding e before b
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
	


	
	public double findMax(){
		double max = 0;
		Node t = head;
		while(t!=null){
			if(t.value.getHour_Rate()>max){
				max = t.value.getHour_Rate();
			}
		t=t.next;
		}
		return max;
	}
	public double findMin(){
		double min = 99999999;
		Node t = head;
		while(t!=null){
			if(t.value.getHour_Rate()<min){
				min = t.value.getHour_Rate();
			}
		t=t.next;
		}
		return min;
	}
	
	
	
	
	
	

}
