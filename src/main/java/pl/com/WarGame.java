package pl.com;

import java.util.ArrayList;

public class WarGame {
    public static void main(String[] args) {

        //TWORZĘ LISTĘ WSZYSTKICH KART
        ArrayList<Card> cardsArray = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cardsArray.add(new Card(suit, rank));
            }
        }

        //ROZDAJĘ KARTY UŻYTKOWNIKOM
        ArrayList[] cardsArrays = Dealer.dealCards(cardsArray);
        Player p1 = new Player(cardsArrays[0]);
        Player p2 = new Player(cardsArrays[1]);

        WarGame.war(p1, p2);
    }

    static void war(Player p1, Player p2) {

        int i = 0;
        int j = 0;

        while (!(p1.cards.size() == 0) && !(p2.cards.size() == 0)) {


            boolean check = true;
            ArrayList<Card> toAddArrayP1 = new ArrayList<>();
            ArrayList<Card> toAddArrayP2 = new ArrayList<>();

            while (check) {

                Card c1 = (Card) p1.cards.get(i);
                Card c2 = (Card) p2.cards.get(j);

                if (c1.getCardRank() > c2.getCardRank()) {
                    p2.cards.add(j, c1);
                    if (j + 1 < p2.cards.size()) j++;
                    p1.cards.remove(c1);
                    if (toAddArrayP1.size() != 0 && toAddArrayP2.size() != 0) {
                        for (Card card : toAddArrayP1) {
                            p2.cards.add(card);
                            p1.cards.remove(card);
                        }
                        toAddArrayP1.clear();
                        toAddArrayP2.clear();
                    }
                    if (j < p2.cards.size()){}
                    check = false;
                }

                if (c1.getCardRank() < c2.getCardRank()) {
                    p1.cards.add(i, c2);
                    if (i + 1 < p1.cards.size()) i++;
                    p2.cards.remove(c2);
                    if (toAddArrayP1.size() != 0 && toAddArrayP2.size() != 0) {
                        for (Card card : toAddArrayP2) {
                            p1.cards.add(card);
                            p2.cards.remove(card);
                        }
                        toAddArrayP1.clear();
                        toAddArrayP2.clear();
                    }
                    check = false;
                }

                if (c1.getCardRank() == c2.getCardRank()) {

                    toAddArrayP1.add(c1);
                    toAddArrayP2.add(c2);
                }
            }

            if (i == p1.cards.size()) i = 0;
            if (j == p2.cards.size()) j = 0;

            i++;
            j++;
        }
        if (p1.cards.size() == 0) System.out.println("Wygrał gracz nr 1!");
        if (p2.cards.size() == 0) System.out.println("Wygrał gracz nr 2!");
    }
}
