//logic 1

class Demo{
	public static void main(String[]args){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		Codex.fun();
	}
}


//logic 2

class Codex{
	static void fun(){
		int count=1;
		for(int i=1;i<=3;i++){
			count=1;
			for(int j=1;j<=3;j++){
				System.out.print(count);
				count++;
			}
			System.out.println();	
		}
	}
}