package cs4r.labs.currency;

interface Expression {

	Money reduce(Bank bank, String to);

}
