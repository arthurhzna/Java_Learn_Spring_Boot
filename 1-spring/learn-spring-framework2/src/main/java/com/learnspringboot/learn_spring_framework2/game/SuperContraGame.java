package com.learnspringboot.learn_spring_framework2.game;


import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier
public class SuperContraGame implements GamingConsole{

	public void up() {
		System.out.println("up");
	}

	public void down() {
		System.out.println("Sit down");
	}
	
	public void left() {
		System.out.println("Go back");
	}

	public void right() {
		System.out.println("Shoot a bullet");
	}

}
