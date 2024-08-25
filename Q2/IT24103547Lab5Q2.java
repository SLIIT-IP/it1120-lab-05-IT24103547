import java.util.Scanner;
public class IT24103547Lab5Q2 {
public static void main(String[] args) 
{

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of new members introduced:");
int input = scanner.nextInt();

if (input < 0 ){
System.out.println("Input must be a number 0 or greater");
}

else{
String prize;
switch (input){

case 0:
prize = "No prize";
break;

case 1:
prize = "Pen";
break;

case 2:
prize = "Umrella";
break;

case 3:
prize = "Bag";
break;

case 4:
prize = "Travelling Chair";
break;

default:
prize = "Headphone prize";
break;
}
System.out.println("prize is a:"+prize);
}

scanner.close();
}
} 