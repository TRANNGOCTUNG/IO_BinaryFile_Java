package charactorStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileStream {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("src/charactorStream/charactor");
            fileWriter = new FileWriter("src/charactorStream/outCharctor");
            int c;
            while ((c = fileReader.read()) != -1){
                fileWriter.write(c);
            }
        } finally {
            if(fileReader != null) fileReader.close();
            if (fileWriter != null) fileWriter.close();
        }
    }
}
