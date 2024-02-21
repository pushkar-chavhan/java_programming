class SGGS{
	int x=123;
	SGGS sggs;
	//SGGS sggs=new SGGS();
	//if we make it static then ut will work
	static SGGS s=new SGGS();
	public static void main(String[] args){
		SGGS s= new SGGS();
		System.out.println(s.x);
	}
}
