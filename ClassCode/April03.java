class Example{
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
	
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Inside ArrayIndexOutOfBoundS");
	}
	catch(InterruptedException e){
		System.out.println("Inside Interrupted");
	}
	finally{
		System.out.println("Inside Finally");	
	}
	}
}
