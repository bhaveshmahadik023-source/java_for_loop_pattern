class Demo{
	public static void main(String[]args){
		int num=123;
		int mod=0;
		int add=0;
		int multi=1;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			add+=mod;
			multi*=mod;
		}
		if(multi==add){
			System.out.println("spy");
		}else{
			System.out.println("not");	
		}
	}
}