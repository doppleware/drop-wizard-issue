package dropwizard.java.example;

import dropwizard.java.example.filter.DiagnosticContextFilter;
import dropwizard.java.example.healthcheck.DefaultHealthCheck;
import dropwizard.java.example.resource.RootResource;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;


public class ExampleApp extends io.dropwizard.Application<ExampleAppConfig> {

    public static void main(String[] args) throws Exception {
        new ExampleApp().run(args);
    }
    @Override
    public void initialize(Bootstrap<ExampleAppConfig> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<ExampleAppConfig>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(ExampleAppConfig configuration) {
                return configuration.getSwagger();
            }
        });
    }



    @Override
    public void run(ExampleAppConfig exampleAppConfig, Environment environment) throws Exception {
        environment.jersey().register(new RootResource(exampleAppConfig.getAppName()));
        environment.jersey().register(new DiagnosticContextFilter());
        environment.healthChecks().register("default", new DefaultHealthCheck());
    }
}
