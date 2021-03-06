package com.springinaction.springidol;

public class Instrumentalist implements Performer {
	private Instrument instrument;

	public Instrumentalist() {
	}

	public Instrumentalist(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void perform() throws PerformanceException {
		instrument.play();
	}

}
