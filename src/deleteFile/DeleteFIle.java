package deleteFile;

import java.io.File;
import java.io.IOException;

public class DeleteFIle {
    public static void main(String[] args) throws Exception {
        try{
        File file = new File("src/deleteFile/in");
        if(file.delete()){
            System.out.println(file.getName() + " is deleted");
        } else System.out.println(" file no delete");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
