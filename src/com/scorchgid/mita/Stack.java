package com.scorchgid.mita;

import java.util.ArrayList;
import java.util.Collections;

public class Stack {
    private ArrayList<Card> cardArray = new ArrayList<>();

    public Stack(String option) {
        if (option == "deck") {
            createNewDeck();
            shuffle();
        }
    }

    public ArrayList<Card> getCardArray() {
        return cardArray;
    }

    public void setCardArray(ArrayList<Card> cardArray) {
        this.cardArray = cardArray;
    }

    public void add(Card card) {
        this.cardArray.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cardArray);
    }

    void createNewDeck() {
        for (Enum.Suit suit : Enum.Suit.values()) {
            for (Enum.Rank rank : Enum.Rank.values()) {
                add(new Card(suit, rank));
            }
        }
    }
}
