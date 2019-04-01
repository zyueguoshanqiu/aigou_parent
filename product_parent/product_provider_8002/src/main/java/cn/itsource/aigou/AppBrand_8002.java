package cn.itsource.aigou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.itsource.aigou.mapper")
public class AppBrand_8002 {
    public static void main(String[] args) {
        SpringApplication.run(AppBrand_8002.class);
        }
}
