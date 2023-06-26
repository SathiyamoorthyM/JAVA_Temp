package HomeWork;

import java.util.Scanner;

public class MailLogin
{
	void UserName()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Gmail User Name:");
		//System.out.println(" *(User name can contain letters(a-z),numbers(0-9) and period(.). Morethan one period not allowed.)");
		String s1= sc.next();
		int a[]=new int[s1.length()];
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		String s2 ="";
		
		for(int i=0;i<a.length;i++)                    // string to array convertion
		{
			a[i]=(int)s1.charAt(i);
			
			if(a[i]==46)								// dot symbol filter
			{
				count1=count1+1;
			}
			if(a[i]>=97 && a[i]<=122)					// lower case filter
			{
				count2=count2+1;
			}
			if(a[i]>=48 && a[i]<=57)					// numeric filter
			{
				count3=count3+1;
			}
			if((a[i]>=0 && a[i]<=45) || a[i]==47 || (a[i]>=58 && a[i]<=96) || (a[i]>=123 && a[i]<=127) || count1>=2)
			{
				count4=count4+1;
				break;
			}
			
		}
		
		if(count4 > 0 || count3==0 || count2==0 || count1>1)
		{
			System.out.println("! invalid UserName.");
		}
		else
		{
			s2="Please Enter Valid Password";
			System.out.println(s2);
		}
		
	
	}
	
	
	void Password()
	{
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter your Valid Password :");
		//System.out.println(" *(min 6 characters,must contains uppercase lowercase,numeric and symbols)");
		String s1= sc.next();
		String s2="";
		int a[]=new int[s1.length()];
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		

		for(int i=0;i<a.length;i++)                // string to int array convertion
		{
			a[i]=(int)s1.charAt(i);
			
		    if(a.length <= 5)              		 // Character length filter
		    {
		    	break;
		    }
		    if((a[i]>=0 && a[i]<=31) || a[i]==127)    // except alphabet numeric and symbols
			{
				count1=count1+1;
				break;
			}
		    
			// symbols ASCII Filter  4 of 4
			if((a[i]>= 32 && a[i]<= 47) || (a[i]>= 58 && a[i]<= 64) || (a[i]>= 91 && a[i]<= 96) || (a[i]>= 123 && a[i]<= 126)) 
			{
				count2=count2+1;
			}
			if(a[i]>= 65 && a[i]<= 90)			// Upper case filter
			{
				count3=count3+1;
			}
			if(a[i]>= 97 && a[i]<= 122)			// Lower case filter
			{
				count4=count4+1;
			}
			if(a[i]>= 48 && a[i]<= 57)			// Numeric Numbers filter
			{
				count5=count5+1;
			}
			
		}
		
		if(a.length <= 5  || count1 != 0 || count2==0 || count3==0 || count4==0 || count5==0)
		{
			System.out.println("! invalid PassWord");
		}
		else
		{
			s2=" Login Successfully";
			System.out.println(s2);
		}
		
	}

	
	

	public static void main(String[] args)
	{
		MailLogin maillogin=new MailLogin();
			maillogin.UserName();
			maillogin.Password();
			
	}

}

/*

o/p:

Enter Your Gmail User Name:
sathyam044
Please Enter Valid Password
Abcdef5&
 Login Successfully

*/
