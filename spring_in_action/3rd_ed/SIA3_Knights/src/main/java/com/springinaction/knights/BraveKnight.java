package com.springinaction.knights;

public class BraveKnight {
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}
