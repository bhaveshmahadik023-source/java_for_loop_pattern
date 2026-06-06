class Demo{
	public static void main(String[]args){
		int num=50347;
		int mod=0;
		boolean is_duck=false;
		for(int i=num; i>0;i=i/10){
			mod=i%10;
			if(mod==0){
				is_duck=true;
				break;
			}
		}
		if(is_duck){
			System.out.println("duck");
		}else{
			System.out.println("not duck");	
		}
	}
}