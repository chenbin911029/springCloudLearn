package com.dxfx.pro_sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthServer {

	
	public static void main(String[] args) {
		SpringApplication.run(SleuthServer.class, args);
	}
}
