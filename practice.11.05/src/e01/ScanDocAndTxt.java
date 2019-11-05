package e01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 崔英俊
 * @date 2019-11-05
 * @version 1.0
 */
public class ScanDocAndTxt {

    static List<File> fList = new ArrayList();

    public static void main(String[] args) throws IOException {

        File src = new File("/Users/edz/project/java/foldera");
        File aim = new File("/Users/edz/project/java/folderb/1.txt");

        if (!aim.exists()) {

            aim.createNewFile();
        }

        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(aim, true));

        for (File fi : getFileList(src)) {

            InputStreamReader reader = new InputStreamReader(new FileInputStream(fi));
            char [] ch = new char[(int)fi.length()];
            System.out.println(ch);
            reader.read(ch);
            writer.write(ch);
            reader.close();
        }

        writer.close();
    }

    public static List<File> getFileList(File file) {

        File[] list= file.listFiles();

        if(list != null) {

            for(File f : list) {

                if(f.isFile()) {
                    if(f.getName().endsWith("doc")||f.getName().endsWith("txt")) {
                        fList.add(f);
                    }
                }
                else {
                    getFileList(f);
                }
            }
        }
        return fList;
    }

}
