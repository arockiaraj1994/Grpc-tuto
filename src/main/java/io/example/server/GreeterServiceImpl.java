package io.example.server;

import io.example.GreeterGrpc;
import io.example.HelloReply;
import io.example.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterServiceImpl extends GreeterGrpc.GreeterImplBase {

    @java.lang.Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println(request);

        String greeting = "Hello " + request.getName();

        HelloReply helloReply = HelloReply.newBuilder().setMessage(greeting).build();

        responseObserver.onNext(helloReply);
        responseObserver.onCompleted();
    }
    
}
