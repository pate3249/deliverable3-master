package javagroupassignment;

import java.util.ArrayList;

public class CardImplement extends Card implements Comparable<CardImplement> {

	public enum cardSuit {
		Hearts, Diamonds, Spades, Clubs,
	}

	public enum cardVal {
		One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace,
	}

	private cardSuit suit;
	private cardVal value;
	private int rank;
	private static ArrayList<CardImplement> cardsDeckOne = new ArrayList<CardImplement>();
	private static ArrayList<CardImplement> cardsDeckTwo = new ArrayList<CardImplement>();

	public CardImplement(cardSuit suit, cardVal cardVal, int rank) {
		this.suit = suit;
		this.value = cardVal;
		this.rank = rank;
	}

	 static ArrayList<CardImplement> createStackOne() {
		for (int i = 1; i < 15; i++) {
			switch (i) {
			case 1:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckOne.add(new CardImplement(cardSuit.Hearts, cardVal, i++));
				}
				i = 1;
			case 15:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckOne.add(new CardImplement(cardSuit.Diamonds, cardVal, i++));
				}
				i = 1;
			case 30:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckOne.add(new CardImplement(cardSuit.Clubs, cardVal, i++));
				}
				i = 1;
			case 45:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckOne.add(new CardImplement(cardSuit.Spades, cardVal, i++));
				}
				i = 1;

			}

		}
		return cardsDeckOne;

	}

	static ArrayList<CardImplement> createStackTwo() {
		for (int i = 1; i < 15; i++) {
			switch (i) {
			case 1:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckTwo.add(new CardImplement(cardSuit.Hearts, cardVal, i++));
				}
				i = 1;
			case 15:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckTwo.add(new CardImplement(cardSuit.Diamonds, cardVal, i++));
				}
				i = 1;
			case 30:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckTwo.add(new CardImplement(cardSuit.Clubs, cardVal, i++));
				}
				i = 1;
			case 45:
				for (cardVal cardVal : cardVal.values()) {
					cardsDeckTwo.add(new CardImplement(cardSuit.Spades, cardVal, i++));
				}
				i = 1;

			}

		}
		return cardsDeckTwo;

	}


	@Override
	public String toString() {
		return "CardImplement{" + "suit=" + suit + ", cardVal=" + value + ", rank=" + rank + '}';
	}

	
	public int compareTo(CardImplement opponentCardRank) {
		if (this.rank > opponentCardRank.rank) {
			return -1;
		}
		if (this.rank < opponentCardRank.rank) {
			return 1;
		} else {
			return 0;
		}
	}
}
