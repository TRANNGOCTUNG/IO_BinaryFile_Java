package appendFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppendToFile {
    private static final String FILE_NAME = "src/appendFile/inFile";

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String data = "The next day:";
            String next = "heslo hesly";
            File file = new File(FILE_NAME);
            if(! file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.write(next);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(bw != null)
                    bw.close();
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
