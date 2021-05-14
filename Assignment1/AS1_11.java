import java.lang.Math.*;
import java.util.Scanner;
class AS1_11{
	public static void main(String args[]){
		//double pi= 3.1415926535;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double r=sc.nextDouble();
		
		double res=2*Math.PI*r;
		System.out.println("perimeter is = "+res);
		
		res=Math.PI*r*r;
		System.out.println("Area is = "+res);
		
		
		
	}
	


}
