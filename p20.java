class Demo{
	public static void main(String[]args){
		int first=0;
		int second=1;
		int sum=0;
		System.out.print(first);
		System.out.println();
		System.out.print(second+" ");
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				sum=first+second;
				System.out.print(sum+" ");
				first=second;
				second=sum;
			}
			System.out.println();
		}
	}
}