package file_handling;

import java.io.*;

public class ReadCharacter {
    public static void main(String[] args) throws IOException {

        File fp = new File("src\\file_handling\\stu.txt");

        if (!fp.exists()) {
            throw new IOException("File not found");
        }

        try (
                FileReader fr = new FileReader(fp);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
