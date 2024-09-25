import java.util.*;
public class _Stack {
  public static void main(String[]args){
    Stack<String>name=new Stack<>();
    //push follows insert
    name.push("Ankit");
    name.push("Ankush");
    name.push("Rohit");
    System.out.println(name);
    //pop follows LIFO
    //pop means remove
    name.pop();
    System.out.println(name);
  }
}
