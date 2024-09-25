import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class PraFileBuffWr{
  public static void main(String[]args)throws IOException{
    FileWriter file=new FileWriter("fileking.txt");
    BufferedWriter buffered = new BufferedWriter(file);
    buffered.write("the java is beautifull.");
    buffered.newLine();
    buffered.write("when we learn it continous");
    System.out.println("success");

  }
}