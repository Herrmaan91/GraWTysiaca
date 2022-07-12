package pl.com;

public class Card {
    private Suit suit;
    Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    int getCardRank()
    {
        return rank.getRank();
    }



    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
