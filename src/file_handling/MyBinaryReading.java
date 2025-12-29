package file_handling;

import java.io.*;

public class MyBinaryReading {

    public static void main(String[] args) {

        writeFile();

        File file = new File("src\\file_handling\\Student.dat");

        try (
                FileInputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);
                DataInputStream dis = new DataInputStream(bis)
        ) {
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            System.out.println("Age : " + dis.readInt());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void writeFile() {
        try (
                FileOutputStream fos = new FileOutputStream("src\\file_handling\\Student.dat");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos)
        ) {
            dos.writeUTF("Welcome to Student Data");
            dos.writeUTF("Name : Dilusha");
            dos.writeInt(23);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
