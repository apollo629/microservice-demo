package us.apollo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alpereninal on 13/06/17.
 */
@FeignClient("service-2")
public interface Service2Client{

    @RequestMapping("/status")
    String status();


}
