package cs4r.labs.currency;

class Dollar extends Money {

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Dollar.dollar(amount * multiplier);
	}

}
