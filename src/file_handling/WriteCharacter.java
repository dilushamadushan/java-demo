package file_handling;

import java.io.*;

public class WriteCharacter {
    public static void main(String[] args) {

        File fp = new File("src\\file_handling\\stu.txt");

        try (
                FileWriter fw = new FileWriter(fp, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)
        ) {
            // Writing text data
            pw.println("Hello-oo");
            pw.println("Hello-oo1");
            pw.println("Hello-oo2");

            System.out.println("Text written successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
