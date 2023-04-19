package byteStream;

import java.io.*;

public class CopyFileByte {
    public static void main(String[] args) throws Exception {
        // Đọc file kiểu dữ liệu byte
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("src/byteStream/CSV");
            outputStream  = new FileOutputStream("src/byteStream/OutCSV");
            int c;
            while ((c = inputStream.read()) != -1 ){
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }

}
