package com.example.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing  // 배치 기능 활성화
@SpringBootApplication
public class BatchApplication {

  public static void main(String[] args) {
    SpringApplication.run(BatchApplication.class, args);
  }
}
