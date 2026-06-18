//7. Right Shift Inverted Triangle
// 12345
//  1234
//   123
//    12
//     1


import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner h1= new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = h1.nextInt();
			
		int count=0;
	
		for(int i=row;i>=1;i--){
			count=1;
			for(int j=row;j>=1;j--){
				
				if(i>=j){
					System.out.print(count);
					count++;
				}else{
					System.out.print(" ");
					
				}
			}	
			System.out.println();
		}
	}	
}