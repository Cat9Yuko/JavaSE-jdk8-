/*
	Demonstrate a block code.


	Call this file BlockDemo.java.

*/

	class BlockDemo{

		public static void main(String[] args){
			double i,j,d;

			i = 5;
			j = 10;
			//THE TARGET OF THIS IF IS A BLOCK

			if(i!=0){
				System.out.println("i does not equal zero");
				d=j/i;

				System.out.println("j / i is "+d);
			}
		}
	}