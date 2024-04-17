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
		System.out.println("In CastVote:: ECIndia");	
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



