class Demo{
	public static void main(String[]args){
		int num=1228;
		int mod=0;
		int reverse=0;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			reverse=reverse*10+mod;
		}
		if(reverse==num){
			System.out.println("palindom");
		}else{
			System.out.println("not");	
		}
	}
}