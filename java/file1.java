import java.io.*;
class File1 {
  public static void main(String[]args){
    File f=new File("C:\\Program Files\\Java\\jdk-21\\bin\\java.exe");
    if(f.exists()){
        System.out.println("File name: "+f.getName());
        System.out.println("File location: "+f.getAbsolutePath());
        System.out.println("File Writable: "+f.canWrite());
        System.out.println("File Readable: "+f.canRead());
        System.out.println("File Size: "+f.length());
      }
      else{
        System.out.println("File doesnot Exists");
    }
  }
  
}
