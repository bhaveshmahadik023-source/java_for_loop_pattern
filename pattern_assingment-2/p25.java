//29. Odd Number Triangle
//1
//3 3
//5 5 5
//7 7 7 7
//9 9 9 9 9



import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner g1= new Scanner(System.in);
		System.out.print("enter row: ");
			int row = g1.nextInt();
		
		
		for(int i=1; i<=row;i++){
			if(i%2!=0){
				for(int j=1;j<=i;j++){
					System.out.print(i);
				}	
				System.out.println();
			}
		}
	}
}