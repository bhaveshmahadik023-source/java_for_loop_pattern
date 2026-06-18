//1. Left Increasing Triangle
//1
//12
//123
//1234
//12345

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner h1= new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = h1.nextInt();
		

		int i=0;
		int j=0;
		int count=0;
		
		for(i=row;i>=1;i--){
			count=1;
			for(j=row;j>=i;j--){
				System.out.print(" "+count);
				count++;
			}
			System.out.println();
		}
		
	}	
}