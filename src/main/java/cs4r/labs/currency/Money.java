package cs4r.labs.currency;

abstract class Money {
	protected int amount;

	abstract Money times(int multiplier);

	static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	static Franc franc(int amount) {
		return new Franc(amount);
	}

	@Override
	public boolean equals(Object other) {
		Money money = (Money) other;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}

}
