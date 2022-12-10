import java.util.*;
class doubly_ll{
static class node{
  int data;
  node next=null;
  node prev=null;
}//end of node class
node head=null;
node tail=null;

void insert()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to insert");
	node new_node=new node();
	new_node.data=sc.nextInt();
	if(head==null)
	{
       head=new_node;
       tail=new_node;
	}
	else{
            System.out.println("where you want to insert");
            System.out.println("1.at begginning\n2.at last\n3.at specific location");
            int choice=sc.nextInt();
            switch(choice)
            {
				case 1://at begg
				new_node.next=head;
				head.prev=new_node;
				head=new_node;
				System.out.println("Item is Inserted");
				break;
				case 2://at last insertion
				tail.next=new_node;
				new_node.prev=tail;
				tail=new_node;
				System.out.println("Item is Inserted");
				break;
				case 3://at specific location
				System.out.println("Enter index , Where you want to insert!");
				node temp=head;
				int pos=sc.nextInt();
				for(int i=1;i<pos-1;i++)
				{
                    temp=temp.next;
				}//end of for
				new_node.prev=temp;
				new_node.next=temp.next;
				temp.next=new_node;
				System.out.println("Item is Inserted");
				break;
				default:System.out.println("invalid position");
			}//end of switch
	}//end of if-else
}//end of insert

void display()
{
   node temp=head;
   System.out.println();
   while(temp!=null)
   {
	   System.out.print(" "+temp.data);
	   temp=temp.next;
   }
   System.out.println();
}//end of display

void delet()
{
	Scanner sc=new Scanner(System.in);
	node temp=head;
	node ptr=head.next;
   if(head==null)
   {
	   System.out.println("No item to delete");
   }
   else{
	   System.out.println("From where you want to delete?");
	   System.out.println("1.From beginning\n2.from last\n3.from specific location");
	   int choice=sc.nextInt();
	   switch(choice)
	   {
		   case 1://from beg
            head=head.next;
            head.prev=null;
            System.out.println("Item is deleted");
		   break;
		   case 2://from last
		   while(ptr.next!=null)
		   {
			   temp=ptr;
			   ptr=ptr.next;
		   }//end of while
		   temp.next=null;
		   System.out.println("Item is deleted");
		   break;
		   case 3://from specific location
		       System.out.println("Enter the position");
		       int pos=sc.nextInt();
		       for(int i=1;i<pos-1;i++)
		       {
				   temp=ptr;
				   ptr=ptr.next;
			   }//end of for
			   temp.next=ptr.next;
			   ptr.next.prev=temp;
			   System.out.println("Item is deleted");
			   break;
		  default:System.out.println("Invalid choice");
	   }//end of switch case

   }//end of if-else
}//end of delete
public static void main(String args[]){
   doubly_ll ll=new doubly_ll();
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

}//end of main
}//end of doubly class