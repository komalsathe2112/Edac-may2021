import java.util.Scanner;
class AS1_7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		for(int i =1;i<=10;i++)
		{
			int a=num*i;
			System.out.println(num+ "*" +i+ "=" +a);
		}
	}
}