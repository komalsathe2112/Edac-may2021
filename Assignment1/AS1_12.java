import java.util.Scanner;
class AS1_12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number ");
		int a= sc.nextInt();
		
		System.out.print("Enter the second number ");
		int b= sc.nextInt();
		
		System.out.print("Enter the third number ");
		int c= sc.nextInt();
		
		int avg=(a+b+c)/3;
		System.out.print(avg);
		
	}
}