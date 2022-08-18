package ca.sheridancollege.project;

public class CardDeck {
	private CardImplement[] deck = new CardImplement[52];
	private int topCard;

	CardDeck() {
		topCard = 0;
		for (int i = 0; i < deck.length; i++)
			deck[i] = new CardImplement(i);

	}

	public void shuffle() {
		GroupOfCards groupOfCards = new GroupOfCards(52);
		groupOfCards.shuffle();

	}

	public CardImplement dealCard() {
		CardImplement theCard;
		if (topCard < deck.length) {
			theCard = deck[topCard];
			topCard++;
		} else
			theCard = null;

		return theCard;
	}
}
