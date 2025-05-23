class Card implements Comparable<Card>{

    String[] suits = new String[] {"Hearts", "Clubs", "Diamonds", "Spades"};
    private static final int suitsNum = 4;
    String[] names = new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final int cardsNum = 13;
    private static final int maxCards = 52;

    
    private String name;
    private String suit;

    public Card(String name, String suit){
        this.name = name;
        this.suit = suit;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSuit(){
        return this.suit;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    @Override
    public int compareTo(Card card){
        int thisCardValue = 0;
        int newCardValue = 0;
        for (int i = 0; i < suitsNum; i++){
            for (int j = 0; j < cardsNum; j++){
                if (this.name == names[j]
                    && this.suit == suits[i]){
                        thisCardValue = i*13 + j;
                        i = suitsNum;
                        j = cardsNum;
                    }
            }
        }

        for (int i = 0; i < suitsNum; i++){
            for (int j = 0; j < cardsNum; j++){
                if (card.suit == suits[i]
                    && card.name == names[j]){
                        newCardValue = i*13 + j;
                        i = suitsNum;
                        j = cardsNum;
                    }
            }
        }

        return thisCardValue - newCardValue;
    
    }


    public String toString(){
        return (name + " of " + suit);
    }


}
