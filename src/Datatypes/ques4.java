/* 
write a program which accepts 3 numbers from the user and display the largest
*/
package Datatypes;
import java.util.Scanner;
public class ques4{
	public static void main(String[] args) {
		//remove warning from the program
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		//taking input of three numbers
		System.out.println("Enter the first number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the second number:");
		int num2 = obj.nextInt();
		System.out.println("Enter the third numner:");
		int num3 = obj.nextInt();
		//checking which is the largest using ternary operation
		int num4 = ((num1>num2)?num1:((num2>num3)?num2:num3));
		//displaying the output
		System.out.println("The largest number is : " + num4);
		
	}
}