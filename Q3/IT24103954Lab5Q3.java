import java.util.Scanner;

public class IT24103954Lab5Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the start date (1-31) : ");
		final int startDate = input.nextInt();
		System.out.println("Please enter the end date (1-31) : ");
		final int endDate = input.nextInt();
		if(endDate <= startDate){
			System.out.println("End date cannot be less than start date !!");
			return;
		}
		if(startDate >=1 && startDate <=31 && endDate >=1 && endDate <=31){
			double discount;
			final int daysCount = endDate - startDate;
			if(daysCount < 3){
				discount = 0;
			}else if(daysCount >=3 && daysCount <=4){
				discount = 0.1;
			}else{
				discount = 0.2;
			}

			double totalDiscount = (daysCount * 48000) * discount;
			double totalAmount = (daysCount * 48000) - totalDiscount;

			System.out.println("Room Charge Per Day : Rs. 48000.00");
			System.out.println("Total Days Reserved : "+daysCount);
			System.out.println("Total Amount to be paid : Rs."+totalAmount);
		}else{
			System.out.println("Days must between 1 and 31 !");
			return;
		}
	}
}
			
