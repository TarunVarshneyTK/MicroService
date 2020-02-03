package com.in28minutes.microservices.limitservice;

import com.in28minutes.microservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
    @Autowired
    Configuration configuration;
    @RequestMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfiguration()
    {
      return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
