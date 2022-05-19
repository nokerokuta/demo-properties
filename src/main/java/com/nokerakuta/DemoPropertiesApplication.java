package com.nokerakuta;

import com.nokerakuta.config.TestProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TestProperties.class)
public class DemoPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPropertiesApplication.class, args);
	}

}
