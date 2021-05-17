package com.christy.creational.factorymethod;

import com.christy.creational.factorymethod.message.Message;
import com.christy.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		return new TextMessage();
	}

}
