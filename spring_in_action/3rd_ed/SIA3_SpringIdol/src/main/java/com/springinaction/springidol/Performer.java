package com.springinaction.springidol;

public interface Performer {
	String performForTest() throws PerformanceException;
	void perform() throws PerformanceException;
}
