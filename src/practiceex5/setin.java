package practiceex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class setin {
	public static void main(String []args)
	{
	Scanner myObj = new Scanner(System.in);
	String s=myObj.nextLine();
	Set<String>my=new LinkedHashSet<>();
	ArrayList<String> n=new ArrayList<>();
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++)	
	{
	my.add(a[i]);
	}
	TreeSet<String> treeSet = new TreeSet<String>(my); 
	System.out.println(treeSet);
	
	Iterator<String> iterator = treeSet.iterator(); 
	while (iterator.hasNext()) 
	{
     		n.add(iterator.next());
	}
	treeSet.clear();
	System.out.println(treeSet.toString());
	System.out.println(n.toString());
	}
}
