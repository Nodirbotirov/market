package file;

import java.io.File;

public class Files {
    public static void main(String[] args) {

        try {
            File file = new File("c:\\ung_g48\\test");
            file.mkdirs();
            File file1 = new File(file, "test.txt");
            file1.createNewFile();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
