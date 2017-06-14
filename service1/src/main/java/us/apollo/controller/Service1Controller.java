package us.apollo.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.apollo.client.Service2Client;


/**
 * Created by alpereninal on 13/06/17.
 */

@RestController
public class Service1Controller {

    Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Value("${server.port}")
    private String port;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private Service2Client service2Client;

    @RequestMapping("/status")
    public String status(){
        String response = service2Client.status();
        logger.info(response);
        Application service2 = eurekaClient.getApplication("service-2");
        for (InstanceInfo info : service2.getInstances()){
            logger.info(info.getHomePageUrl());
        }
        return "Service1 is running on port:" + port;
    }

}
