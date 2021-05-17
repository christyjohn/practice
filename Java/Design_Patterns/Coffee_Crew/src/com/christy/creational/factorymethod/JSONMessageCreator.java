package com.christy.creational.factorymethod;

import com.christy.creational.factorymethod.message.JSONMessage;
import com.christy.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		return new JSONMessage();
	}

}
