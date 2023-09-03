package Basic;


public class Basics {

// q1.Swapping two variables without using third variable a
	
	 void q1()
	 {
		 int a=7;
		 int b=9;
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("a="+a+","+"b="+b);
	 }
	//a=9,b=7
	 
// q2.printing 1 11 121
	 
	 void q2()
	 {
		 int a=10;
		 for(int i=1; i<=121; i=i+a)
		 {
			a=a*i;
			System.out.print(i+" "); 
		 }
		 
	 }
	 //1 11 121 
	 
// q3.printing 1 8 27 64
	 
	 void q3()
	 {
		 for(int i=1; i<=4; i++)
		 {
			 System.out.print((i*i*i)+" ");
		 }
	 }
	 // 1 8 27 64 
	 
// q4. printing 1 4 9 16 25 36 49 64 81 100
	 
	 void q4()
	 {
		 for(int i=1; i<=10; i++)
		 {
			 System.out.print(i*i +" ");
		 }
	 
	 }
	 // 1 4 9 16 25 36 49 64 81 100 
	 
// q5. printing 1 4 27 256 
	 
	 void q5()
	 {
		 for(int i=1; i<=4; i++)
		 {
			 int a=1;
			 for(int j=1; j<=i; j++)
			 {
				 a=a*i;
			 }
			 System.out.print(a+" ");
		 }
	 }
	 // 1 4 27 256 
	 
// q6. printing 1 2 4 7 11 16	 
	 
	 void q6()
	 {
		 int sum=1;
		 for(int i=0; i<=5; i++)
		 {
			 sum=sum+i;
			 System.out.print(sum+" ");
		 }
	 }
	 // 1 2 4 7 11 16 
	 
// q7. printing only multiples of 3 and 5
	 
	 void q7()
	 {
		 int a=5;
		 int b=3;
		 int c;
		 
		 
		 if(a>b)
		 {
			c=a;
			a=b;
		 }
		 else
		 {
			 c=b;
		 }
		 int d=c;
		 int i=1;
		 while(d%a!=0)
		 {
			 int temp=c;
			 temp=temp*i;
			 d=temp;
			 i++;
		 }
		
		 for(int j=d; j<=100; j=j+d)
		 {
			System.out.print(j+" "); 
		 }
		 
		 
	 }
	 
//q8. printing only multiples of 3 or 5
	 
	 void q8()
	 {
		 for(int i=1; i<=20; i++)
		 {
			 if(i%3==0 || i%5==0)
			 {
				 System.out.print(i+" ");
			 }
		 }
	 }
	 // 3 5 6 9 10 12 15 18 20 
	 
//q9. printing  1*2 2*3 3*4 4*5 5*6
	 
	 void q9()
	 {
		 for(int i=1; i<=5; i++)
		 {
			 int x=1 + i;
			 System.out.print(i+"*"+x+" ");
		 }
	 }
	 // 1*2 2*3 3*4 4*5 5*6 
	 
//q10. Addition of first n numbers
	 
	 void q10()
	 {
		 int n=5;
		 int sum=0;
		 for(int i=1; i<=n; i++)
		 {
			 sum=sum+i;
		 }
		 System.out.println(sum);
	 }
	 // 15
	 
// q11. Factorial
	 
	 void q11()
	 {
		 int num=7;
		 int fact=1;
		 
		 for(int i=1; i<=num; i++)
		 {
			 fact=fact*i;
		 }
		 
		 System.out.println(fact);
	 }
	
	 
//q12. printing 5! 4! 3! 2! 1!	
	 
	 void q12()
	 {
		 for(int i=5; i>=1; i--)
		 {
			 System.out.print(i+"!"+" ");
		 }
	 }
	 // 5! 4! 3! 2! 1! 
	 
//q13. printing 1*10 2*9 3*8 4*7 
	 
	 void q13()
	 {
		 for(int i=1; i<=4; i++)
		 {
			 System.out.print(i+"*"+(11-i)+" ");
		 }
	 }
	 // 1*10 2*9 3*8 4*7 

//q14. Square root of a given number
	 
	 void q14()
	 {
		 int num=144;
		 
		 for(int i=1; i<=num/2; i++)
		 {
			 if(num%i==0)
			 {
				 if((i*i)==num)
				 {
					 System.out.println(i);
					 break;
				 }
			 }
		 }
	 }
	  // 12
		 
//q15. Fibonacci Series
		 
		 void q15()
		{
			int num1=0;
			int num2=1;
			System.out.print(num1+" ");
			System.out.print(num2+" ");
			
			while(num2<=13)
			{
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(temp+" ");
			}
			 
		}
		 // 0 1 1 2 3 5 8 13 21 
		 
//q16. #Fibonacci Series using two variables 
		 
		 void q16()
		 {
			 
		 }
		 //
		
//q17. printing 13579246810
		 
		 void q17()
		 {
			 for(int i=1; i<=10; i=i+2)
			 {
				 System.out.print(i);
				 if(i==9)
				 {
					 i=0;
				 }
			 }
		 }
		 
		 
	 // 13579246810
		 
// q18. Finding prime number
		 void q18()
		 {
		 int num=17;
		 boolean flag=false;
		 
		 for(int i=2; i<=num/2; i++)
		 {
			 if(num%i == 0)
			 {
				 flag=true;
				 break;
			 }

		 }
		 if(flag==true)
		 {
			 System.out.println("Not Prime");
		 }
		 else
		 {
			 System.out.println("Prime");
		 }
		 }
		 
// q19. Finding first 20 prime no.
		 
		 void q19()
		 { 
			 int max=0;
				 for(int i=2; i<=100; i++)
				 {
					 int count=0;
					 for(int j=2; j<=i/2; j++)
					 {
						 if(i%j == 0)
						 {
							 count++;
						 }
					 }
					if(count==0)
					{
						System.out.print(i+" ");
						max++;
					}
					if(max==20)
						break;
				 }
		 }
	// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 
		 

// q20. Printing the number in reverse order
		 
		 void q20()
		 {
			 int num=5789;
			int count=0; 
			 
			 while(num>=1)
			 {
				 int a=num%10;
				 
				 for(int i=1; i<=count; i++)
				 {
					 a=(a*10);
				 }
				 System.out.print(a+" ");
				 num=num/10;
				 count++;
			 }
		 }
		 
		 // 9 80 700 5000 
		 
// q21. Reverse a number		 
		
		 void q21()
		 {
			 int num=5789;
			 
			/* int digit=0;
			 for(int i=1; i<=num; i=i*10)   // to find no.of digit
			 {
					 digit++;
			 }
			 System.out.println(digit+" Digit Number");  */
			 
			 while(num>=1)
			 {
				 System.out.print(num%10);
				 num=num/10;
			 }
		 }
		 
		 // 9875
		
// q22. Palindrome
		 
		 void q22()
		 {
			 int num=16461;
			 int no=num;
			 int sum=0;
			 
			 while(no>0) 
				 {
					 int rem=no%10;
					 sum=(sum*10)+rem;
					 no=no/10;
				 }
				 if(sum == num)
				 {
					 System.out.println("Palindrome");
				 }
				 else
				 {
					 System.out.println("Not Palindrome");
				 }
			 
			 
		 }
		 
		 // Palindrome

		 
// q23. Smallest Divisor of an integer
		 
		 void q23()
		 {
			int num=233;
			
			if(num%2==0)
			{
				System.out.println("Smallest Divisor 2");
			}
			
			else
			{
				for(int i=3; i<=num; i++)
				{
					if(num%i == 0)
					{
						System.out.println("Smallest Divisor"+" "+i);
					}
				}
			}
			
			 	
		 }
		 
		 // Smallest Divisor 233

// q24.Greatest Common Divisor of two integers
		 
		 void q24()
		 {
			 int num1=48;
			 int num2=36;
			 
			 if(num1>num2)
			 {
				 num2=num2+num1;	// swaping for smallest value for num1
				 num1=num2-num1;
				 num2=num2-num1;
			 }
			 
			for(int i=num1; i>=1; i--)	// find smallest number's largest factors is equal to  factor of largest number's factor
			{
				if(num1%i==0)
				{
					if(num2%i==0)
					{
						System.out.println("GCD= "+i);
						break;
					}
				}
			}
		 }
		 
		 // GCD= 12

// q25.Least Common Multiple of given numbers(LCM)
		 
		 void q25()
		 {
			 int num1=5;
			 int num2=3;
			 
			 if(num2<num1)
			 {
				 num2=num1+num2;
				 num1=num2-num1;
				 num2=num2-num1;
			 }

			 int i=num2;
			 while(i%num1!=0)
			 {
				 i=i+num2;
			 }
			 System.out.println("LCM "+i);
		 }
		 
		 // LCM 15

// q26.Decimal to Binary
		 
		 void q26()
		 {
			 int dec=45;
			 int a[]=new int [40];
			 int index=0;
			while(dec>0)
			{
				a[index++]=dec%2;
				dec=dec/2;
			}
			
			for(int i=index-1; i>=0; i--)
			{
				System.out.print(a[i]);
			}
			
		 }
		 
	 //  101101
		 
// q27. Binary to Decimal
		 
		 void q27()
		 {
			 String bin="101101";
			 int dec=0;
			 int mul=1;
			 
			 for(int i= bin.length()-1; i>=0; i--)
			 {
				int temp=(bin.charAt(i)-48); 
				dec= dec+(temp*mul);
				mul=mul*2;
			 }
			 
			  System.out.println("Deccimal "+dec);
		 }
		 
		 // Decimal 45
		 
// 	q28. Finding StrongNumber
		 
		 void q28()
		 {
			 int num=145;
			 int dig=num;
			 int sum=0;
			 while(dig>=1)
			 {
				 int fac=1;
				 for(int i=1; i<=dig%10; i++)
				 {
					fac=fac*i;
				 }
		
				 sum=sum+fac;
				 dig=dig/10;
			 }
			
			 if(sum==num)
			 {
				System.out.println("StrongNumber");
			 }
			 else
			 {
				 System.out.println("Not StrongNumber");
			 }
		 }
		 
		 // StrongNumber

		 
// q29. Perfect Number
		 
		 void q29()
		 {
			 int num=6;
			 int sum=0;
			 for(int i=1; i<=num/2; i++)
			 {
				if(num%i == 0)
				{
					sum=sum+i;
				}
			 }
			 if(num==sum)
			 {
				 System.out.println("Perfect Number");
			 }
			 else
			 {
				 System.out.println("Not PerfectNumber");
			 }
		 }
		 
		 // Perfect Number


// q30. Armstrong Number
		 
		 void q30()
		 {
			 int num=371;
			 int dig=num;
			 int sum=0;
			 while(dig>=1)
			 {
				 int temp=dig%10;
				 int queb=1;
				 for(int i=1; i<=3; i++)
				 {
					 queb=queb*temp;
				 }
				 sum=sum+queb;
				 dig=dig/10;
			 }
			 if(sum==num)
			 {
				System.out.println("Armstrong Number");
			 }
			 else
			 {
				 System.out.println("Not Amstrong Number");
			 }
		 }
		 
		 // Armstrong Number

// q31. Neon number
		 
		 void q31()
		 {
			 int num=9;
			 int square= num*num;
			 int sum=0;
			 
			 while(square>=1)
			 {
				 int temp=square%10;
				 sum=sum+temp;
				 square=square/10;
			 }
			 if(num==sum)
			 {
				 System.out.println("Neon Number");
			 }
			 else
			 {
				 System.out.println("Not Neon Number");
			 }
		 }
		 
		 // Neon Number
		 
// q32. Spy Number
		 
		 void q32()
		 {
			int num=1124;
			int sum=0;
			int mul=1;
			
			
			while(num>=1)
			{
				int temp=num%10;
				sum=sum+temp;
				mul=mul*temp;
				num=num/10;
			}
			
			if(sum==mul)
			{
				System.out.println("Spy Number");
				
			}
			else
			{
				System.out.println("Not spy Number");
			}
		 }

	public static void main(String[] args)
	{
	Basics basics=new Basics();
	basics.q22();
	}

}
