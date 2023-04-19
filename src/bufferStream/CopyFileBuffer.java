package bufferStream;

import java.io.*;

public class CopyFileBuffer {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bufferedReader = null;
        BufferedOutputStream bufferedWriter = null;
        try {
            InputStream fileInputStream = new FileInputStream("");;
            OutputStream fileOutputStream = new FileOutputStream("");
            bufferedReader = new BufferedInputStream(fileInputStream);
            bufferedWriter = new BufferedOutputStream(fileOutputStream);
            int c;
            while ((c = bufferedReader.read()) !=1){
                bufferedWriter.write(c);
            }
        } finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }

}
