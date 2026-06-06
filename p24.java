class Demo{
	public static void main(String[]args){
		int num=789;
		int mod=0;
		int add=0;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			add+=mod;
		}
		System.out.println(add);
	}
}