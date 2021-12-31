package com.fui.fuistore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

// 加了这段会报错：Consider defining a bean of type 'com.fui.fuistore.repository.BannerRepository' in your configuration.
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class FuiStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuiStoreApplication.class, args);
	}

}
