package day3;
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class LetsCreateCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validVoterStatus(17);
		}catch (InvalidAgeException e) {
			System.out.println("exception message is"+e.getMessage());
		}
		System.out.println("code will run smoothly");

	}
	static void validVoterStatus(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("user cannot vote");
		}
	}

}
