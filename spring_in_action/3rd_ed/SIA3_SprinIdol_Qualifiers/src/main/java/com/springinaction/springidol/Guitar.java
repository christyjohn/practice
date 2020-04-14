package com.springinaction.springidol;

@StringedInstrument
@Strummed
public class Guitar implements Instrument {
	public void play() {
		System.out.println("STRUM STRUM STRUM");
	}
}
