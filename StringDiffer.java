import java.util.*;
class StringDiffer{
public static void main(String args[])
{
	String str1,str2;
	str1="Satyabhau";
	str2="Satyamb";
	String result="";
	int len;
	if(str1.length()>str2.length())
	{
		len=str2.length();
	}
	else{
		len=str1.length();
	}
int i;
	for(i=0;i<len-1;i++)
	{
       if(str1.charAt(i)!=str2.charAt(i))
       {
		   result=result+str2.charAt(i);
	   }
	}//end of for
System.out.println("diff character = "+result);
}//end of main
}//end of class