package coding2;

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

        System.out.println("请输入用户名");
        os.write(sc.next().getBytes());

        byte [] by =  new byte[1024];
        is.read(by);
        System.out.println(new String(getEff(by)));
        if("用户名错误, 登录失败".equals(new String(getEff(by)))) {
            socket.close();
            System.exit(0);
        }
        os.write(sc.next().getBytes());
        by = new byte[1024];
        is.read(by);
        System.out.println(new String(getEff(by)));

        socket.close();
    }

    static byte[] getEff(byte[] by) {
        int pos = 0;
        for (int i = 0; i < by.length; i++) {
            if (by[i] == 0) {
                pos = i;
                break;
            }
        }

        byte[] bytes = new byte[pos];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = by[i];
        }

        return bytes;
    }
}
