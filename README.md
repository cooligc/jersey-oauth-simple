This bundle contains a simple Jersey based OAuth server endpoint. This application also contains a sample 
Web client called TestClient.java that uses the Jersey client-side oauth library. You should be able to just 
mvn jetty:run the server and the server will run on port 4080. Run the main() method in the client to see how 
it does it thing. Notice that the OAuth code is just a Jersey ContainerRequestFilter implementation and is
configured in the web.xml using init-params. If you comment out the init-param there's no authentication and 
you can simply access the resource at /simple/products.

This is not meant to be anything more than a simple skeleton that I plan to use for future projects that use
Jersey and need simple API security.