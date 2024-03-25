package blackJack;

import java.util.*;

public class Player {

  private List<Card> deck = new ArrayList<>();
  private int points;
  private int aceCounter;

  public Player() {
    points = 0;
    aceCounter = 0;
  }

  public List<String> printDeck() {
    List<String> r = new ArrayList<>(); 
    for (Card card : deck) {
      r.add(card.cardToString());
    }
    return r;
    }

  public void addCard() {
    Card nCard = new Card();
    if (nCard.getNum() == CardNum.ACE) {
      this.aceCounter ++;
    }
    points += nCard.getVal();

    deck.add(nCard);

  }

  public int getPoints() {
    return this.points;
  }

  public int getAceCounter() {
    return this.aceCounter;
  }
}
