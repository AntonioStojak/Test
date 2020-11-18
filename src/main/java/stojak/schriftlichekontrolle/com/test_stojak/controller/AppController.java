package stojak.schriftlichekontrolle.com.test_stojak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stojak.schriftlichekontrolle.com.test_stojak.model.Kunde;
import stojak.schriftlichekontrolle.com.test_stojak.model.Rechnung;
import stojak.schriftlichekontrolle.com.test_stojak.service.KundenService;
import stojak.schriftlichekontrolle.com.test_stojak.service.RechnungService;

import java.awt.*;
import java.util.List;

@RestController
public class AppController {

    private final KundenService service;
    private final RechnungService servicekunde;


    @Autowired
    public AppController(KundenService service, RechnungService servicekunde) {
        this.service = service;
        this.servicekunde = servicekunde;
    }

    @GetMapping("/Kunden")
    public List<Kunde> zeigtalleKunden()
    {
        return service.listKunde();
    }

    @GetMapping("/{id}")
    public Kunde kundeById(@PathVariable(name = "id") Kunde test)
    {
        return test;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteKunde(@PathVariable(name = "id") Kunde test) {
        service.delete(test);
        return new ResponseEntity<>("Kunde geloescht", HttpStatus.OK);
    }

    @RequestMapping(value = "/kunde/save", method = RequestMethod.POST)
    public String saveKunde(@ModelAttribute("kunde") Kunde kunde) {
        service.saveKunde(kunde);
        return null;
    }

    @RequestMapping(value = "/rechnung/save", method = RequestMethod.POST)
    public String saveBuch(@ModelAttribute("rechnung") Rechnung rechnung)
    {
        servicekunde.saveRechnung(rechnung);
        return null;
    }

    @PutMapping(path = "/editkunde", consumes = "application/json", produces = "application/json")
    public String editKunde(@RequestBody Kunde kunde)
    {
        Long id = kunde.getId();
        service.editKunde(id, kunde);

        return "Kunde geaendert";
    }

    @PutMapping(path = "/editRechnung", consumes = "application/json", produces = "application/json")
    public String editRechnung(@RequestBody Rechnung rechnung)
    {
        Long id = rechnung.getId();
        servicekunde.editRechnung(id, rechnung);

        return "Rechnung geaendert";
    }
}

