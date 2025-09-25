import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Bookstore {
    public static void main(String[] args) {
        String data = "Book order placed at [your preferred time]";
        File file = new File("log.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file writing: " + e.getMessage());
        }

        try {
            FileReader reader = new FileReader(file);
            System.out.print("File content: ");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println(); 
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
        }

        boolean value = file.delete();
        if (value) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }
    }
}