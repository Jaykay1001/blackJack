package blackJack;

public enum CardNum {
  KING(10, "King"),
  QUEEN(10, "Queen"),
  JACK(10, "Jack"),
  TEN(10, "Ten"),
  NINE(9, "Nine"),
  EIGHT(8, "Eight"),
  SEVEN(7, "Seven"),
  SIX(6, "Six"),
  FIVE(5, "Five"),
  FOUR(4, "Four"),
  THREE(3, "Three"),
  TWO(2, "Two"),
  ACE(10, "Ace");

  private int val;
  private String name;

  private CardNum(int val, String name) {
    this.val = val;
    this.name = name;
  }

  public int getVal() {
    return this.val;
  }

  public String getName() {
    return this.name;
  }
}
