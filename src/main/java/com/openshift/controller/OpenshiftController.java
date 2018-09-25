package com.openshift.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OpenshiftController
{
    private static final Logger logger = LoggerFactory.getLogger(OpenshiftController.class);

    @RequestMapping("/get")
    public String index() {
        logger.info("In the index method info logger::::");
        logger.info("In the index method info Before logger::::");
        logger.debug("In the index method debug logger::::");
        return "Greetings from Spring Boot!";

    }


}
