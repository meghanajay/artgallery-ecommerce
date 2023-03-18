package com.webapp.springboot.myartgallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.webapp.springboot.myartgallery")
public class MyartgalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyartgalleryApplication.class, args);
	}

}
