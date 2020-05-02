package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
	
	@Autowired
	private Instrument instrument;

	public Instrument getInstrument() {
		return instrument;
	}

	public void perform() throws PerformanceException {
		instrument.play();
	}
}
