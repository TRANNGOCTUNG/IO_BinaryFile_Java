package doc_ghi_danh_sach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("src/siriliazation/stoodent.txt",students);
        List<Student> students1 = readDataFromFile("src/siriliazation/stoodent.txt");
        for (Student s: students1
             ) {
            System.out.println(s);

        }

    }
    public static void writeDataToFile(String path, List<Student> students) {
      try{
          FileOutputStream fos = new FileOutputStream(path);
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(students);
          oos.flush();
          oos.close();
      }catch(Exception e){
          e.printStackTrace();
      }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<Student>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>)ois.readObject();
            ois.close();
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }
}
