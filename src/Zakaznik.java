public class Zakaznik {
    String jmeno;
    int pocetProdeju;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

    public Zakaznik(String jmeno) {
        this.jmeno = jmeno;
    }

    public Zakaznik(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }
}
