package cs4r.labs.currency;

class Bank {

	Money reduce(Expression source, String to) {
		return source.reduce(to);
	}

}
