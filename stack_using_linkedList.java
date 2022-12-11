class stack_using_linkedList{
	class node{
		int data;
		node next=null;
    }//end of node
    node top=null;
    void push(int a){

    node new_node =new node();
    new_node.data=a;
    new_node.next=top;
    top=new_node;
    System.out.println("Item pushed");

	}//end of push

	void pop()
	{
       top=top.next;
       System.out.println("Item poped");
	}//end of pop

	void display()
	{
		node temp=top;
       while(temp!=null)
       {
		   System.out.print(" "+temp.data);
		   temp=temp.next;
	   }
	   System.out.println();
	}
	//end of display
	public static void main(String[] args)
	{
stack_using_linkedList ll=new stack_using_linkedList();
ll.push(10);
ll.push(20);
ll.push(30);
ll.display();
ll.pop();
ll.display();

	}//end of main
}//end of class