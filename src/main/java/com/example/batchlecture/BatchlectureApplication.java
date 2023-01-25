package com.example.batchlecture;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchlectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchlectureApplication.class, args);
	}

}
