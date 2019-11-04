import java.io.*;
import java.util.logging.Filter;

/**
 * @author 崔英俊
 * @date 2019-11-04
 * @version 1.0
 */
public class MovePicAndMp3 {

    public static void main(String[] args) throws IOException {

        File src = new File("/Users/edz/project/java/foldera");
        File aim = new File("/Users/edz/project/java/folderb");

        File[] fileArray = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isFile()) {
                    return pathname.getName().endsWith("mp3")|| pathname.getName().endsWith("jpg");
                }
               return false;
            }
        });

        System.out.println(fileArray.length);

        for (File f: fileArray) {

            FileInputStream is = new FileInputStream(f);

            File newfile = new File(aim.getPath() + '/' + f.getName());
            if(!newfile.exists()) {
                newfile.createNewFile();
            }

            FileOutputStream os = new FileOutputStream(newfile);

            byte [] bytes = new byte[(int)f.length()];
            is.read(bytes);
            os.write(bytes);

            is.close();
            os.close();
        }
    }
}
