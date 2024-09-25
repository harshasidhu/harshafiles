import java.io.File;
import java.io.IOException;
public class PracticeFileBuff {
  public static void main(String[]args)throws IOException{
    File file_1=new File("fileKing.txt");
    if(file_1.createNewFile()){
      System.out.println("file is created: "+file_1.getName());
    }
    else{
      System.out.println("file is already created");
    }
  }
}
