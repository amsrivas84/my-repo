package com.amrita.java.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] marks = new int[5];
 	int[][] marks1 = new int[2][5];  
// 	or 
// 	int marks[] = new int[5];            recommended way is to do as above
// 	int marks1[][] = new int[2][5];  
	
 // Default Values
 		// byte,short,int,long-0
 		// float,double-0.0
 		// boolean false
 		// object-null

 	
		
 	marks[0]= 56;
 	marks[1]= 57;
 	marks[2]= 58;
 	marks[3]= 59;
 	marks[4]= 60;
 	Arrays.fill(marks, 100);
 // Fill array with same default value
 	
 	
 	System.out.println(marks[2]);
 	
 	int marks11[][] = {{2,3},{4,5}};
 	marks1[0][0] = 2;
 	marks1[0][0] = 2;
 	System.out.println(marks1[1][2]);
 	
	// Looping around an array - Enhanced for loop
	for (int mark : marks) {
		System.out.print(mark + " ");
	}
	System.out.println();
 	for (int[] markArray : marks11)
 	{
 	for (int mark: markArray) {
 		System.out.print(mark + " ");
	}
 	System.out.println();
 	}
	}
}
