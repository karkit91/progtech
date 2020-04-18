package ora;

public abstract class Allat extends Eloleny {

    private String anyagcsereHelyszine = "Udvar";

    @Override
    public void anyagcsere() {
        System.out.println("Megtortent az anyagcsere:" + anyagcsereHelyszine);
    }

}
