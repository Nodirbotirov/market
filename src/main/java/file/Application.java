package file;

import java.io.FileReader;
import java.io.FileWriter;

public class Application {
    public static void main(String[] args) {
    try {
        String fileUrl = "c:\\ung_g48\\test\\test.txt";
        FileWriter fileWriter = new FileWriter(fileUrl);
        fileWriter.write("Hello it's me");
        fileWriter.close();

        int i;
        FileReader fileReader = new FileReader(fileUrl);
        while ((i = fileReader.read()) != -1){
            System.out.print((char) i);
        }
        fileReader.close();

    }catch (Exception e){
        e.printStackTrace();
    }
        }
}
