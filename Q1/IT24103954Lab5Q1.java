import java.util.Scanner;

public class IT24103954Lab5Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number : ");
		int secondNumber = input.nextInt();
		System.out.println("Enter the third number : ");
		int thirdNumber = input.nextInt();
		
		int smallestNumber = firstNumber;
		int largestNumber = firstNumber;
		
		if(secondNumber < smallestNumber){
			smallestNumber = secondNumber;
		}
		if(secondNumber > largestNumber){
			largestNumber = secondNumber;
		}
		if(thirdNumber < smallestNumber){
			smallestNumber = thirdNumber;
		}
		if(thirdNumber > largestNumber){
			largestNumber = thirdNumber;
		}
		System.out.println("You entered numbers are : "+firstNumber+" "+secondNumber+" "+thirdNumber);
		System.out.println("The largest number is : " +largestNumber);
		System.out.println("The smallest number is : " +smallestNumber);
	}
}
		
		