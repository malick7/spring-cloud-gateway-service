Gateway Service
HelloService
Goodbye Service


We need discovery service
import that too

Start all services as Run as Spring boot app

Start discovery service
Gateway service, when starting this
you'll get 8080 already in use, coz - config-client-app was running, so stop it and run again

then start helloService and goodbye service 
http://localhost:8080/hello
http://localhost:8080/goodbye

Here the gateway service looked up with a Service named hello/goodbye from the service discovery server
and then proxied the traffic to that Service and then proxied the response back to the browser  

ZuulIfilter
Add new filter

And mark the main application class as @Configuration and 
@Bean with method returning the filter

Output -> Hello from India !!
