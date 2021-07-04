package design.pattern.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;//表示石头的值
    public static final int HANDVALUE_CHO = 1;//表示剪刀的值
    public static final int HANDVALUE_PAA = 2;//表示布的值
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };
    private static final String[] name = {
            "石头","剪刀","布"
    };
    private int handValue;
    private Hand(int handValue){
        this.handValue = handValue;
    }
    public static Hand getHand(int handValue){
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand hand){
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand){
        return fight(hand) == -1;
    }

    private int fight(Hand hand){
        if(this == hand){
            return 0;
        }else if((this.handValue + 1)%3 == hand.handValue){
            return 1;
        }else{
            return -1;
        }
    }
    public String toString(){
        return name[handValue];
    }


}
