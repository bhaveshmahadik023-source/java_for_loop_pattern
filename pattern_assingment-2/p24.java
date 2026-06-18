//28. Square Number Triangle
//1
//4 4
//9 9 9
//16 16 16 16
//25 25 25 25 25


import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner g1= new Scanner(System.in);
		System.out.print("enter row: ");
			int row = g1.nextInt();
		
		
		for(int i=1; i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+i*i);
			}
			System.out.println();
		}
	}
}