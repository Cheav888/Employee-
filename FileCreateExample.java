package Testing;

import java.io.File;
import java.io.IOException;

public class FileCreateExample {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
