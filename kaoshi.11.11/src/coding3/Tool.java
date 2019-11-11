package coding3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/11
 */
public class Tool {

    static File file= new File ("/Users/edz/project/java/kaoshi.11.11/src/player.txt");
    static Map map = new HashMap();
    static Reader reader;
    static BufferedReader br;

    static {
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(str != null) {

            map.put(str.split("，")[0], str.split("，")[1]);
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
