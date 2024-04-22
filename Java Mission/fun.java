interface Voter{
	void castVote();
}

interface EC {
	void checkVailidityOfVoter(int age) throws InvalidVoter;
}


class ECIndia implements Voter, EC{
	 int minAge;
	
	ECIndia(int minAge){
		this.minAge = minAge;
	}

	public void castVote(){
		//System.out.println("In CastVote:: ECIndia");	
		int arr[]={1,2,3};
		try{
			System.out.println("in cast vote;Ec India"+arr[3]);
		}
		catch(Exception e){
			System.out.println(e);
			// for(StackTraceElement element:e.getStackTrace()){
			// 	System.out.println(element);
			// 	System.out.println(element.getClassName()+"_"+element.getMethodName()+"("+element.getFileName()+"_"+element.getLineNumber()+")");
			// }

		}
	}
	
	public void checkVailidityOfVoter(int age) throws InvalidVoter{
		if(age < minAge){
			throw new InvalidVoter("Invalid Voter");
		}
	}
}

class ECBrazil implements Voter, EC{
	public void castVote(){
		System.out.println("In CastVote:: ECBrazil");	
	}
	
	public void checkVailidityOfVoter(int age){
		
	}
}


class Election2024{

	public static void main(String ...args){
		ECIndia ecIndia = new ECIndia(20);
		ecIndia.checkVailidityOfVoter(21);
	}
}
class InvalidVoter extends RuntimeException{
	InvalidVoter(String error){
		super(error);
	}
}



