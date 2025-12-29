package file_handling;

import java.io.*;

public class BRead {
    public static void main(String[] args) {

        File fp = new File("src\\file_handling\\sm.dat");

        try (
                FileInputStream fis = new FileInputStream(fp);
                BufferedInputStream bis = new BufferedInputStream(fis);
                DataInputStream dis = new DataInputStream(bis)
        ) {
            // Reading binary data
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
