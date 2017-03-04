package io.example.client;

import io.example.GreeterGrpc;
import io.example.HelloReply;
import io.example.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HelloClient {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;
    
    public static void main(String[] args) {
        
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext(true).build();
        
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(managedChannel);
        
        HelloRequest helloRequest = HelloRequest.newBuilder().setName("Raj").build();
        
        System.out.println("Sending Request");
        
        HelloReply helloReply = stub.sayHello(helloRequest);
        
        System.out.println("Response Received \t:"+helloReply.getMessage());
        
        managedChannel.shutdown();
    }
}
