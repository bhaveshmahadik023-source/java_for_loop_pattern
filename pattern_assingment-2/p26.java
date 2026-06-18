//30. Even Number Triangle
//2
//4 4
//6 6 6
//8 8 8 8
//10 10 10 10 10



import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner g1= new Scanner(System.in);
		System.out.print("enter row: ");
			int row = g1.nextInt();
			
		int count=2;
		
		for(int i=1; i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count);
			}
			count+=2;
			System.out.println();
		}
	}
}