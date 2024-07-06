import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

class Task{
    String name;
    int priority;
    String deadline;
    Task(String n,int p,String d){
        name=n;
        this.priority=p;
        this.deadline=d;
    }   
    public String display_Task(){
        return "in Task display";
    }
    @Override
    public String toString() {
        return "Task{name='" + name + "', pri=" + priority + " deadline=" + deadline + "}";
    }

}

class Item{
    String name;
    int cost;
    Item(String n,int c){
        name=n;
        cost=c;
    }   
    @Override
    public String toString() {
        return "Item{name='" + name + " Cost= " + cost +"}";
    }

}
public class GenericsDemo {
    public static void main(String[] args) {
        Task task1=new Task("Java assignment",3,"07/07/2024");
        Task task2=new Task("AI ML assignment",2,"10/08/2024");
        Item item=new Item("oil",200);
        System.out.println(item);
        System.out.println(task1.name+ " " + task1.priority+ " " +task1.deadline);
        List tasks= new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(item);
        System.out.println(tasks);
        System.out.println((Task)tasks.get(0));
        //the below line will give class cast exception during runtime. so to avoid that, we using
        //the conecpt of generics. we need to specify the type of the collection while defining it
        //so that if other type of object is added, it will throw error during compile time 
        // while adding itself as "incompatible types". for that, declaring line should be
        //List<Task> tasks= new ArrayList<>();
         System.out.println((Item)tasks.get(0));
       
    }
}
