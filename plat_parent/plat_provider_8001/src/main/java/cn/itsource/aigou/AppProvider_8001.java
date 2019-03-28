package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(AppProvider_8001.class);
        }
}
