class Demo{
	public static void main(String[]args){
		int num=19;
		int mod=0;

		boolean is_prime=true;
		for(int i=2; i<num;i++){
			
			if(num%i==0){
				is_prime=false;
				break;
			}
		}
		if(is_prime){
			System.out.println("prime");
		}else{
			System.out.println("not prime");	
		}
	}
}