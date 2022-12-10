import java.util.*;
class circular_linkedlist{
	static class Nod{
		int data;
		Nod next=null;
	}//end of nod class
	Nod head=null;
	Nod tail=null;

    void insert(){
		Scanner sc=new Scanner(System.in);
		Nod new_node=new Nod();
      System.out.println("Enter the number to insert");
      new_node.data=sc.nextInt();

      if(head==null)
      {
		  head=new_node;
		  tail=head;
		  tail.next=head;
	  }//end of if
	  else{
		  System.out.println("Where you want to insert the element");
		  System.out.println("1.at the beginning\n2.at the last\n3.at specific location");
		  int choice=sc.nextInt();
		  Nod temp=head;
		  switch(choice){
			  case 1://at the beginning
			         new_node.next=head;
			         head=new_node;
			         tail.next=new_node;
			         System.out.println("Inserted successfully!!");
			         break;
			  case 2://at the last
			         tail.next=new_node;
			         tail=new_node;
			         tail.next=head;
			         System.out.println("Inserted successfully!!");
			         break;
			  case 3://at specific location
			         System.out.println("Enter index");
			         int index=sc.nextInt();
                     for(int ii=0;ii<index-1;ii++)
                     {
						 temp=temp.next;
					 }//end of for
					 new_node.next=temp.next;
					 temp.next=new_node;
					  System.out.println("Inserted successfully!!");
					  break;
			 default: System.out.println("Invalid choice");
		  }//end of choice

	  }//end of else

	}//end of insert method
    void delet(){
		Scanner sc=new Scanner(System.in);
		Nod temp=head;
		Nod ptr=head.next;

         if(head==null)
		      {
		 		  System.out.println("No data found to delete!");
	          }else{
                  System.out.println("Where you want to delete ??");
                  System.out.println("1.from beginning\n2.from last\n3.from specific location");
                  int choice=sc.nextInt();
                  switch(choice){
					  case 1://from beginning
					       head.next=head;
					       tail.next=head;
					        System.out.println("Item is deleted!!");
					       break;
					  case 2://at last
					        while(temp.next!=tail)
					        {
								temp=temp.next;
							}//end of while
							tail=temp;
							tail.next=head;
							System.out.println("Item is deleted!!");
							break;
					  case 3://deleting from specific location
					        System.out.println("Enter index to delete");
					        int n=sc.nextInt();
                            for(int i=0;i<n-1;i++)
                            {
							  temp=ptr;
							  ptr=ptr.next;
							}//end of for
                            temp.next=ptr.next;
                            System.out.println("Item is deleted!!");
					        break;

				  }//end of switch
			  }//end of if-else
	}//end of delet method
	void display(){
     Nod temp=head;
     if(head==null)
     {
		  System.out.println("No data found!");
	 }else{
     do{
		 System.out.print(" "+temp.data);
		 temp=temp.next;
	 }while(temp!=head);
	 System.out.println();
 }//end of if-else
	}//end of display method

	public static void main(String args[]){
		circular_linkedlist ll=new circular_linkedlist();
		Scanner sc=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.Insert\n2.Delete\n3.display\n4.exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:ll.insert();break;
			case 2:ll.delet();break;
			case 3:ll.display();break;
			case 4:System.out.println("Good bye!");break;
			default:System.out.println("Enter valid choice");

		}//end of switch case
		}while(choice!=4);//end of do while

	}//main method
}//end of class