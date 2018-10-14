package test.xia;

import com.xia.configuration.SwitchableSwaggerBundle;
import com.xia.configuration.SystemConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resource.HelloWorldResource;

/**
 * Hello world!
 *
 */
public class App extends Application<SystemConfiguration>
{
    public static void main( String[] args ) throws Exception {
        new App().run(args);
        System.out.println( "Hello World!" );
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<SystemConfiguration> bootstrap) {
        // nothing to do yet
        bootstrap.addBundle(new SwitchableSwaggerBundle());
    }

    @Override
    public void run(SystemConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName() );
        environment.jersey().register(resource);//environment环境类添加到Jersey服务器中
    }
}
