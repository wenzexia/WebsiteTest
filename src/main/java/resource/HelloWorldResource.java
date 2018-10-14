package resource;


import com.codahale.metrics.annotation.Timed;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Api("/hello-world")
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private final String template;
    private final String defaultName;
    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
    }


    @GET
    @Timed
    @Path("/users")
    @ApiOperation(value = "Get github user profile.", notes = "There should be the note.")
    @ApiResponses({
            @ApiResponse(code = 401, message = "Valid credentials are required to access this resource."),
            @ApiResponse(code = 400, message = "Params not valid."),
            @ApiResponse(code = 500, message = "Something wrong from the server.")
    })
        public String sayHello(@QueryParam("username") String username) {
        return username;
    }

}
