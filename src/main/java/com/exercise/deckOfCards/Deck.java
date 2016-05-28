/**
 * @Description: TODO
 */
package com.exercise.deckOfCards;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月20日 下午3:44:59
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class Deck {
	public static int numSuits = 4;
	public static int numRanks = 13;
	public static int numCards = numSuits * numRanks;

	private Card[][] cards;

	public Deck() {
		cards = new Card[numSuits][numRanks];
		for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
			for (int rank = Card.ACE; rank <= Card.KING; rank++) {
				cards[suit - 1][rank - 1] = new Card(rank, suit);
			}
		}
	}

	public Card getCard(int suit, int rank) {
		return cards[suit - 1][rank - 1];
	}
}
