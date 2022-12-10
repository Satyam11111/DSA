import java.util.*;
class linkedListOperations{
class node{
	int data;
	node next=null;
}
node head=null;
void insert()
{
	Scanner sc=new Scanner(System.in);
    System.out.println("In which position you want to insert ?\n1.At first\n2.at last\n3.at specific position");
    int choice=sc.nextInt();
    node temp;
    System.out.println("Enter Element");
    node new_node=new node();
    new_node.data=sc.nextInt();
    if(head== null){
		head=new_node;
	}
	else{
    switch(choice){
		case 1://at first
		new_node.next=head;
		head=new_node;
		        System.out.println("Item is inserted!!");break;
		case 2://at last
		         temp=head;

		         while(temp.next!=null)
		         {
					 temp=temp.next;
				 }//end of while
				 temp.next=new_node;
				 System.out.println("Item is inserted!!");break;
	     case 3://at specific position
	           temp=head;
	           System.out.println("Enter index to insert");
	           int aa=sc.nextInt();

	           for(int i=0;i<aa-1;i++)
	           {
				   temp=temp.next;
			   }//end of for
			   new_node.next=temp.next;
			   temp.next=new_node;
			   System.out.println("Item is inserted");break;

	}//end of switch
}//end of else
}//end of insert method
void delet()
{
	Scanner sc=new Scanner(System.in);
	node temp=head;
	node ptr=temp.next;
      if(head==null)
      {
		  System.out.println("No element to delete");

	  }
	  else{
		  System.out.println("Delete element from ?\n1.first\n2.last\n3.from specific");
		  int choice=sc.nextInt();
		  if(choice==1)//delete from start
		  {
			  head=head.next;
		  }
		  else if(choice==2)//delete from last
		  {
			  while(ptr.next!=null){

				  temp=ptr;
				  ptr=ptr.next;
			  }
			  temp.next=null;
			  System.out.println("Item is deleted from last");
		  }
		  else if(choice==3)//delete from specific location
		  {
			  System.out.println("Enter the position from item have to dlet?");
			  int index=sc.nextInt();
			  for(int i=0;i<index-1;i++)
			  {
				  temp=ptr;
				  ptr=ptr.next;
			  }
			  temp.next=ptr.next;
			  System.out.println("item is deleted");
		  }
		  else{
			  System.out.println("Enter correct choice to delete element");
		  }//end of if-else ladder
	  }//end of else
}//end of delete method
void display()
{
   node temp=head;
   System.out.println("Your Items are...");
   while(temp!=null)
   {
	   System.out.print(" "+temp.data);
	   temp=temp.next;
   }//end of while
   System.out.println("\n\n\n");
}//end of display
public static void main(String args[]){
linkedListOperations ll=new linkedListOperations();
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


}//end of main method
}//end of class
