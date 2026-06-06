class Demo{
	public static void main(String[]args){
		int is_square=1;
		int digit=0;
		int num=5;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				digit=is_square*is_square;
				System.out.print(digit+" ");		
				is_square++;
			}
			System.out.println();
		}
	}
}