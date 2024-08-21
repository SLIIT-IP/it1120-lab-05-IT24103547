import java.util.Scanner;
public class IT24103547Lab5Q1{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the first integer:");
int num1 = scanner.nextInt();

System.out.println("Enter the second integer:");
int num2 = scanner.nextInt();

System.out.println("Enter the third integer:");
int num3 = scanner.nextInt();

int smallest = num1;
if (num2 < smallest){
smallest = num2;
}

if (num3 < smallest){
smallest = num3;
}

int largest = num1;
if (num2 > largest){
largest = num2;
}

if (num3 > largest){
largest = num3;
}
System.out.println("User entered numbers are :"+num1+","+num2+","+num3+"");

System.out.println("Smallest number:"+smallest);
System.out.println("Largest number:"+largest);

scanner.close();
}
}