package scannerFile;

import java.io.File;
import java.util.Scanner;

public class scannerFile {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/scannerFile/inFile"));
        while (scanner.hasNext()){
            long along = Long.parseLong(scanner.next());
        }
    }
}
