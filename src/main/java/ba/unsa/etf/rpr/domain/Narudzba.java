package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Narudzba {
    private int id;
    private int cijena;
    private int ukupnaCijena;
    private Korisnik korisnik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public int getUkupnaCijena() {
        return ukupnaCijena;
    }

    public void setUkupnaCijena(int ukupnaCijena) {
        this.ukupnaCijena = ukupnaCijena;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public String toString() {
        return "Narudzba{" +
                "id=" + id +
                ", cijena=" + cijena +
                ", ukupnaCijena=" + ukupnaCijena +
                ", korisnik=" + korisnik +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Narudzba narudzba = (Narudzba) o;
        return id == narudzba.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cijena, ukupnaCijena, korisnik);
    }
}
