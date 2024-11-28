package com.tsc.msscbeerclient;

import com.tsc.msscbeerclient.web.client.BreweryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({BreweryClient.class})
public class MsscBeerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerClientApplication.class, args);
    }

}
