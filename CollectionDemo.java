import java.util.*;

class CollectionDemo {
       public static void main(String[] args) {
            //Adding  Data type removes the warning of unchecked exceptions.
            Collection<Integer> nums=new ArrayList<>();
            nums.add(2);
            //As we dclared the nums array list to be an integer type, we cant have a character
            //nums.add("d");
            System.out.println(nums);
            
    }

}
