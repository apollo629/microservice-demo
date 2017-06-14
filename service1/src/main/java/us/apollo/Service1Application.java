package us.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by alpereninal on 13/06/17.
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1Application {

    public static void main(String[] args){
        SpringApplication.run(Service1Application.class, args);
    }

}
