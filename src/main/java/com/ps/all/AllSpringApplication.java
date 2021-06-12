package com.ps.all;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AllSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello from spring boot command line runner!!!!");
		if(args.length>0)
		for(int i =0; i<=args.length;i++)System.out.println(args[i]);
		
	}

}
