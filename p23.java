class Demo{
	public static void main(String[]args){
		int num=1234;
		int mod=0;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			System.out.println(mod);
		}
	}
}