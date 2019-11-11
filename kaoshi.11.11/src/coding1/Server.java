package coding1;

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

            int ra = (int) (Math.random() * 51);

            try {
                s = socket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(ra);

            for (int i = 0; i < 5; i++) {

                try {
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

                int pos = 0;
                for (int j = 0; j < by.length; j++) {
                    if (by[j] == 0) {
                        pos = j;
                        break;
                    }
                }

                byte [] bytes = new byte[pos];
                for (int j = 0; j < bytes.length; j++) {
                    bytes[j] = by[j];
                }
                String str = new String(bytes);

                if ("quit".equalsIgnoreCase(str)) {
                    System.out.println("对方已断开连接");
                    break;
                }

                System.out.println(str);

                if (new Integer(str) == ra) {

                    try {
                        os.write("猜中了".getBytes());
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {

                    if(new Integer(str) > ra) {
                        str = "猜大了";
                    }
                    else {
                        str = "猜小了";
                    }

                    try {
                        os.write(str.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}