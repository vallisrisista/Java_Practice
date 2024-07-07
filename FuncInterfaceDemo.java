/*
 * Stream
 */
@FunctionalInterface
interface Data {
 public void process();   
}
class FuncInterfaceDemo{
    public static void main(String[] args) {
        Data d=()->{
            //Optimized code for func interfacing using lambda exp
            System.out.println("Data Processed");
             };
        d.process();
        
    }
}