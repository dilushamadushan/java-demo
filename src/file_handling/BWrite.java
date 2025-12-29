package file_handling;

import java.io.*;

public class BWrite {
    public static void main(String[] args) {

        // Binary file (.dat)
        File fp = new File("src\\file_handling\\sm.dat");

        try (
                FileOutputStream fos = new FileOutputStream(fp);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos)
        ) {
            // Writing binary data
            dos.writeUTF("Hello");
            dos.writeInt(12);

            System.out.println("Binary data written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
