package coding1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/11
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.11.15", 2333);
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        for (int i = 0; i < 5; i++) {

            String input = sc.next();
            os.write(input.getBytes());

            if ("quit".equalsIgnoreCase(input)) {
                System.out.println("已退出");
                break;
            }

            byte[] by = new byte[1024];
            is.read(by);
            int pos = 0;

            for (int j = 0; j < by.length; j++) {
                if (by[j] == 0) {
                    pos = j;
                    break;
                }
            }

            byte[] bytes = new byte[pos];

            for (int j = 0; j < bytes.length; j++) {
                bytes[j] = by[j];
            }
            String str;
            System.out.println(str = new String(bytes));
            if ("猜中了".equals(str)) {
                break;
            }
        }
        socket.close();
    }
}


