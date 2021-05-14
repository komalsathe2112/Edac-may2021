import java.util.Scanner;
class AS1_3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number to be divided ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number ");
		int b = sc.nextInt();
		
		int c=a/b;
		System.out.print("Result = " +c);
	}
}