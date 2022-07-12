package pl.com;

public class Serwis {
    static void compareCards(Card c1, Card c2){
        if (c1.getCardRank() > c2.getCardRank())
            System.out.println("Wins the following card: " + c1.getCardRank());
        if (c1.getCardRank() < c2.getCardRank())
            System.out.println("Wins the following card: " + c2.getCardRank());
        if (c1.getCardRank() == c2.getCardRank())
            System.out.println("These cards have equals ranks");
    }
}
