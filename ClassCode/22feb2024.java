class SGGS{
	static int x=786;
	{//init block
		System.out.println("Inside init block"+this);
	}
	SGGS(){
		System.out.println("Inside default constructor"+this);
	}
	SGGS(int x){
		System.out.println("Inside parameterised constuctor"+this);
	}
	static public void main(String[] args){
	SGGS sggs1=new SGGS(2);
		System.out.println("inside main");
	SGGS sggs2=new SGGS();
	
	}
	static{
		System.out.println("Static inside main block");
	}
}
