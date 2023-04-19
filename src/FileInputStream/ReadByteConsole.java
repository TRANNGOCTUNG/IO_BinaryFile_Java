package FileInputStream;

import java.io.*;
import java.util.Arrays;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/FileInputStream/csv");
        byte[] bytes = new byte[10];
        int i ;
        while ((i = is.read(bytes)) != -1) {
            String string = new String(bytes,0,i);
            System.out.println(string);
        }
        is.close();
    }

}
