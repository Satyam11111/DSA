import java.util.*;
class stack_using_array{
int top=-1;
int n=10;
int a[]=new int[n];
void push(int data){
	if(top==n)
	{
		System.out.println("Overflow");
	}
	else{
		top++;
		a[top]=data;
		System.out.println("Data is pushed");
	}
}//end of push
void pop()
{
	if(top==-1)
	{
		System.out.println("Underflow");
	}
	else{
		top--;
		System.out.println("Data is poped");
	}
}//end of pop
void display()
{
	if(top==-1)
	{
		System.out.println("Data not found");
	}
	else{
		System.out.println("elements are ");
		for(int i=0;i<=top;i++)
		{
			System.out.print(" "+a[i]);
		}//end of for
		System.out.println();
	}
}//void of display
public static void main(String args[])
{
	stack_using_array sua=new stack_using_array();
	sua.push(10);
	sua.push(20);
	sua.push(30);
	sua.display();
	sua.pop();
	sua.push(40);
	sua.display();


}//end of main
}//end of class
