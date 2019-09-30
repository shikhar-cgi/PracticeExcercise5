package practiceex5;

import java.util.ArrayList;
import java.util.Scanner;

public class arrlist {
	
	public static void main(String []agrs )
	{
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the array strings");
		String s=myObj.nextLine();
		String a[]=s.split(" ");
		System.out.println("Enter the index to be change");
		int ind=myObj.nextInt();
		ArrayList <String> arr=new ArrayList<>();
		for(int i = 0;i<a.length;i++)
		{
			arr.add(a[i]);
			
		}
		arr.set(ind, "papaya");
		System.out.println(arr.toString());
		arr.removeAll(arr);
		System.out.println(arr.toString());
	}

}
