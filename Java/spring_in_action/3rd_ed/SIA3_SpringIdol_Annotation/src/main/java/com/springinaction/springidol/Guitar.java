package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("guitar")
public class Guitar implements Instrument {
	public void play() {
		System.out.println("STRUM STRUM STRUM");
	}
}
