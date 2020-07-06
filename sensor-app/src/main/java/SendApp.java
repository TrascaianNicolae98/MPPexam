import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SendApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",1234);
        Scanner recive=new Scanner(s.getInputStream());
        PrintStream printStream=new PrintStream(s.getOutputStream());
        System.out.println("Enter the name:");
        String name=sc.next();
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        System.out.println("Lower bound");
        int down=sc.nextInt();
        System.out.println("Uper bound:");
        int up=sc.nextInt();
        Random random = new Random();
        int randomInt = random.nextInt(up - down) + down;
        int id2=id;
        printStream.println(id2);
        do
           {
            printStream.println(name);
            printStream.println(id);
            printStream.println(randomInt);
            Thread.sleep(5000);
            randomInt = random.nextInt(up - down) + down;


        } while(recive.nextInt()!=1);
    }
}
