class Calculator {
	public static void main(String args[]) {
		int n1 = 10;
		int n2 = 5;
		int result = 0;
		char ch = '*';

		switch(ch) {
		case '+' : result = n1 + n2;
			   System.out.println("Addition is : " +result);
			   break;

		case '-' : result = n1 - n2;
			   System.out.println("Substraction is : " +result);
			   break;
 
		case '*' : result = n1 * n2;
			   System.out.println("Multiplication is : " +result);
			   break;

		case '/' : result = n1 / n2;
			   System.out.println("ivision is : " +result);
			   break;

		default : System.out.println("operator not found");
			   break;

		}

	}
}