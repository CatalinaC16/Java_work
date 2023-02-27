public class Produs {

    private int ID;

    private String nume;

    private String producator;

    private double pret;

    private int garantie;

    private Tip type;


    public Produs(int ID, String nume, String producator, double pret,int garantie, Tip type) {
        this.ID = ID;
        this.nume = nume;
        this.producator = producator;
        this.pret = pret;
        this.garantie=garantie;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "ID=" + ID +
                ", nume='" + nume + '\'' +
                ", producator='" + producator + '\'' +
                ", pret=" + pret +
                ", type=" + type +
                '}';
    }

    public int getGarantie() {
        return garantie;
    }

    public int getID() {
        return ID;
    }

    public String getNume() {
        return nume;
    }

    public String getProducator() {
        return producator;
    }

    public double getPret() {
        return pret;
    }

    public Tip getType() {
        return type;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setType(Tip type) {
        this.type = type;
    }
}
