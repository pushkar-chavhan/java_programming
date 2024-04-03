Class Example{
	public static void main(String ...args){
	try{
		Thread.sleep(1000);
		System.out.println("Inside try 1");
		Thread.sleep(3000);
		System.out.println("Inside try 2");	
		System.out.println(args[0]);
		Thread.sleep(1000);
		System.out.println("Inside try 3");
	}
	catch(Exception e){
		System.out.println("Inside A");
	}
	}
}
