import java.io.FileReader;
import java.io.IOException;
public class PraticeFileRead{
  public static void main(String[]args)throws IOException{
    char[]array=new char[100];
    FileReader urreader=new FileReader("ethername.txt");
    urreader.read(array);
    System.out.println("Data in the file: ");
    System.out.println(array);
    urreader.close();
  

  }
}