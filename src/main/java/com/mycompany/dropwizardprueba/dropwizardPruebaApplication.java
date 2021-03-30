package com.mycompany.dropwizardprueba;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import java.util.List;

public class dropwizardPruebaApplication extends Application<dropwizardPruebaConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizardPruebaApplication().run(args);
    }

    @Override
    public String getName() {
        return "cars";
    }

    @Override
    public void initialize(final Bootstrap<dropwizardPruebaConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizardPruebaConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(),configuration.getDefaultName());
        
        final CarsResource carsresource = new CarsResource(configuration.getCoches());
        
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
        environment.jersey().register(carsresource);
    }

}
