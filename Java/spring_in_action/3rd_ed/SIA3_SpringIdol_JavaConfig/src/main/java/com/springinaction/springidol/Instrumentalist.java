package com.springinaction.springidol;

public class Instrumentalist implements Performer {
	private String song;
	private Instrument instrument;

	public Instrumentalist() {
	}

	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

}
