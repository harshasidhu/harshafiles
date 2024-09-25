class Copyy{
  public static void main(String[]args)throws IOException{
    FileInputStream r=new FileInputStream("C:\\Users\\Public\\bl.txt");
    FileOutputStream w=new FileInputStream("C:\\Users\\Public\\nt.txt");
    int i;
    while(i=r.read()!=-1){
      w.write((char)i);
    }
    System.out.println("Data copied");

  }
}
int main(){
  catch(IOException e){
    System.out.println(e);
  }
}
}

}
