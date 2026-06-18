//10. Reverse Inverted Triangle
//54321
//5432
//543
//54
//5

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner k1=new Scanner(System.in);
		System.out.print("enter row: ");

		int row =k1.nextInt();
		
		
		for(int i=1; i<=row;i++){

			for(int j=row;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();	
		}
	
	}
}

