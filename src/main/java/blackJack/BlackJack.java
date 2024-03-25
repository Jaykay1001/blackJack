package blackJack;
import java.util.*;

public class BlackJack {
  
  public static void main(String[] args) {
    Player deiMam = new Player();
    deiMam.addCard();
    deiMam.addCard();
    deiMam.addCard();
    deiMam.addCard();

    List<String> l = deiMam.printDeck();
    for (String f : l) {
      System.out.println(f);
    }
    System.out.println(deiMam.getAceCounter());
    System.out.println(deiMam.getPoints());
  }  
}
