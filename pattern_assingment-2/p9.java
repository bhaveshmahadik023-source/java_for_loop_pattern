//9. Reverse Number Triangle
//5
//54
//543
//5432
//54321


import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner k1=new Scanner(System.in);
		System.out.print("enter row: ");
		int row =k1.nextInt();
		
		int count=1;
		for(int i=row;i>=1;i--){
			
			for(int j=row;j>=i;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}

