package practiceex5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class mapping {
	
	
	public static void main(String []args)
	{
	Scanner myObj = new Scanner(System.in);
	String s=myObj.nextLine();
	String a[]=s.split(" ");
	Map <String, Integer> my=new LinkedHashMap<>();
	Integer l;
	for(int i=0;i<a.length;i++)
	{    l=my.get(a[i]);
		if(l==null)
		{
		my.put(a[i], 1);	
		}
		else
		{
		  l=l+1;
		  my.put(a[i], l);
		}
	}
	for (Map.Entry<String, Integer> entry : my.entrySet()) 
	{
  
  if(entry.getValue()>1)
  {
	System.out.print(entry.getKey()+": true, " );  
  }
  else
  {
	  System.out.print(entry.getKey()+": false, " );
  }
	}
}
}
