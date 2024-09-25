import java.util.*;
public class _TreeSet {
  public static void main(String[]args){
    TreeSet<String>ts=new TreeSet<String>();
    ts.add("Jashwanth");
    ts.add("Anand");
    ts.add("Kumar");
    System.out.println(ts);
    ts.remove("Anand");
    System.out.println(ts);
  }
}
