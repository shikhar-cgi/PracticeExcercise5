package practiceex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Maintest {
	public static void main(String[]agrs)
	{
		Student shikhar=new Student();
		shikhar.SetStudentName("Shikhar");
		shikhar.SetStudentAge(23);
		Student ayush=new Student();
		Student punkaj=new Student();
		Student arun=new Student();
		Student dileep=new Student();
		ayush.SetStudentName("Ayush");
		ayush.SetStudentAge(21);
		punkaj.SetStudentName("Punkaj");
		punkaj.SetStudentAge(23);
		arun.SetStudentName("Arun");
		arun.SetStudentAge(24);
		dileep.SetStudentName("Dileep");
		dileep.SetStudentAge(23);
		ArrayList<Student> my=new ArrayList<>();
		my.add(dileep);
		my.add(ayush);
		my.add(shikhar);
		my.add(punkaj);	
		my.add(arun);
		StudentSorter re=new StudentSorter();
        Collections.sort(my, re);
        
		Collections.reverse(my);
		System.out.println(my.toString());
	}

}
