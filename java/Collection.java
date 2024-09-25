import java.util.*;
public class Collection {
  public static void main(String[]args){
    ArrayList<String>name=new ArrayList<String>();
    name.add("Anand");
    name.add("Jashwanth");
    System.out.print(name);
    name.add("Rahul");
    System.out.print(name);
    name.add(1,"Naryana");
    System.out.print(name);
    //removing the index 
    name.remove(1);
    System.out.println(name);
    //replacing existing value is set method
    name.set(0,"Mukesh");
    System.out.println(name);
    //accessing only the element through get method
    System.out.println(name.get(2));
    //clear method
    name.clear();
    System.out.println(name);
  }
}
