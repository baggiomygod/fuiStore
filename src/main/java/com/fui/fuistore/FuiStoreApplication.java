package com.fui.fuistore;

import com.fui.fuistore.api.v1.BannerController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

// 加了这段会报错：Consider defining a bean of type 'com.fui.fuistore.repository.BannerRepository' in your configuration.
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = {"com.fui.fuistore"})
@MapperScan(basePackages = {"com.fui.fuistore.mapper"})
@RestController
public class FuiStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuiStoreApplication.class, args);
    }
//    Application.register(BannerController);

}

