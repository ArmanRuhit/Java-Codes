import java.io.*;

public class test2 {
  public static void main(String[] args) throws IOException{
    InputStreamReader cin = null;

    try {
      cin = new InputStreamReader(System.in);
      System.out.println("press q to quit");
      char c;
      do {
        c = (char) cin.read();
        System.out.print(c);
      }while(c != 'q');
    } finally {
      if(cin != null){
        cin.close();
      }
    }
  }
}
