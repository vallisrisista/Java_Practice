public class Throw {

	public static void main(String args[]) {
		int i=11;
		int j=0;
		
		try {
			j=10/i;
			if(j==0) {
				throw new ArithmeticException();
			}
			System.out.println(j+" in try");		
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("j cant be 0");
			j=10/2;
			System.out.println(j+" in catch");
			System.out.println(e);
		}
	}
}
