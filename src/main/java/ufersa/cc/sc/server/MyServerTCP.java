package ufersa.cc.sc.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MyServerTCP implements Runnable {

    // private static BigInteger PrivateKey;
    // private static BigInteger PublicKey;
    // 
    // private static Map<Integer, BigInteger> publicKeys = new HashMap<Integer,
    // BigInteger>();
    // private static Map<Integer, String> SymetricKeys = new HashMap<Integer,
    // String>();

    private boolean connected = true;
    private Socket socketClient;
    private int activeClients = 0;
    private int clientPort;
    private Map<Integer, BigInteger> Client_Public_Keys = new HashMap<Integer, BigInteger>();

    public MyServerTCP(Socket socket) {
        this.socketClient = socket;
    }

    @Override
    public void run() {
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
            String str = in.readLine();
            System.out.println("Client: " + str);
            PrintWriter out = new PrintWriter(socketClient.getOutputStream(), true);
            out.println("Server: " + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
