package com.learnspringboot.learn_spring_framework2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspringboot.learn_spring_framework2.game.GameRunner;
import com.learnspringboot.learn_spring_framework2.game.GamingConsole;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspringboot.learn_spring_framework2.game.PacmanGame;

@Configuration
class GamingConfiguration {

	@Bean
	public GamingConsole game1() {
		var game = new PacmanGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game1) {
		var gameRunner = new GameRunner(game1);
		return gameRunner;
	}

}


public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}
