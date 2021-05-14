class AS1_14{
	public static void main(String args[]){
		
		
		//for printing *
		for (int i=1;i<=9;i++){
			if(i%2==0){
					System.out.print(" ");
					for(int j=1;j<=5;j++){
						System.out.print(" *");
					}
				}
			else
			for(int k=1;k<=6;k++){
				System.out.print(" *");
			}
			System.out.print(" ");
			if(i%2==0){
				System.out.print(" ");
			}
			for(int j=6;j<=30;j++){
				
				System.out.print("=");
			}
			System.out.println();
		}
		
		
		
		for(int l=1;l<=6;l++){
			for(int m=1;m<=38;m++){
				System.out.print("=");
			}
			System.out.println();
		}
	}

}