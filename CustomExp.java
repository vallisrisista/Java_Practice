
class ValueZeroExp extends Exception {
	
}

public class CustomExp {
	public static void main(String args[]) {
		int i=11;
		int j=0;		
		try {
			j=10/i;
			if(j==0) {
				throw new ValueZeroExp();
			}
			System.out.println(j+" in try");		
			}
		
		catch(ValueZeroExp e) {
	
			j=10/2;
			System.out.println(j+" in catch");
			
		}
	}

}
