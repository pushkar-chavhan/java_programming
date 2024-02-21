class A{
	static{
		System.out.println("Inside class A");
	}
}
class SGGS{
	SGGS(){
		System.out.println("SGGS constructor");
	}
	static{
		System.out.println("Inside class SGGS");
	}
	static public void main(String[] args){
		SGGS s=new SGGS();
		A a=new A();
	}
}
