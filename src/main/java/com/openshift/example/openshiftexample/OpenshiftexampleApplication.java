package com.openshift.example.openshiftexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ={"com.openshift.controller"})
public class OpenshiftexampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(OpenshiftexampleApplication.class, args);
	}
}
