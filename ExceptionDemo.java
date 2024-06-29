
public class ExceptionDemo {
	public static void main(String args[]) {
	int i=0;
	int j=10;
	int arr[]=new int[5];
	arr[0]=1;
	System.out.println(arr[0]);
	try {
		arr[5]=1;
		System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e);
	}
	try{	
		j=j/i;
		System.out.println(j+" in try");
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}	
	///catch is compulsory if try block exits.otherwise it throws compilation error
	//Catch block is executed only if there comes an exception in try block.
	//if try block gets executed with out any exception, catch will not be executed.
	catch(Exception e){
		System.out.println(j);
		System.out.println("caught in catch"+e);
		//here e is object of exception class which stores the exception
		//thrown by try block
	}
	
	finally {
		System.out.println("in finally");
	}
	}
}
