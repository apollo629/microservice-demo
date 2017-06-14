package us.apollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alpereninal on 13/06/17.
 */

@RestController
public class Service2Controller {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/status")
    public String status(){
        return "Service2 is running on port:" + port;
    }

}
