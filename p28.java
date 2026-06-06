class Demo{
	public static void main(String[]args){
		int num=1234;
		int mod=0;
		int reverse=0;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			reverse=reverse*10+mod;
			
		}
		System.out.println(reverse);
		for(int j=reverse;j>0;j=j/10){
			mod=j%10;
			System.out.println(mod);	
		}
	}
}