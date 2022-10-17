package file;

import java.util.Base64;

public class Application2 {
    public static void main(String[] args) {
        String str = "Hello guys";
        String fileUrl = "c:\\ung_g48\\test\\test.txt";
        byte[] encode = Base64.getEncoder().encode(str.getBytes());
        System.out.println(new String(encode));
    }
}
