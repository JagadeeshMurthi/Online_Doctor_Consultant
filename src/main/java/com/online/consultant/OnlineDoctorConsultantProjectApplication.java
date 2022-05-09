package com.online.consultant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class OnlineDoctorConsultantProjectApplication {

	//Main Class
	public static void main(String[] args) {
		SpringApplication.run(OnlineDoctorConsultantProjectApplication.class, args);
	}

}
