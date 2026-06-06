class Demo{
	public static void main(String[]args){
		int num=277475767;
		int mod=0;
		int target=7;
		int count=0;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			if(mod==target){
				count++;
			}
		}
		System.out.println(count);
	}
}