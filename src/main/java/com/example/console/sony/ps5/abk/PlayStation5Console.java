package com.example.console.sony.ps5.abk;

import com.example.console.sony.ps5.abk.GameRunner.RunAGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PlayStation5Console {

	public static void main(String[] args) {

		try (var ConsoleContext = SpringApplication.run(PlayStation5Console.class, args)) {


			/*
			*  Udemy course used to run the programs using AnnotationConfigApplicationContext unlike SpringApplicationRun here
			*  So when we used to get all bean definitions, only the defined beans us
			* */

//			Arrays.stream(ConsoleContext.getBeanDefinitionNames())
//					.forEach(System.out::println);


			ConsoleContext.getBean(RunAGame.class).gamePlay();

		}


	}

}
