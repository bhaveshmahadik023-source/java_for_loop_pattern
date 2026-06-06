class Demo{
	public static void main(String[]args){
		int num=5347;
		int mod=0;
		int min=10;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			if(mod<min){
				min=mod;
			}
		}
		System.out.println(min);
	}
}