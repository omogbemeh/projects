package com.omogbemeh.blackjack;

import com.omogbemeh.blackjack.enums.Rank;
import com.omogbemeh.blackjack.enums.Suit;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card.getRandomCard();
    }

    public static Card getRandomCard() {
        Suit suit = Suit.getRandomSuit();
        Rank rank = Rank.getRandomEnum();
        Card card = new Card(rank, suit);
        return card;
    }

    public int getRank() {
        return this.rank.value;
    }

    @Override
    public String toString() {
        if (rank.value == 1) {}
        String str = String.format("%s %s", rank.value, suit.value);
        return str;
    }
}
