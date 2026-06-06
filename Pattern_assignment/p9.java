class Demo{
	public static void main(String[]args){
		int num=10;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if(i==1||j==1||i==num||j==num){
					System.out.print("5");
				}else{
					if(i>2&&i<(num-1)&&j>2&&j<(num-1)){
					
						System.out.print("3");
					}else{
						System.out.print("4");	
					}
				}
			}
			System.out.println();
		}
	}
}