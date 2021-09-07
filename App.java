import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("i'm a ping pong app");
        System.out.println("Enter a number");
        try{
            String stringUserNumber = bufferedReader.readLine();
            int intUserName = Integer.parseInt(stringUserNumber);

            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserName);
            System.out.println(pingPongResult);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}