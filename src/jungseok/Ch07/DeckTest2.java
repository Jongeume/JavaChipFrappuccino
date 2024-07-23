package jungseok.Ch07;

public class DeckTest2 {
    public static void main(String[] args) {

        Deck1 d = new Deck1();
        Card1 c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck1 {

    final int CARD_NUM = 52;
    Card1[] cardArr = new Card1[CARD_NUM];

    Deck1() {

        int i = 0;
        for (int k = Card1.KIND_MAX; k > 0; --k)
            for (int n = 0; n < Card1.NUM_MAX; ++n)
                cardArr[i++] = new Card1(k, n + 1);
    }

    Card1 pick(int index) {

        return cardArr[index];
    }

    Card1 pick() {

        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }
    void shuffle() {

        for (int i = 0; i < cardArr.length; ++i) {
            int r = (int) (Math.random() * CARD_NUM);
            Card1 tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }
}

class Card1 {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int num;

    Card1() {

        this(SPADE, 1);
    }
    Card1(int kind, int num) {

        this.kind = kind;
        this.num = num;
    }
    public String toString() {

        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return "kind : " + kinds[kind] + " num : " + numbers.charAt(num);
    }
}