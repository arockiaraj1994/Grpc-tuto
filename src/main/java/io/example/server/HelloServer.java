package io.example.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class HelloServer {

    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) throws IOException, InterruptedException {
        
        Server server = ServerBuilder.forPort(SERVER_PORT).addService(new GreeterServiceImpl()).build();
        
        server.start();

        System.out.println("Server Started" + SERVER_PORT);
        
        server.awaitTermination();
    }
}
