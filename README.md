# gRPC spring boot microservice example

This is a simple example of a gRPC microservice using spring boot.

## System architecture
![image](./image/img.png)

## Add dependencies

Add gRPC server & client dependencies to project `pom.xml` file.

```xml
<dependencies>
    ...
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-services</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.grpc</groupId>
        <artifactId>spring-grpc-server-web-spring-boot-starter</artifactId>
    </dependency>
</dependencies>
```
