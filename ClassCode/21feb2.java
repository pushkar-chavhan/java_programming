class A{
	static{
		System.out.println("Inside A class");
	}
}
class SGGS{
	static int x=123;
	SGGS(float x){
			System.out.println("Inside SGGS class");	
	}
	static {
	x=78;	
	}
	public static void main(String[] args){
		SGGS s=new SGGS(0.2f);
				System.out.println(x);
	}
	
	
}
