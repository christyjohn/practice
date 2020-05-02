package com.springinaction.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class MinstrelTest {
	@Test
	public void minstrelShoulSingBeforeQuest()	{
		Minstrel minstrel = new Minstrel();
		minstrel.singBeforeQuest();
	}
	
	@Test
	public void minstrelShoulSingAfterQuest()	{
		Minstrel minstrel = new Minstrel();
		minstrel.singAfterQuest();
	}
}
