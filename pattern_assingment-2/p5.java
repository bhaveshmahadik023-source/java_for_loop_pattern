//5. Left Inverted Repeated Numbers
//55555
//4444
//333
//22
//1

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner h1= new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = h1.nextInt();
		

		int i=0;
		int j=0;
		
		
		for(i=row;i>=1;i--){
			
			for(j=i;j>=1;j--){
				System.out.print(" "+i);
				
					
			}
			System.out.println();
		}
		
	}	
}