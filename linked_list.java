import java.util.*;
class linked_list{
	class node{
		int data;
		node next=null;
	}
	node start=null;
Scanner sc=new Scanner(System.in);
	void insert()
	{
		node new_node=new node();
		System.out.println("Enter number to insert");
		   int number=sc.nextInt();
		   new_node.data=number;
       if(start==null)
       {
		   start=new_node;
	   }
	   else{
		   new_node.next=start;
		   start=new_node;
	   }
	}//end of insert

	void delet(){
            System.out.println("delete ho raha hai......");
           // int num=sc.nextInt();
            //int count=0;
           if(start==null){
			   System.out.println("No element to delete");
		   }
		   else{
			   start=start.next;
		   }
	}//end of delet
	void display(){
          node temp=new node();
          temp=start;
          while(temp!=null)
          {
			  System.out.print(" "+temp.data);
			  temp=temp.next;
		  }
	}//end of display

	public static void main(String args[])
	{
        linked_list ll=new linked_list();
        ll.insert();
        ll.insert();
        ll.insert();
        ll.display();
        ll.delet();
        ll.display();
	}
	//end of main
}//end of class
