public class Throwskeyword {
    public static void main(String[] args)
    throws ClassNotFoundException
    {
        // get the Class instance using forName method
        Class c1 = Class.forName("java.lang.Strings");
 
        System.out.print("Class represented by c1: "
                         + c1.toString());
    }
}