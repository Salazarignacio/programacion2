package generics;

public enum PaisSudamericano {
    ARGENTINA, BRASIL, COLOMBIA, CHILE, URUGUAY, ECUADOR, BOLIVIA,
    PERU, VENEZUELA, PARAGUAY;

    private PaisSudamericano() {

    }

    @Override
    public String toString() {
        return "PaisSudamericano{" + "ordinal=" + ordinal() + ", name=" + name() + '}';
    }

}
