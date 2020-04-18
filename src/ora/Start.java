package ora;

public class Start {
    public static void main(String[] args) {
        Kutya bodri = new Kutya();
        Ember sanyi = new Ember();


        bodri.hangKiadas();
        sanyi.hangKiadas();

        bodri.anyagcsere();
        sanyi.anyagcsere();

    }
}
