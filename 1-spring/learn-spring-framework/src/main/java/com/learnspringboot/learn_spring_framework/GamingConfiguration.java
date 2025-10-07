package com.learnspringboot.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnspringboot.learn_spring_framework.game.GameRunner;
import com.learnspringboot.learn_spring_framework.game.GamingConsole;
import com.learnspringboot.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

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
