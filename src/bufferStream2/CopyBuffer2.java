package bufferStream2;

import java.io.*;

public class CopyBuffer2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            Reader reader = new FileReader("src/bufferStream2/inputbuffer.csv");
            Writer writer = new FileWriter("src/bufferStream2/outbuffer.cvs");
            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);
            int c ;
            while ((c = bufferedReader.read()) != -1) {
                     bufferedWriter.write(c);
            }
        } finally {
            if (bufferedReader != null)
                bufferedWriter.close();
            if (bufferedWriter != null)
                bufferedWriter.close();
        }
    }
}
