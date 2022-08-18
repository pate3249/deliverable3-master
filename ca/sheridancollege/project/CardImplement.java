package ca.sheridancollege.project;

public class CardImplement extends Card {

	private int cardNum;
	final static String[] cardSuits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	final static String[] cardValue = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	CardImplement (int theCard) {
        setCardNum(theCard);
    }

	public void setCardNum(int theCard) {
		cardNum = (theCard >= 0 && theCard <= 51) ? theCard : 0;
	}

	public int getCardNum() {
		return cardNum;
	}

	public String getSuit() {
		return cardSuits[cardNum / 13];
	}

	public String getCardValue() {
		return cardValue[cardNum % 13];
	}

	public int getValue() {
		return cardNum % 13;
	}

	@Override
	public String toString() {
		return cardValue[cardNum % 13] + " of " + cardSuits[cardNum / 13];
	}

}
