class Printer extends Thread{
    public void run(){
        for( int i=0;i<30;i++)
        System.out.println("Printer is printing");
    }
}
class Scanner extends Thread{
    public void run(){
        for( int i=0;i<30;i++)
        System.out.println("Scanner is scanning");
    }
}
class ThreadDemo{
    public static void main(String args[]) {
        Printer p=new Printer();
        Scanner s=new Scanner();
        p.start();
        s.start();
    }
}