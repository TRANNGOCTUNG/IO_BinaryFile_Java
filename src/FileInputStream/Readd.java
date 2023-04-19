package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Readd {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("src/FileInputStream/csv");

        byte[] bytes = new byte[10];
        int i = -1;

        while ((i = in.read(bytes)) != -1) {

            String s = new String(bytes, 0, i);
            System.out.println(s);
        }
        in.close();
    }
}
