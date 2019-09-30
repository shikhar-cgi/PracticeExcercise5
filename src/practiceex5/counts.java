package practiceex5;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map.Entry;

public class counts {
	
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);
		String c=myObj.nextLine();
		Map <String, Integer> my=new LinkedHashMap<>();
	        Pattern pt = Pattern.compile("[a-zA-Z]+");
	        Matcher match= pt.matcher(c);
	        String h="";
	        Integer l;
	        while (match.find()) {
	        	
	      
	    	 h=c.substring(match.start(), match.end());
	    	
	    	 l=my.get(h);
	    	 if(l==null)
	 		{
	 		my.put(h, 1);	
	 		}
	 		else
	 		{
	 		  l=l+1;
	 		  my.put(h, l);
	 		}
	    	 
	     
	}
	  for (Map.Entry<String, Integer> entry : my.entrySet()) 
	    	{
		  System.out.print(entry.getKey() +":"+ entry.getValue()+" " );  
	    	}
}
}