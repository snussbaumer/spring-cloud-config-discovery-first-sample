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


