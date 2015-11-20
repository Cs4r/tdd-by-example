package cs4r.labs.currency;

abstract class Money {
	protected int amount;
	protected String currency;

	static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}


	abstract Money times(int multiplier);

	@Override
	public boolean equals(Object other) {
		Money money = (Money) other;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}

	String currency() {
		return currency;
	}

}
