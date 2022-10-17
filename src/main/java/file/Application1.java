package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Application1 {
    public static void main(String[] args) {
         try {
             String fileUrl = "c:\\ung_g48\\test\\test.txt";
             FileOutputStream fileOutputStream = new FileOutputStream(fileUrl);
             String text = "Example to use FileOutputStream";
             byte[] bytes = text.getBytes();

             fileOutputStream.write(bytes);
             fileOutputStream.close();

             FileInputStream fileInputStream = new FileInputStream(fileUrl);
             byte[] bytes1 = fileInputStream.readAllBytes();
             System.out.println(new String(bytes1));
             fileInputStream.close();
         }catch (Exception e){

         }
    }
}
