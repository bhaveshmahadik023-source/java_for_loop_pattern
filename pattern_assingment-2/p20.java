//20. Pascal Triangle
//not complete

//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1

class Demo{
	public static void main(String[]args){
		int i=0;
		int j=0;
		int row=5;
		
		for(i=1;;i++){
			for(j=1;j<=i;j++){
				if(i>j){
					System.out.print("1");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}