package project.Games;


import java.util.ArrayList;
import java.util.Collections;


public class Deck{
    public   class card{
        private String card_name;
        public card(String card_name){
            this.card_name=card_name;
        }
        public String getCardName(){
            return card_name;
        }

        @Override
        public String toString() {
            return getCardName();
        }
    }

    private static Deck instance=null;
    private  ArrayList<card> arr;
    private Deck(){
        arr=new ArrayList<>();
        arr.add(new card("CLUB ACE"));
        arr.add(new card("CLUB 2"));
        arr.add(new card("CLUB 3"));
        arr.add(new card("CLUB 4"));
        arr.add(new card("CLUB 6"));
        arr.add(new card("CLUB 7"));
        arr.add(new card("CLUB 8"));
        arr.add(new card("CLUB 9"));
        arr.add(new card("CLUB 10"));
        arr.add(new card("CLUB JACK"));
        arr.add(new card("CLUB QUEEN"));
        arr.add(new card("CLUB KING"));
        arr.add(new card("DIAMONDE ACE"));
        arr.add(new card("DIAMONDE 2"));
        arr.add(new card("DIAMONDE 3"));
        arr.add(new card("DIAMONDE 4"));
        arr.add(new card("DIAMONDE 5"));
        arr.add(new card("DIAMONDE 6"));
        arr.add(new card("DIAMONDE 7"));
        arr.add(new card("DIAMONDE 8"));
        arr.add(new card("DIAMONDE 9"));
        arr.add(new card("DIAMONDE 10"));
        arr.add(new card("DIAMONDE JACK"));
        arr.add(new card("DIAMONDE QUEEN "));
        arr.add(new card("DIAMONDE KING"));
        arr.add(new card("HEART ACE"));
        arr.add(new card("HEART 2"));
        arr.add(new card("HEART 3"));
        arr.add(new card("HEART 4"));
        arr.add(new card("HEART 5"));
        arr.add(new card("HEART 6"));
        arr.add(new card("HEART 7"));
        arr.add(new card("HEART 8"));
        arr.add(new card("HEART 9"));
        arr.add(new card("HEART 10"));
        arr.add(new card("HEART JACK"));
        arr.add(new card("HEART QUEEN"));
        arr.add(new card("HEART KING"));
        arr.add(new card("SPADE ACE"));
        arr.add(new card("SPADE 2"));
        arr.add(new card("SPADE 3"));
        arr.add(new card("SPADE 4"));
        arr.add(new card("SPADE 5"));
        arr.add(new card("SPADE 6"));
        arr.add(new card("SPADE 7"));
        arr.add(new card("SPADE 8"));
        arr.add(new card("SPADE 9"));
        arr.add(new card("SPADE 10"));
        arr.add(new card("SPADE JACK"));
        arr.add(new card("SPADE QUEEN"));
        arr.add(new card("SPADE KING"));


    }
    public card[] pick(int numberOfCards){
        card[] cards=new card[numberOfCards];
        Collections.shuffle(arr);
        for (int i=0;i<numberOfCards;i++){
            cards[i]= arr.get(i);
        }
        return cards;
    }

    public static Deck getInstace() {
        if (instance == null)
            instance = new Deck();
        return instance;

    }

}
