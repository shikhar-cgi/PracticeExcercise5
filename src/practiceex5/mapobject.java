package practiceex5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class mapobject {
	
	public static Map<String,String> modifymap(Map<String,String> my)
	{   
		String s1[]=new String[2];
		String s2[]=new String[2];
        int i=0,c=0;
        Map<String,String> m=new LinkedHashMap<>();
		for (Map.Entry<String,String> entry : my.entrySet())
		{
			s1[i++]=entry.getKey();
			s2[c++]=entry.getValue();
		}
		m.put(s1[0], " ");
		m.put(s1[1], s2[0]);
		return m;
		
	}
	public static void main(String[]args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter key 1");
		String key1=myObj.next();
		System.out.println("Enter value 1");
		String val1=myObj.next();
		System.out.println("Enter key 2");
		String key2=myObj.next();
		System.out.println("Enter value 2");
		String val2=myObj.next();
		Map<String,String> map=new LinkedHashMap<>();
		map.put(key1,val1);
		map.put(key2,val2);
		map=modifymap(map);
		System.out.println(map.toString());
		
	}
	
}
