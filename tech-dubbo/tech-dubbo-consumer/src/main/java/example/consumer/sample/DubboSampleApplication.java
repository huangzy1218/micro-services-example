package example.consumer.sample;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.HelloService;

/**
 * @author Huang Z.Y.
 */
public class DubboSampleApplication {

    private static final String ZOOKEEPER_ADDRESS = "zookeeper://39.107.235.5:2181";

    public static void main(String[] args) {
        // Define all subscriptions
        ReferenceConfig<HelloService> reference = new ReferenceConfig<>();
        reference.setInterface(HelloService.class);
        reference.setGroup("test");
        reference.setVersion("1.0.0");

        // Start dubbo
        DubboBootstrap.getInstance()
                .application("dubbo-consumer")
                .registry(new RegistryConfig(ZOOKEEPER_ADDRESS))
                .reference(reference).start();

        // Get the stubs you've subscribed to
        HelloService service = reference.get();
        String message = service.sayHello("World");
        System.out.println(message);
    }

}
