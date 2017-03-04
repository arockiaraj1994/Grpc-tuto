package io.example;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.1.2)",
    comments = "Source: hello.proto")
public class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.example.HelloRequest,
      io.example.HelloReply> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Greeter", "SayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.example.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.example.HelloReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService, Greeter {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    @java.lang.Override
    public void sayHello(io.example.HelloRequest request,
        io.grpc.stub.StreamObserver<io.example.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                io.example.HelloRequest,
                io.example.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub>
      implements Greeter {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    @java.lang.Override
    public void sayHello(io.example.HelloRequest request,
        io.grpc.stub.StreamObserver<io.example.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub>
      implements GreeterBlockingClient {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    @java.lang.Override
    public io.example.HelloReply sayHello(io.example.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub>
      implements GreeterFutureClient {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.example.HelloReply> sayHello(
        io.example.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  /**
   * This will be removed in the next release.
   * If your code has been using gRPC-java v0.15.0 or higher already,
   * the following changes to your code are suggested:
   * <ul>
   *   <li> replace {@code extends/implements Greeter} with {@code extends GreeterImplBase} for server side;</li>
   *   <li> replace {@code Greeter} with {@code GreeterStub} for client side;</li>
   *   <li> replace usage of {@code Greeter} with {@code GreeterImplBase};</li>
   *   <li> replace usage of {@code AbstractGreeter} with {@link GreeterImplBase};</li>
   *   <li> replace {@code serverBuilder.addService(GreeterGrpc.bindService(serviceImpl))}
   *        with {@code serverBuilder.addService(serviceImpl)};</li>
   *   <li> if you are mocking stubs using mockito, please do not mock them.
   *        See the documentation on testing with gRPC-java;</li>
   *   <li> replace {@code GreeterBlockingClient} with {@link GreeterBlockingStub};</li>
   *   <li> replace {@code GreeterFutureClient} with {@link GreeterFutureStub}.</li>
   * </ul>
   */
  @java.lang.Deprecated public static interface Greeter {

    public void sayHello(io.example.HelloRequest request,
        io.grpc.stub.StreamObserver<io.example.HelloReply> responseObserver);
  }

  /**
   * This will be removed in the next release.
   * If your code has been using gRPC-java v0.15.0 or higher already,
   * the following changes to your code are suggested:
   * <ul>
   *   <li> replace {@code extends/implements Greeter} with {@code extends GreeterImplBase} for server side;</li>
   *   <li> replace {@code Greeter} with {@code GreeterStub} for client side;</li>
   *   <li> replace usage of {@code Greeter} with {@code GreeterImplBase};</li>
   *   <li> replace usage of {@code AbstractGreeter} with {@link GreeterImplBase};</li>
   *   <li> replace {@code serverBuilder.addService(GreeterGrpc.bindService(serviceImpl))}
   *        with {@code serverBuilder.addService(serviceImpl)};</li>
   *   <li> if you are mocking stubs using mockito, please do not mock them.
   *        See the documentation on testing with gRPC-java;</li>
   *   <li> replace {@code GreeterBlockingClient} with {@link GreeterBlockingStub};</li>
   *   <li> replace {@code GreeterFutureClient} with {@link GreeterFutureStub}.</li>
   * </ul>
   */
  @java.lang.Deprecated public static interface GreeterBlockingClient {

    public io.example.HelloReply sayHello(io.example.HelloRequest request);
  }

  /**
   * This will be removed in the next release.
   * If your code has been using gRPC-java v0.15.0 or higher already,
   * the following changes to your code are suggested:
   * <ul>
   *   <li> replace {@code extends/implements Greeter} with {@code extends GreeterImplBase} for server side;</li>
   *   <li> replace {@code Greeter} with {@code GreeterStub} for client side;</li>
   *   <li> replace usage of {@code Greeter} with {@code GreeterImplBase};</li>
   *   <li> replace usage of {@code AbstractGreeter} with {@link GreeterImplBase};</li>
   *   <li> replace {@code serverBuilder.addService(GreeterGrpc.bindService(serviceImpl))}
   *        with {@code serverBuilder.addService(serviceImpl)};</li>
   *   <li> if you are mocking stubs using mockito, please do not mock them.
   *        See the documentation on testing with gRPC-java;</li>
   *   <li> replace {@code GreeterBlockingClient} with {@link GreeterBlockingStub};</li>
   *   <li> replace {@code GreeterFutureClient} with {@link GreeterFutureStub}.</li>
   * </ul>
   */
  @java.lang.Deprecated public static interface GreeterFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.example.HelloReply> sayHello(
        io.example.HelloRequest request);
  }

  /**
   * This will be removed in the next release.
   * If your code has been using gRPC-java v0.15.0 or higher already,
   * the following changes to your code are suggested:
   * <ul>
   *   <li> replace {@code extends/implements Greeter} with {@code extends GreeterImplBase} for server side;</li>
   *   <li> replace {@code Greeter} with {@code GreeterStub} for client side;</li>
   *   <li> replace usage of {@code Greeter} with {@code GreeterImplBase};</li>
   *   <li> replace usage of {@code AbstractGreeter} with {@link GreeterImplBase};</li>
   *   <li> replace {@code serverBuilder.addService(GreeterGrpc.bindService(serviceImpl))}
   *        with {@code serverBuilder.addService(serviceImpl)};</li>
   *   <li> if you are mocking stubs using mockito, please do not mock them.
   *        See the documentation on testing with gRPC-java;</li>
   *   <li> replace {@code GreeterBlockingClient} with {@link GreeterBlockingStub};</li>
   *   <li> replace {@code GreeterFutureClient} with {@link GreeterFutureStub}.</li>
   * </ul>
   */
  @java.lang.Deprecated public static abstract class AbstractGreeter extends GreeterImplBase {}

  /**
   * This will be removed in the next release.
   * If your code has been using gRPC-java v0.15.0 or higher already,
   * the following changes to your code are suggested:
   * <ul>
   *   <li> replace {@code extends/implements Greeter} with {@code extends GreeterImplBase} for server side;</li>
   *   <li> replace {@code Greeter} with {@code GreeterStub} for client side;</li>
   *   <li> replace usage of {@code Greeter} with {@code GreeterImplBase};</li>
   *   <li> replace usage of {@code AbstractGreeter} with {@link GreeterImplBase};</li>
   *   <li> replace {@code serverBuilder.addService(GreeterGrpc.bindService(serviceImpl))}
   *        with {@code serverBuilder.addService(serviceImpl)};</li>
   *   <li> if you are mocking stubs using mockito, please do not mock them.
   *        See the documentation on testing with gRPC-java;</li>
   *   <li> replace {@code GreeterBlockingClient} with {@link GreeterBlockingStub};</li>
   *   <li> replace {@code GreeterFutureClient} with {@link GreeterFutureStub}.</li>
   * </ul>
   */
  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(final Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SAY_HELLO,
          asyncUnaryCall(
            new MethodHandlers<
              io.example.HelloRequest,
              io.example.HelloReply>(
                serviceImpl, METHODID_SAY_HELLO)))
        .build();
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Greeter serviceImpl;
    private final int methodId;

    public MethodHandlers(Greeter serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.example.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.example.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class GreeterDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.example.HelloWorldProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterDescriptorSupplier())
              .addMethod(METHOD_SAY_HELLO)
              .build();
        }
      }
    }
    return result;
  }
}
