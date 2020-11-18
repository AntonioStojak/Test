package stojak.schriftlichekontrolle.com.test_stojak.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stojak.schriftlichekontrolle.com.test_stojak.model.Rechnung;
import stojak.schriftlichekontrolle.com.test_stojak.repository.Rechnungrepository;

import java.util.List;
import java.util.Optional;

@Service
public class RechnungService {

    @Autowired
    private Rechnungrepository repo;

    public List<Rechnung> listRechnung() {
        return repo.findAll();
    }

    public void deleteRechnung(Rechnung rechnung) {
        repo.delete(rechnung);
    }

    public void saveRechnung(Rechnung rechnung) {
        repo.save(rechnung);
    }

    public void editRechnung(Long id, Rechnung rechnung) {
        Optional<Rechnung> r1 = repo.findById(id);
        Rechnung r2 = r1.get();
        r2.setRechnungsnummer(rechnung.getRechnungsnummer());
        repo.save(r2);
    }

}
