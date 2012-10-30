
package org.bitxbit.jerseytest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/products")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!\n";
    }
    
    @GET
    @Produces("application/json")
    @Path("jsonproduct")
    public String getJson() {
        return "{\"a\":\"b\"}\n";
    }
}
