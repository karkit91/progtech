package ora;

public class Ember extends Eloleny  {

    private String anyagcsereHelyszine = "Mosdó";

    @Override
    public void anyagcsere() {
        System.out.println("Megtortent az anyagcsere:" + anyagcsereHelyszine);
    }

    @Override
    public void hangKiadas() {
        System.out.println("Beszel");
    }
}
