package com.springinaction.springidol;

import org.springframework.stereotype.Component;

public class Guitar implements Instrument {
	public void play() {
		System.out.println("STRUM STRUM STRUM");
	}
}
