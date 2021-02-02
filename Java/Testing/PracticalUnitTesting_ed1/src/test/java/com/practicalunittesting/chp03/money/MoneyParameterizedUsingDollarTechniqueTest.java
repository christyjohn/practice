package com.practicalunittesting.chp03.money;

import static org.junit.Assert.assertEquals;
import static junitparams.JUnitParamsRunner.$;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedUsingDollarTechniqueTest {
	
	private static final Object[] getMoney() {
		return $(
			$(10, "USD"),
			$(20, "EUR")
		);
	}
	
	@Test
	@Parameters(method = "getMoney")
	public void constructorShouldSetAmountAndCurrency(
			int amount, String currency) {
		Money money = new Money(amount, currency);
		
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
}
