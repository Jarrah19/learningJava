package e01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 崔英俊
 * @date 2019-11-04
 * @version 1.0
 */
public class IO_Demo {

    public static void main(String[] args) throws IOException {

        File file = new File("./aoi.txt");

        if (!file.exists()) {

            file.createNewFile();
        }

        FileInputStream is = new FileInputStream(file);
        FileOutputStream os = new FileOutputStream(file);

        String str = "where is a will, there is a way";

        os.write(str.getBytes());

        os.close();

        String string ="";

        for (int i = 0; i < file.length(); i++) {

            string += (char) is.read();

        }
        System.out.println(string);

        is.close();
    }
}
