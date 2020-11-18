package stojak.schriftlichekontrolle.com.test_stojak.model;

import javax.persistence.*;

@Entity
@Table(name = "Rechnung")
public class Rechnung{

    public Rechnung()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int rechnungsnummer;
    private String datum;
    private String rechnungsbetrag;
    @ManyToOne
    @JoinColumn(name = "kunden_id")
    private Kunde kun;

    public Rechnung(int rechnungsnummer, String kunde, String datum, String rechnungsbetrag, Kunde kunden)
    {
        this.rechnungsnummer = rechnungsnummer;
        this.datum = datum;
        this.rechnungsbetrag = rechnungsbetrag;
        this.kun = kunden;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRechnungsnummer() {
        return rechnungsnummer;
    }

    public void setRechnungsnummer(int rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getRechnungsbetrag() {
        return rechnungsbetrag;
    }

    public void setRechnungsbetrag(String rechnungsbetrag) {
        this.rechnungsbetrag = rechnungsbetrag;
    }

    public Kunde getKun() {
        return kun;
    }

    public void setKun(Kunde kun) {
        this.kun = kun;
    }
}
