class Demo{
	public static void main(String[]args){
		int row=3;
		int colomn=4;
		int count=1;
		int digit=0;
		int sum=0;
		for(int i=1;i<=row;i++){
			digit=0;
			for(int j=colomn;j>=0;j--){
				if(i%2!=0){
					System.out.print(count);
					count++;
				}else{
					sum=(count+j-digit);
					System.out.print(sum);
					digit++;
					count++;
				}	
			}
			System.out.println();
		}
	}
}