package com.example.restfull_ebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RestfullEbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullEbookApplication.class, args);
	}

}
