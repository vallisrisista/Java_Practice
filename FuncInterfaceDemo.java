/*
 * Stream
 */
@FunctionalInterface
interface Data {
 public void process();   
}
class FuncInterfaceDemo{
    public static void main(String[] args) {
        //optimized implementation of func interface using lambda expression
        Data d= () ->  {
                System.out.println("Data Processed");
            };
        d.process();
        
    }
}