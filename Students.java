package LearnCollection;

// Multiple entities in collection

import java.util.LinkedList;

public class Students
{
	private int RegNo;
	private String Name;
	private int Mark;
	private char Grade;
	
	Students(int RegNo,String Name,int Mark,char Grade)
	{
	this.RegNo=RegNo;
	this.Name=Name;
	this.Mark=Mark;
	this.Grade=Grade;
	}
	
	public int getRegNo()
	{
		return RegNo;
	}

	public void setRegNo(int regno)
	{
		RegNo = regno;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public int getMark()
	{
		return Mark;
	}

	public void setMark(int mark)
	{
		Mark = mark;
	}

	public char getGrade() 
	{		
		return Grade;
	}

	public void setGrade(char grade)
	{
		Grade = grade;
	}

	@Override
	public String toString() 
	{
		return "\n Students [RegNo=" + RegNo + ", Name=" + Name + ", Mark=" + Mark + ", Grade=" + Grade + "]";
	}
	public static void main(String args[])
	{
		Students arun=new Students(001,"Arun",400,'B');
		Students karun=new Students(002,"Karun",420,'A');
		Students varun=new Students(003,"Varun",380,'c');
		LinkedList ll=new LinkedList();
		ll.add(arun);
		ll.add(karun);
		ll.add(varun);
		System.out.println(ll);
		
	}

}

/*
o/p:

[
Students [RegNo=1, Name=Arun, Mark=400, Grade=B], 
Students [RegNo=2, Name=Karun, Mark=420, Grade=A], 
Students [RegNo=3, Name=Varun, Mark=380, Grade=c]]

*/