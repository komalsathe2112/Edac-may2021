import java.util.Scanner;

class AS1_6{
	public static void main(String args[]){
		int c; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first input ");
		int a = sc.nextInt();
		
		System.out.print("Enter second input ");
		int b= sc.nextInt();
		
		c = a+b;
		System.out.println(a+ "+" +b+ "=" +c);
		
		c=a-b;
		System.out.println(a+ "-" +b+ "=" +c);
		
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
		
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
		
		c=a%b;
		System.out.println(a+"%"+b+"="+c);
		
		
	}
}