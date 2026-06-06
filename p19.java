class Demo{
	public static void main(String[]args){
		int count=0;
		int sub =0;
		int num=3;
		for(int i=0;i<=num;i++){
			for(int j=0;j<=i;j++){
				count++;
				sub=count-i;
				System.out.print(sub+" ");
			}
			System.out.println();
		}
	}
}