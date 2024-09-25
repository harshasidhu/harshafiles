import java.io.File;
import java.io.IOException;
public class CreateFile2 {
  public static void main(String[]args)throws IOException{
    File myfile=new File("firstfile.txt");
    if(myfile.createNewFile()){
      System.out.println("File created "+ myfile.getName());

    }
    else{
      System.out.println("File already existed");
    }
  }
}
