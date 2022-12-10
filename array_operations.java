import java.util.*;
class array_operations{
	int[] a=new int[10];


	public static void main(String args[])
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
	    for(int i=0;i<5;i++)
	    {
			arr[i]=sc.nextInt();
		}
		System.out.println("your items are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("Enter number to insert");
		int new_num=sc.nextInt();
		int []b=new int[6];
		for(int i=0;i<arr.length;i++)
				{
					b[i]=arr[i];
		}
        b[5]=new_num;
        for(int i=0;i<b.length;i++)
				{
					System.out.print(" "+b[i]);
		}


	}//end of main



}