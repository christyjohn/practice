package com.springinaction.springidol;

import java.util.Map;

public class OneManBand implements Performer {
	public OneManBand() {
	}
	
	public void perform() throws PerformanceException {
		/*for (Instrument instrument : instruments) {
			instrument.play();
		}*/
		for (String key : ( instruments).keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}
	
	private Map<String, Instrument> instruments;
	
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	public String performForTest() throws PerformanceException {
		return null;
	}
	
	
}
