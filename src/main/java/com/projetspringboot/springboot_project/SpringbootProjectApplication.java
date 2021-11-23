package com.projetspringboot.springboot_project;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootProjectApplication extends ServletInitializer {
        @Override
        public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
                return application.sources(SpringbootProjectApplication.class);
        }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

}
