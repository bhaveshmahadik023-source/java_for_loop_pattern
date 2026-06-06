//logic 2 for p11

class Demo{
	public static void main(String[]args){
		int row=4;
		int colomn=4;
		int count=0;
		
		for(int i=1;i<=row;i++){
			if(i%2!=0){
				for(int j=1;j<=row;j++){	
					count++;
					System.out.print(count+" ");
				}
				
			}else{
				count=count+row;
				for(int j=1;j<=colomn;j++){
					System.out.print(count+" ");
					count--;
					
				}
			count=count+colomn;
			}
		
		System.out.println("");
		}
		
	}
}