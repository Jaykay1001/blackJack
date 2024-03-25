package blackJack;

import java.util.Random;

public class Card {
  private CardNum num;
  private String color;
  private CardNum[] Deck = {
    CardNum.ACE,
    CardNum.TWO,
    CardNum.THREE,
    CardNum.FOUR,
    CardNum.FIVE,
    CardNum.SIX,
    CardNum.SEVEN,
    CardNum.EIGHT,
    CardNum.NINE,
    CardNum.TEN,
    CardNum.JACK,
    CardNum.QUEEN,
    CardNum.KING
  };
  private String[] colors = {
    "hearts",
    "diamonds",
    "clubs",
    "spades"
  };

  public Card() {
    Random rand = new Random();
    int r = rand.nextInt(13);
    this.num = Deck[r];

    r = rand.nextInt(4);
    this.color = colors[r];
  }

  public String cardToString() {
    String c = this.getName() + " fo " + this.getColor();
    String s = " ";
    String p = String.valueOf(this.getVal());
  
    int l = 18 - c.length();
    int i = 0;

    if (this.getVal() > 9) { 
      i = 1;
    }

    for (;i <= l; i++) {
      s = s + " ";
    } 
    
    return c + s + p;
  }
    
  public String getColor() {
    return color;
  }

  public CardNum getNum() {
    return num;
  }

  public int getVal() {
    return this.num.getVal();
  }

  public String getName() {
    return this.num.getName();
  }
}