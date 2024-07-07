/*
 * Stream
 */
@FunctionalInterface
interface Data {
 public void process();   
}
class FuncInterfaceDemo{
    public static void main(String[] args) {
        Data d=new Data(){
            /* below is directly implementing the abstract method in Data 
            while creating an object of it. Else, obj cant be created to Data
            as it is an interface. This can be done only if data is a 
            functional interface */ 
            public void process(){
                System.out.println("Data Processed");
            }
        };
        d.process();
        
    }
}