package com.ebenezerdiaz.cmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.ebenezerdiaz.cmc")
public class CmcExamenApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CmcExamenApplication.class);
	}

	public static void main(String[] args) {
		//SpringApplication.run(CmcExamenApplication.class, args);

		SpringApplication application = new SpringApplication(CmcExamenApplication.class);
		// ... customize application settings here
		application.run(args);

//		SpringApplication.run(CmcExamenApplication.class);
	}

}
