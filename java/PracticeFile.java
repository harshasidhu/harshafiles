import java.io.File;
import java.io.IOException;
public class PracticeFile {
  public static void main(String[]args)throws IOException{
  File file=new File("ethername.txt");
  if(file.createNewFile()){
    System.out.println("file created: "+file.getName());

  }
  else{
    System.out.println("File already exist");
  }
  }
}
