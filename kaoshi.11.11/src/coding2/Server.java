package coding2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/11
 */
public class Server extends Thread {
    static ServerSocket socket = null;
    Socket s = null;
    InputStream is = null;
    OutputStream os = null;

    static {
        try {
            socket = new ServerSocket(2333);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        while (true) {
            try {
                s = socket.accept();
                os = s.getOutputStream();
                is = s.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }

            byte[] by = new byte[1024];

            try {
                is.read(by);
            } catch (IOException e) {
                e.printStackTrace();
            }

            by = getEff(by);
            String str = new String(by);
            System.out.println(str);

            if ("bjsxt".equals(str)) {

                try {
                    os.write("请输入密码".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                by = new byte[1024];
                try {
                    is.read(by);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                by = getEff(by);
                str = new String(by);
                System.out.println(str);
                if ("bjsxt".equalsIgnoreCase(str)) {
                    try {
                        os.write("登录成功".getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        os.write("密码错误, 登录失败".getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    os.write("用户名错误, 登录失败".getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
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
