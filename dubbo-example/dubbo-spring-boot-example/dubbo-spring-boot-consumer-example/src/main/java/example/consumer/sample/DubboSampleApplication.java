package example.consumer.sample;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.GreetingService;

/**
 * @author Huang Z.Y.
 */
public class DubboSampleApplication {

    private static final String ZOOKEEPER_ADDRESS = "zookeeper://39.107.235.5:2181";

    public static void main(String[] args) {
        // Define all subscriptions
        ReferenceConfig<GreetingService> reference = new ReferenceConfig<>();
        reference.setInterface(GreetingService.class);

        // Start dubbo
        DubboBootstrap.getInstance()
                .application("dubbo-consumer")
                .registry(new RegistryConfig(ZOOKEEPER_ADDRESS))
                .reference(reference).start();

        // Get the stubs you've subscribed to
        GreetingService service = reference.get();
        String message = service.sayHello("World");
        System.out.println(message);
    }

}
