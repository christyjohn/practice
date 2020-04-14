package com.springinaction.springidol;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
	@Inject
	private Instrument instrument;
	
	public Instrumentalist() {
	}
	
	public Instrumentalist(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void perform() throws PerformanceException {
		instrument.play();
	}

}
