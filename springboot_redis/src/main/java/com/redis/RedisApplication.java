package com.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 */
@SpringBootApplication
@RestController
public class RedisApplication {


    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format = simpleDateFormat.format(new Date());

        return format+"  "+"springboot redis";
    }

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }
}
