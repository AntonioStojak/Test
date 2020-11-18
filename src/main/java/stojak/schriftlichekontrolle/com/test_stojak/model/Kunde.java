package stojak.schriftlichekontrolle.com.test_stojak.model;


import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Kunde
{

    public Kunde() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vorname;
    private String nachname;


    @OneToMany(
            mappedBy = "kunde",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )


    private List<Rechnung> rechnungen = new ArrayList<>();

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getVorname()
    {
        return vorname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public List<Rechnung> getRechnungen()
    {
        return rechnungen;
    }

    public void setRechnungen(List<Rechnung> rechnungen)
    {
        this.rechnungen = rechnungen;
    }
}

