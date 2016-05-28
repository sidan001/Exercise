/**
 * @Description: TODO
 */
package com.exercise.deckOfCards;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月20日 下午3:47:19
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class DisplayDeck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
			for (int rank = Card.ACE; rank <= Card.KING; rank++) {
				Card card = deck.getCard(suit, rank);
				System.out.format("%s of %s%n",
						card.rankToString(card.getRank()),
						card.suitToString(card.getSuit()));
			}
		}
	}
}
