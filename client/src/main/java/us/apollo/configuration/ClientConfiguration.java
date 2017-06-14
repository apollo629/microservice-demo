package us.apollo.configuration;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alpereninal on 13/06/17.
 */
@Configuration
@EnableFeignClients("us.apollo.client")
public class ClientConfiguration {

}
