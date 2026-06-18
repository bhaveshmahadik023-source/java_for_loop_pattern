//25. Zig-Zag Triangle
//1
//21
//321
//4321
//54321

import java.util.*;

class Demo{
	public static void main(String[]args){
	
	Scanner w1 = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = w1.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}	
			System.out.println();
		}
	}
}