package generic2;

public class Auto implements Identificable<String> {

    private String patente;

    public Auto(String patente) {
        this.patente = patente;
    }

    @Override
    public void setId(String id) {
        this.patente = id;
    }

    @Override
    public String getID() {
        return this.patente;
    }

}
