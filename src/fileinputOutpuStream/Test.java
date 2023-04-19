package fileinputOutpuStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("temp.dat")) {
            //ghi từng giá trị với vòng lặp 1 -> 10
            for (int i = 0; i < 10; i++) {
                output.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc file với một InputStream
        try (FileInputStream input = new FileInputStream("temp.dat")) {
            int value;
            //đọc giá trị với vòng lặp
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
