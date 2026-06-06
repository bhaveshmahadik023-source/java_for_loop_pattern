class Demo{
	public static void main(String[]args){
		int num=1315347;
		int mod=0;
		int max=0;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			if(mod>max){
				max=mod;
			}
		}
		System.out.println(max);
	}
}