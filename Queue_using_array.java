import java.util.*;
class Queue_using_array{
	int []a=new int[10];
	int front=-1,rear=-1;

	void enqueue(int data){
		if(a.length<=rear){
			System.out.println("Overflowed!!");
		}
		else{
	if(front==-1 && rear==-1)
	{
		front=rear=1;
		a[rear]=data;
		System.out.println("Data inserted in queue");
	}
	else{
		rear++;
		a[rear]=data;
		System.out.println("Data inserted in queue");
	}
}
	}//end of enqueue
	void dequeue()
	{
        if(rear==-1){
			System.out.println("Queue is empty");
		}
		else{
			if(rear==front){
				rear=-1;
				front=-1;
				System.out.println("Deleted");
			}
			else{
				front++;
				System.out.println("Deleted");
			}
		}
	}
	void display()
	{
		System.out.println("\n\nYour items are....");
          for(int i=front;i<=rear;i++)
          {
			  System.out.print(" "+a[i]);
		  }

	}//end of display
 public static void main(String args[])
 {
	 Queue_using_array qua=new Queue_using_array();
	 qua.enqueue(100);
	 qua.enqueue(200);
	 qua.enqueue(300);
	 qua.enqueue(400);

	 qua.display();

	 qua.dequeue();
	 qua.dequeue();
	 qua.display();
 }//end of main
}//end of class