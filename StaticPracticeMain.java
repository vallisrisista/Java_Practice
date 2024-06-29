class Student {
   private int id;
   private String name;
   private static String clg;
   //this will be executed only once, when the class is loaded by the class loader
    static 
    {
         clg="nkv";
         System.out.println("in static block");
    }
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public static void show(Student st1){
    //this non static variable cant be accessed direcly in static method, 
    //so passing its object as an argument
    System.out.println(clg +" " + st1.name);
}
@Override
public String toString() {
    return "Student [id=" + id + ", name=" + name + ", clg=" + clg + ", hashCode()=" + hashCode() + ", toString()="
            + super.toString()  + "]";
} 

    
}
public class StaticPracticeMain{
    public static void main(String args[]){
        Student st1=new Student();
        Student st2=new Student();
        st1.setId(1);
        st1.setName("valli");
        //static method should be accessed from class instead of object
        Student.show(st1);
        System.out.println(st1.toString());
        st2.setId(2);
        st2.setName("uma");
       
        System.out.println(st2.toString());

    } 
}


