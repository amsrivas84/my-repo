package com.amrita.java.File;


//Creating a text File using FileWriter 
import java.io.FileWriter; 
import java.io.IOException; 
class CreateFile 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// Accept a string 
		String str = "File Handling in Java using "+ 
				" FileWriter and FileReader"; 
		String str1= "File Handling in Java using "+ 
				" FileWriter and FileReader";
		str="hdbshs";
		
System.out.println(str1);
		// attach a file to FileWriter 
		FileWriter fw=new FileWriter("output.txt"); 

		// read character wise from string and write 
		// into FileWriter 
		for (int i = 0; i < str1.length(); i++) 
			fw.write(str1.charAt(i)); 

		System.out.println("Writing successful"); 
		//close the file 
		fw.close(); 
	} 
}
