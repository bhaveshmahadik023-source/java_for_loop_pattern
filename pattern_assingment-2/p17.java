//17. Reverse Floyd's Triangle
//1 2 3 4 5
//6 7 8 9
//10 11 12
//13 14
//15

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner j1= new Scanner(System.in);
			System.out.print("Enter row");
			int row = j1.nextInt();

			
			int count=1;
			
		for(int i =row; i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}	
}

