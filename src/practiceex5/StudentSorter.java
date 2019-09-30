package practiceex5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> 
{

	@Override
	public int compare(Student s1, Student s2) {
	     
		if((s1.GetStudentAge()-s2.GetStudentAge())!=0)
		{
			return s1.GetStudentAge()-s2.GetStudentAge();
		}
		else if(!(s1.GetStudentName().equalsIgnoreCase(s2.GetStudentName())))
	  	{
			return s1.GetStudentName().compareTo(s2.GetStudentName());
		}
		return s1.GetStudentId()-s2.GetStudentId();
	}
	
	

}
