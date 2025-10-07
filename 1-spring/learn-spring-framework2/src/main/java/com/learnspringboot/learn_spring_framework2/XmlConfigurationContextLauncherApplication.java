package com.learnspringboot.learn_spring_framework2;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

// interface GamingConsole {
// 	void up();
// 	void down();
// 	void left();
// 	void right();
// }

// @Component
// class GameRunner {
	
// 	private GamingConsole game;
	
// 	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
// 		this.game = game;
// 	}

// 	public void run() {
		
// 		System.out.println("Running game: " + game);
// 		game.up();
// 		game.down();
// 		game.left();
// 		game.right();
		
// 	}

// }

import com.learnspringboot.learn_spring_framework2.game.GameRunner;

public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			// Arrays.stream(context.getBeanDefinitionNames())
			// 	.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();

		}
	}
}
