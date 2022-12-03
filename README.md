# Spring Boot :bust_in_silhouette: Profiles

## About Spring Boot and this example

[Spring Boot](https://spring.io/projects/spring-boot) allows you to create stand-alone Spring applications by embedding an application server.

It provides production-ready features like metrics or health-checks and simplifies the build configuration overall.

In this example you can check how to configure Spring Boot profiles which will allow you to configure your application depending on the environment/profile. 

## Technical requirements

The only requirement is that you have a running Spring Boot application. If you need some help at setting it up you can check how  [in this example](https://github.com/codewithhades/spring-boot-basic-setup).

## How to configure Spring Boot profiles

If not specified Spring Boot will start with a _default_ profile but you can override this by passing a new profile (or profiles) upon starting the application with java

````bash
java -jar target/spring-boot-profiles.jar --spring.profiles.active=local
````
or the Spring Boot maven plugin
````bash
mvn spring-boot:run -Dspring-boot.run.profiles=local
````

By passing a profile (or profiles) we will tell Spring Boot to load an _application-{profile}.properties_ on top of the default [application.properties](src/main/resources/application.properties).
This means that you can override properties as you see fit depending on the profile.

For instance by running this example with the profile _local_ you will inherit the properties from [application.properties](src/main/resources/application.properties) and load the ones in [application-local.properties](src/main/resources/application-local.properties) (which overrides in case of duplication)

You check this behaviour by running the application with the _local_ profile and browsing on port 8081 [localhost:8081/app/api/profile](http://localhost:8081/app/api/profile)

And finally, you can also use profiles in a Spring Boot test such as [ProfileConfigurationTest.java](src/test/java/com/codewithhades/springboot/profiles/ProfileConfigurationTest.java) by using the annotation 
````java
@ActiveProfiles("test")
````
which will attempt to load [application-test.properties](src/test/resources/application-test.properties) where you can override properties for tests as you see fit.

## And before you go...

:pray: I hope you find this example useful and if you want to support me in my mission to help our fellow Java developers please consider starring and sponsoring this space!

:coffee: May Java be with you!