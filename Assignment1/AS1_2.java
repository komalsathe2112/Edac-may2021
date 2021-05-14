import java.util.Scanner;
class AS1_2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number to add ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number to add ");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.print("Addition= "+c);
	}
}