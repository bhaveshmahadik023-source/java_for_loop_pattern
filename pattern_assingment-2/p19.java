//19. Alternating Binary Triangle
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1


import java.util.*;

class Demo{
	public static void main(String[]args){
	Scanner b1= new Scanner(System.in);
		System.out.print("enter row: ");
		int row= b1.nextInt();

		int i=0;
		int j=0;
		int count=1;
		
		
		for(i=1;i<=row;i++){
			for(j=1;j<=i;j++){
				if((i+j)%2==0){
					System.out.print(" 1");
				}else{
					System.out.print(" 0");
				}
			}
			System.out.println();	
		}
	}
}