package cn.tarsknock.helloboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("cn.tarsknock.helloboot.dao")
@SpringBootApplication
public class  HelloBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }
}
