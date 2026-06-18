//3.Left Increasing Continuous Numbers
//1
//23
//456
//78910
//1112131415

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner h1= new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = h1.nextInt();
		

		int i=0;
		int j=0;
		int count=1;
		
		for(i=row;i>=1;i--){
			
			for(j=row;j>=i;j--){
				System.out.print(" "+count);
				count++;	
			}
			System.out.println();
			count++;
		}
		
	}	
}