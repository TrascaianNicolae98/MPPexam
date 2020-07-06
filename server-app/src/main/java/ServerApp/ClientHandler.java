package ServerApp;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.*;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket socket;
    private Scanner sc;
    private PrintStream printStream;
    public ClientHandler(Socket clientSocket,Scanner sc) throws IOException {
        this.socket=clientSocket;
        this.sc=sc;
        printStream=new PrintStream(socket.getOutputStream());
    }

    public void writeToDataBase(Sensor sensor) throws SQLException {
        String url = "jdbc:postgresql://localhost/Sensor";
        String user="postgres";
        String password="nicu1998199";

        Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement statement=conn.prepareStatement("INSERT INTO Sensor(Name,Measurement,Time)"+ "values (?,?,?)");
        statement.setString(1,sensor.getName());
        statement.setInt(2,sensor.getMeasurement());
        statement.setLong(3,sensor.getTime());
        int st=statement.executeUpdate();

    }
    @SneakyThrows
    @Override
    public void run() {
        while(true) {
            String name = sc.next();
            int id = sc.nextInt();
            int measure = sc.nextInt();
            long time=System.currentTimeMillis();
            Sensor sensor = new Sensor(id, name, measure,time);
            this.writeToDataBase(sensor);
            System.out.println(sensor);
            printStream.println(2);
        }


    }
}
