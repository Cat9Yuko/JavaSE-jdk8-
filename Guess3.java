// Guess the letter game,3re version.
class Guess3{
	public static void main(String[] args)throws java.io.IOException {
		char ch,answer='K';
		System.out.println("I'm thinking of a letter between A and Z.");

		ch=(char)System.in.read();

		if(ch==answer)System.out.println("**Right**");
		else{
			System.out.println("...Sorry,you're ");
			//a nested if
		if(ch<answer)System.out.println("too low");
		else System.out.println("too high"); 
	}
	
	}
}