package com.sujata.component;

import java.util.Set;

public class Singer implements Performer {

	private Set<String> songs;

	public Singer() {

	}

	public Singer(Set<String> songs) {
		super();
		this.songs = songs;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing : ");
		
		songs.stream().forEach(System.out::println);
		

	}

	public void setSongs(Set<String> songs) {
		this.songs = songs;
	}

}
