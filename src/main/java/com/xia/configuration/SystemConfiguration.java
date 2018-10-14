package com.xia.configuration;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.hibernate.validator.constraints.NotEmpty;



public class SystemConfiguration extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";


    public SwaggerBundleConfiguration getSwaggerBundleConfiguration() {
        return swaggerBundleConfiguration;
    }

    @JsonProperty("swagger")
    private SwaggerBundleConfiguration swaggerBundleConfiguration;

    @JsonProperty
    public String getTemplate() {        return template;    }
    @JsonProperty
    public void setTemplate(String template) {        this.template = template;    }
    @JsonProperty
    public String getDefaultName() {        return defaultName;    }
    @JsonProperty
    public void setDefaultName(String name) {        this.defaultName = name;    }


}
