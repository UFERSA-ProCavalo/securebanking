package ufersa.cc.sc.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
    private static List<Thread> clients = new ArrayList<Thread>();


    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Server online");
            System.out.println("Listening on port 0001");
            System.out.println("Waiting for clients. . .\n");
            ServerSocket serverSocket = new ServerSocket(0001);

            while (true) {

                Socket socket = serverSocket.accept();

                System.out.println("Novo cliente conectado: " + socket.getPort());

                Thread thread = new Thread(new MyServerTCP(socket));

                clients.add(thread);

                thread.start();
                //System.out.println("thread info:" + thread.getId() + " " + thread.getName() + " " + thread.getState());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
