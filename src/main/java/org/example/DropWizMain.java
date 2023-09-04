package org.example;


import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class DropWizMain extends Application<DropWizConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropWizMain().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<DropWizConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(DropWizConfiguration configuration, Environment environment) {
        // nothing to do yet
        dropwizResource resource = new dropwizResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }
}
