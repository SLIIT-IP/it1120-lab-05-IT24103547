import java.util.Scanner;

public class IT24103547Lab5Q3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double ROOM_CHARGE_PER_DAY = 48000.00;
int MINIMUM_DAYS_FOR_DISCOUNT = 3;
int DISCOUNT_3_TO_4_DAYS = 10;
int DISCOUNT_5_OR_MORE_DAYS = 20;

System.out.print("Enter Start Date (1-31): ");
int startDate = input.nextInt();

System.out.print("Enter End Date (1-31): ");
int endDate = input.nextInt();

if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
System.out.print("Days must be between 1 and 31");
return;
}

if (startDate > endDate) {
System.out.print("Start Date must be less than End Date");
return;
}

int numberOfDaysReserved = endDate - startDate + 1;  
double totalAmount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
double discount = 0.0;

if (numberOfDaysReserved >= MINIMUM_DAYS_FOR_DISCOUNT && numberOfDaysReserved <= 4) {
discount = totalAmount * DISCOUNT_3_TO_4_DAYS / 100.0;
} else if (numberOfDaysReserved >= 5) {
discount = totalAmount * DISCOUNT_5_OR_MORE_DAYS / 100.0;
}

double finalAmount = totalAmount - discount;
		
System.out.println();
System.out.println("Room Charge per Day :" + ROOM_CHARGE_PER_DAY);

System.out.println("Number of days reserved: " + numberOfDaysReserved);
System.out.println("Total amount to be paid: Rs " + finalAmount);
}
}