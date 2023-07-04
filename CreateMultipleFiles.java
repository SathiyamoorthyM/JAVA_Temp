package FileIO;
import java.io.*;
public class CreateMultipleFiles {

	public static void main(String[] args) 
	{
		String s="/home/sathiyamoorthym/My World/JAVA/Fileio/";
		
	for(int i=1; i<=10;i++)
	{
		try
		{
		String s1= s+(char)(i+64)+".txt";
		FileWriter fw=new FileWriter(s1);
		String s2="";
		s2=s2+(char)(i+48);
		fw.write(s2);
		fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Thread Getting EXception!");
		}
		
	}
		
	
	}

}
