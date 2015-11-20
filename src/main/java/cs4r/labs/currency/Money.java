package cs4r.labs.currency;

public class Money {
	protected int amount;

	@Override
	public boolean equals(Object other) {
		Money money = (Money) other;
		return this.amount == money.amount;
	}
}
