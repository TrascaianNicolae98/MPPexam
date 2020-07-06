package ServerApp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class ServerRecive {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket=new ServerSocket(1234);
        System.out.println("Sunt aici");
        HashMap<Integer,Thread> threads=new HashMap<>();
        while(true) {
            Socket ss = serverSocket.accept();
            Scanner sc=new Scanner(ss.getInputStream());
            PrintStream printStream=new PrintStream(ss.getOutputStream());
            int id1=sc.nextInt();
            /*while (true){

                String name = sc.next();
                int id = sc.nextInt();
                int measure = sc.nextInt();
                Sensor sensor = new Sensor(id, name, measure);
                System.out.println(sensor);
                printStream.println(2);
            }*/
            Thread t = new Thread(new ClientHandler(ss,sc));
            threads.put(id1,t);
            t.start();
        }
    }
}
