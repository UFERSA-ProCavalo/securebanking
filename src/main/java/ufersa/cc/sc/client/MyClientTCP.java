package ufersa.cc.sc.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import ufersa.cc.sc.Main;

public class MyClientTCP implements Runnable {

    private Socket socket;

    public MyClientTCP(Socket socket) {
        this.socket = socket;
    }

    private void SendMessage() throws Exception{
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String str = userInput.readLine();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(str);
    }

    /*
     * First interaction
     * Enables sharing of public keys
     */
    private void Send_First_Message() throws Exception{
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Connection Stablished!");
        out.println("Welcome to the Secure Banking System!");
    }

    private void ReceiveMessage() throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
    }

    @Override
    public void run() {
        try {
            /*
             * Data orientation
             * User -> Server
             */
            SendMessage();

            /*
             * Data orientation
             * User <- Server
             */
            ReceiveMessage();

            Main.main(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
