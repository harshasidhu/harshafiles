import java.io.FileWriter;
import java.io.IOException;
public class WriteFile2 {
  public static void main(String[]args)throws IOException{
      FileWriter mywriter=new FileWriter("firstfile.txt");
      mywriter.write("File in java my be tricky");
      mywriter.write("\n");
      mywriter.write("king is back with his presentation skills");
      mywriter.close();
      System.out.println("succeffully wrote to the file.");
  }
}
