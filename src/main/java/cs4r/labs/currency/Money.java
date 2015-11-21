package cs4r.labs.currency;

class Money implements Expression {
	protected int amount;
	protected String currency;

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	String currency() {
		return currency;
	}

	@Override
	public boolean equals(Object other) {
		Money money = (Money) other;
		return this.amount == money.amount && currency().equals(money.currency());
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

	public Expression plus(Expression added) {
		return new Sum(this, added);
	}

	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}

}
