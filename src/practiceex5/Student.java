package practiceex5;

public class Student {
	private int id;
	private String name;
	private int age;
	public int GetStudentId()
	{  
		return id;
		
	}
	public String GetStudentName()
	{   
		return name;
		
	}
	public int GetStudentAge()
	{   
		return age;
		
	}
	public int SetStudentId(int id)
	{  
		this.id=id;
		return id;
		
	}
	public String SetStudentName(String name)
	{   this.name=name;
		return name;
		
	}
	public int SetStudentAge(int age)
	{   this.age=age;
		return age;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

