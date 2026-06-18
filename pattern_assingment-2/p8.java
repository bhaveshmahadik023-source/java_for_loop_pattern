//8. Right Shift Repeated Numbers
//    1
//   22
//  333
// 4444
//55555

import java.util.*;

class Demo{
	public static void main(String[]args){
		Scanner k1=new Scanner(System.in);
		System.out.print("enter row: ");
		int row =k1.nextInt();
		
		int count=1;
		for(int i=row;i>=1;i--){
			for(int j=1;j<=row;j++){
				if(i>j){
					System.out.print(" ");
				}else{
					System.out.print(count);

				}
			}
			count++;
			System.out.println();
		}
	}
}

