import java.util.*;
public class _TreeSet {
  public static void main(String[]args){
//It follows sorting order 
//It follows Ascending order
    TreeSet<String>ts=new TreeSet<String>();
    try
    {
      ts.add("Jashwanth");
      ts.add(null);
  }
  catch(NullPointerException e){
    System.out.println("null poointer exception");
  }
  
  }
}
