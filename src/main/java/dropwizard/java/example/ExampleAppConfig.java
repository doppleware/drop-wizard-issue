package dropwizard.java.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.hibernate.validator.constraints.NotEmpty;

public class ExampleAppConfig extends Configuration {
    private final SwaggerBundleConfiguration swagger = new SwaggerBundleConfiguration();

    @JsonProperty
    @NotEmpty
    public String appName = "appName";

    @JsonProperty("swagger")
    public SwaggerBundleConfiguration getSwagger() {
        swagger.setResourcePackage("dropwizard.java.example.resource");
        return swagger;
    }


    public String getAppName() {
        return appName;
    }
}
