package ufersa.cc.sc.client;

import java.io.IOException;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client online");
            Socket socket = new Socket("localhost", 0001);
            Thread thread = new Thread(new MyClientTCP(socket));
            thread.start();
            
            //System.out.println("thread info:" + thread.getId() + " " + thread.getName() + " " + thread.getState());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
