import java.util.Scanner;
class AS1_15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Variables ");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int temp;
		
		System.out.println("Values before swapping are ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values after Swapping");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		
		
	}
	

}