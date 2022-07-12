package pl.com;

import java.util.ArrayList;

public class Player {
    ArrayList cards;

    Player(ArrayList cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                '}';
    }
}
