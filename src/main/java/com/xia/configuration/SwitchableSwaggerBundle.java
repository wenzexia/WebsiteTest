package com.xia.configuration;

import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class SwitchableSwaggerBundle extends SwaggerBundle<SystemConfiguration> {

    @Override
    protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(SystemConfiguration configuration) {
        return configuration.getSwaggerBundleConfiguration();
    }

    @Override
    public void run(SystemConfiguration configuration, Environment environment) throws Exception {
        super.run(configuration, environment);
    }

}
