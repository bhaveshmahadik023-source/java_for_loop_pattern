 class Demo{
	public static void main(String[]args){
		int column=4;
		int num=4;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if(column-i-j>=0){
					System.out.print(" ");	
				}else{
					System.out.print("*");
				}
			}
			System.out.println();	
		}
	}
}