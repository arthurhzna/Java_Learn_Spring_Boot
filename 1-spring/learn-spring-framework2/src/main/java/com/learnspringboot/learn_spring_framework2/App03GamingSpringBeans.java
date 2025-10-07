package com.learnspringboot.learn_spring_framework2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspringboot.learn_spring_framework2.game.GameRunner;
import com.learnspringboot.learn_spring_framework2.game.GamingConsole;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import com.learnspringboot.learn_spring_framework2.game.PacmanGame;


@Configuration
@ComponentScan("com.learnspringboot.learn_spring_framework2.game")
public class App03GamingSpringBeans {

	// @Bean
	// public GamingConsole game1() {
	// 	var game = new PacmanGame();
	// 	return game;
	// }

	// @Bean
	// public GameRunner gameRunner(GamingConsole game1) {
	// 	System.out.println(game1);
	// 	var gameRunner = new GameRunner(game1);
	// 	return gameRunner;
	// }

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(App03GamingSpringBeans.class)) {

			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}
