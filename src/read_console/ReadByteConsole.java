package read_console;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
       while (true){
               System.out.println("Nhập một ký tự: ");
               int read = is.read();
               if (read == 'q') {
                   System.out.println("Finished:");
                   break;
               }
               is.skip(2);
           System.out.println("Kí tự nhận được: " + (char)read);
       }
    }
}
