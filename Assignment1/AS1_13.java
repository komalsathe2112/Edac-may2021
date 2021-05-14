import java.util.Scanner;
class AS1_13{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of Width & Height");
		float w = sc.nextFloat();
		float h = sc.nextFloat();
		
		float area = w*h;
		System.out.println("Area of Rectangle = "+area);
		
		float Perimeter = 2*(w+h);
		System.out.println("Perimeter of Rectangle= "+Perimeter);

		
	}
}