import java.io.FileWriter;
import java.io.IOException;
public class PraticeFile {
  public static void main(String[]args)throws IOException{
    FileWriter urwriter=new FileWriter("ethername.txt");
    urwriter.write("File handling in java is tough but learing it is easy");
    urwriter.close();
    System.out.println("writen succesfully");



  }
}
