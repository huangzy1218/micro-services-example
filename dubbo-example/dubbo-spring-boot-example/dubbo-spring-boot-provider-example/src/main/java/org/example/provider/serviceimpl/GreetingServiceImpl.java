package org.example.provider.serviceimpl;

import org.example.GreetingService;

/**
 * @author Huang Z.Y.
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
