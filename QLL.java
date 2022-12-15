//queue using linked list
import java.util.*;
class QLL{
class node{
	int data;
	node next=null;
}//end of class node
node front=null;
node rear=null;
void enqueue(int dat)
{
	node new_node=new node();
	new_node.data=dat;

 if(front==null)
 {
	 front=new_node;
	 rear=front;
	 System.out.println("Data inserted!");
 }
 else{
	 rear.next=new_node;
	 rear=new_node;
	 System.out.println("Data inserted!");
 }

}//end of enqueue

void dequeue()
{
	if(front==null)
	{
		System.out.println("Underflow!");
	}
	else{
		front=front.next;
		System.out.println("Data deleted");
	}
}//end of dequeue

void display()
{
	if(front==null)
		{
			System.out.println("Data is not found!");
		}
		else{
			node temp=front;
			while(temp!=null)
			{
				System.out.print(" "+temp.data);
				temp=temp.next;
			}
			System.out.println();
	}
}//end of display

public static void main(String args[])
{
 QLL ll=new QLL();
 ll.enqueue(10);
 ll.enqueue(20);
 ll.enqueue(30);
 ll.enqueue(40);
 ll.display();
 ll.dequeue();
 ll.display();
 ll.dequeue();
 ll.display();
}//end of main
}//end of class