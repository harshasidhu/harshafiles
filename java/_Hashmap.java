import java.util.HashMap;
import java.util.Map;
public class _Hashmap {
  public static void main(String[]args){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(63,"Jashwanth");
    hm.put(30," ");
    hm.put(null," ");
    hm.put(null,"sai");
    System.out.println(hm);
    //It replaces output 
    hm.replace(30,"kumar");
    System.out.println(hm);
    //Gives specified output through Get function
    System.out.println(hm.get(63));
    //It gives output in true or false
    System.out.println(hm.containsKey(1));
    System.out.println("Size of hm is: "+hm.size());
  }

  // public static void main(String[]args){
  //   HashMap<String,Integer>map=new HashMap<>();
  //   map.put("jashwanth",63);
  //   map.put("anand",30);
  //   for(Map.Entry<String,Integer>e:map.entrySet())
  //     System.out.println("Key:"+e.getKey()+ " Value: "+e.getValue());
  // }

}
