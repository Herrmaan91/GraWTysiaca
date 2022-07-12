package pl.com;

import java.util.ArrayList;
import java.util.Random;

public class Dealer {

    static ArrayList[] dealCards(ArrayList<Card> cardsArray){
        Random r = new Random();
        ArrayList[] cardsArrays = new ArrayList[2];
        cardsArrays[0] = new ArrayList<Card>();
        cardsArrays[1] = new ArrayList<Card>();
        int i = 0;
        while(cardsArray.size() != 0) {
        int index = r.nextInt(cardsArray.size());
        Card selectedCard = cardsArray.get(index);
        cardsArray.remove(index);

        cardsArrays[i].add(selectedCard);
        if (i == 0) i = 1;
        else if (i == 1) i = 0;
        }
        return cardsArrays;
    }
}


