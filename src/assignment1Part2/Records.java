package assignment1Part2;

import java.util.Random;
import java.util.Scanner;

public class Records {

	public static void main(String[] args) {
		
		/* Name: Aurnob Jahin Islam
		 * Assignment: Assignment 1 Part 2
		 * Program: Information Systems Security
		 * 
		 * This program focuses on the use of two dimensional array
		 * and also how to handle references stored in a two dimensional
		 * array. This program, the way it is designed, is to get user inputs
		 * and store those information and store them in a two dimensional 
		 * array. Nested for loops were used in this program to manipulate 
		 * the two dimensional array. 
		 */
		
		/* This is creating a two dimensional array with
		 * 5 rows and 6 columns
		 */ 
		String[][] info = new String[5][6];
		
		info[0][0] = "Prog1";
		info[1][0] = "Prog2";
		info[2][0] = "Info3";
		info[3][0] = "Syst4";
		info[4][0] = "Prog5";
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter your first name: ");
		String firstName = scan.next();
		System.out.print("Enter your last name: ");
		String lastName = scan.next();
		
		/* The following nested for loop goes through each reference 
		 * of the two dimensional array, ask user input and refers them
		 * to that row and column number. The if statements are used 
		 * to satisfy specific conditions that are required to fill the
		 * two dimensional array.
		 */
		for(int row=0; row<info.length; row++) {
			for(int col=0; col<info[row].length; col++) {
				if(info[row][col] == info[row][1]){
					System.out.print("Midterm mark for " + info[row][0] + " ");
					info[row][1] = scan.next();
				}
				if(info[row][col] == info[row][2]) {
					System.out.print("Final mark for " + info[row][0] + " ");
					info[row][2] = scan.next();
				}
				if(info[row][col] == info[row][3]) {
					System.out.print("Assignment mark for " + info[row][0] + " ");
					info[row][3] = scan.next();
				}
				if(info[row][col] == info[row][4]) {
					System.out.print("Lab mark for " + info[row][0] + " ");
					info[row][4] = scan.next();
				}
			}
		}
		
		scan.close();
				
		System.out.println("\n");
		System.out.println("Student name: " + firstName + " " + lastName);
		System.out.println("Grade Info: ");
		System.out.println();
		System.out.println("PgNm   Midterm  Final   Asgnmt  Lab     Grade");
		
		/* The following nested for loop manipulates the data referring 
		 * to the rows and columns of the two dimensional array and display 
		 * the array as a table format. In addition, the average of the 
		 * grades and prints the average in the sixth column of the array. 
		 */
		for(int i=0;i<info.length;i++){  
			for(int j=0;j<info[i].length;j++){
				int sum = Integer.parseInt(info[i][1]) + Integer.parseInt(info[i][2]) + 
						Integer.parseInt(info[i][3]) + Integer.parseInt(info[i][4]);
				double grade = sum/4;
			
				info[i][5] = Double.toString(grade) + "%";			
				
				System.out.print(info[i][j]+"\t");  
			}  
			System.out.println();  
		}  
	}
}
