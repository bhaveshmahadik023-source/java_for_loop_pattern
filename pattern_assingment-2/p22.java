//26. Reverse Zig-Zag
//54321
//4321
//321
//21
//1

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner g1= new Scanner(System.in);
		System.out.print("enter row: ");
			int row = g1.nextInt();
		
		for(int i=row;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();	
		}
	}
}