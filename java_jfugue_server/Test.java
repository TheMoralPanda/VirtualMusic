
//webserver for java
//to listen to the calibaration from c++

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import org.jfugue.*; 
import java.lang.*;
import java.util.*;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Test {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/music", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            Player player = new Player();
            Pattern pattern;
            
            String id = t.getRequestURI().getQuery();
            System.out.println(id);

            switch(Integer.parseInt(String.valueOf(id.charAt(3)))){
                case 1:
                    pattern = new Pattern("C");
                    player.play(pattern);
                    break;
                case 2:
                    pattern = new Pattern("D");
                    player.play(pattern);
                    break;
                case 3:
                    pattern = new Pattern("E");
                    player.play(pattern);
                    break;
                case 4:
                    pattern = new Pattern("F");
                    player.play(pattern);
                    break;
                case 5:
                    pattern = new Pattern("G");
                    player.play(pattern);
                    break;
                case 6:
                    pattern = new Pattern("A");
                    player.play(pattern);
                    break;
                case 7:
                    pattern = new Pattern("B");
                    player.play(pattern);
                    break;
                case 8:
                    pattern = new Pattern("C#");
                    player.play(pattern);
                    break;
                
            }
             

            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

}