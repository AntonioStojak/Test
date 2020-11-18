package stojak.schriftlichekontrolle.com.test_stojak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stojak.schriftlichekontrolle.com.test_stojak.model.Kunde;
import stojak.schriftlichekontrolle.com.test_stojak.repository.Kundenrepository;

import java.util.List;
import java.util.Optional;

@Service
public class KundenService {

    @Autowired
    private Kundenrepository repo;

    KundenService()
    {

    }

    public List<Kunde> listKunde() {
        return repo.findAll();
    }

    public void delete(Kunde kunde) {
        repo.delete(kunde);
    }

    public void saveKunde(Kunde kunde) {
        repo.save(kunde);
    }

    public void editKunde(Long id, Kunde kunde) {
        Optional<Kunde> k1 = repo.findById(id);
        Kunde k2 = k1.get();
        k2.setVorname(kunde.getVorname());
        repo.save(k2);
    }

}
