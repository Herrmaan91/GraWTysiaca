package pl.com;

public enum Suit {
    CLUB("ŻOŁĄDŹ"),
    SPADE("PIK"),
    HEART("CZERWO"),
    DIAMOND("DZWONEK");

    private String plSuit;

    Suit(String plSuit) {
        this.plSuit = plSuit;
    }
}
