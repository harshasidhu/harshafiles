import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Fun implements Serializable{
    int id=310;
    String name="Java Programmming.";
    
}
public class trycatch{
    public static void main(String args[]){
        try{
            Fun s1=new Fun();
            FileOutputStream fout=new FileOutputStream("ff.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");
        }
        catch(Exception e){
           System.out.println(e);
        }

        try{
            FileInputStream fis=new FileInputStream("ff.txt");
            ObjectInputStream in=new ObjectInputStream(fis);
            Fun s=(Fun)in.readObject();
            System.out.println(s.id+" "+s.name);
            in.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}