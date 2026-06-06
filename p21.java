class Demo{
	public static void main(String[]args){
		int count=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count+" ");
				if(j!=i){
					count++;
				}
			}	
			System.out.println();
		}
	}
}