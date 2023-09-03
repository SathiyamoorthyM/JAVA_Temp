package Basic;

import java.util.Scanner;

public class Stringtasks
{
//q1. print the sentence in reverse order. (without predefined methods)
		
		String reverse(String s1)
		{
			char arr[]= s1.toCharArray();
			int arrLength=0;
			String s2="";
			
			for(char i : arr)
			{
				arrLength++;
			}
			
			for(int i=arrLength-1 ; i>=0; i--)
			{
				s2=s2+arr[i];
			}
			//System.out.println(s2);
			return s2;
		}
			
		String fbspace(String s1)
		{
			char arr[]=s1.toCharArray();
			String s2="";
			int length=0;
			boolean flag1=false;
			
			for(char i: arr)
			{
				length++;
			}
			
			for(int i=0; i<=length-1; i++)
			{
				if(arr[i]==' ' && flag1==false)
				{
					continue;
				}
				else
				{
					flag1=true;
					s2=s2+arr[i];
				}
				
			 }
			//System.out.println(s2);
			return s2;
		}
		
		String middle(String s1)
		{
			int count=0;
			int length=0;
			char arr[]=s1.toCharArray();
			String s2="";
			
			for(int i : arr)
			{
				length++;
			}
			
			for(int i=0; i<=length-1; i++)
			{
				if(arr[i]==' ')
				{
					count++;
				}
				else
				{
					count=0;
				}
					
				if(count>1)
				{
					continue;
				}
				
					s2=s2+arr[i];
			}
			
			return s2;
		}
		
		void reOrder(String s1)
		{
			
			char arr[]=s1.toCharArray();
			int arrlength=0;
			int sarrlength=0;
			
			
			for(char i : arr)
			{
				arrlength++;
				
				if(i==' ')
				{
					sarrlength++;
				}
			}
		
			
     		String sarr[]=new String[sarrlength+1];
			    int j=sarrlength;
			    String temp="";
			
				for(int i=0; i<=arrlength-1; i++)
				{
					if(arr[i]==' ')
					{
						sarr[j]=temp;
						temp="";
						j--;
					}
					else
					{
					temp=temp+arr[i];
					}
				}	
				sarr[j]=temp;
				
			
			for(int i=0; i<=sarrlength; i++)
			{
				if(i==sarrlength)
				{
					System.out.print(sarr[i]);
				}
				else
				{
					System.out.print(sarr[i]+" ");
				}
			}
		    
		}
			
		void q1()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the sentence");
			String s1= sc.nextLine();
			
			s1=fbspace(s1);// remove starting space 
			s1=reverse(s1);// reverse the string
			s1=fbspace(s1);//remove ending space
			s1=reverse(s1);
			s1=middle(s1);
			reOrder(s1);
			
			//System.out.println(s1);
			
			sc.close();
		}

	/*	Enter the sentence
		   i    am    sathya    from    chennai   
		chennai from sathya am i		
	*/
		
		
	public static void main(String[] args)
	{
		Stringtasks  stringtasks=new Stringtasks();
		
		stringtasks.q1();
	
		
	}

}
