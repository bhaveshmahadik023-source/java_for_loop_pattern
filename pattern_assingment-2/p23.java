//27. Multiplication Triangle
//1
//2 4
//3 6 9
//4 8 12 16
//5 10 15 20 25



import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner g1= new Scanner(System.in);
		System.out.print("enter row: ");
			int row = g1.nextInt();
		
		
		for(int i=1; i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" "+i*j);
			}
			System.out.println();
		}
	}
}