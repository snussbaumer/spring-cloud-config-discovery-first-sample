# spring-cloud-config-discovery-first-sample

This is a sample to demonstrate an application that gets its configuration from a config server that has been found with
an eureka server. 

It's described in the documentation here : https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#discovery-first-bootstrap

to make it work 
 - go to the `config-server` folder and type `mvn spring-boot:run`. This will start the config server
 - go to the `eureka-server` folder and type `mvn spring-boot:run`. This will start the eureka server. After a short while 
   you should see both services in http://localhost:8002/
 - go to the `application` folder type `mvn spring-boot:run`. This will start a command line application. In the logs you
   should see "My property : hello world". This demonstrates that everything worked.

For the time being this does not work with spring boot 3 => the application does not even start, it tries to connect to
the default configserver uri : http://localhoost:8888, the discovery did not work.

If you switch from `import: "configserver:"  to `import: "configserver:http://127.0.0.1:8001" in the application's application.yml 
then it works, but once again, we did not go through the discovery ...
