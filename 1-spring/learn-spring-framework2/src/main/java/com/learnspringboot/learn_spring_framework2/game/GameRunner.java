package com.learnspringboot.learn_spring_framework2.game;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Qualifier;

//PacmanGame

@Component
public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(@Qualifier("superContraGame") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
