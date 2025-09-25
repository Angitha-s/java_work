import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

class school {
    public static void main(String[] args) {
        String data="Java File Handling Practice";
        File file = new File("assignment.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            System.out.println("File written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred during file writing: " + e.getMessage());
        }
        try {
            FileReader reader = new FileReader(file);
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
        }

        boolean value = file.delete();
        if(value) {
            System.out.println("The File is deleted.");
        }
        else {
            System.out.println("The File is not deleted.");
        }
    }
}