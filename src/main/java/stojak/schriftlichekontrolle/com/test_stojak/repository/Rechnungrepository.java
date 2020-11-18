package stojak.schriftlichekontrolle.com.test_stojak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stojak.schriftlichekontrolle.com.test_stojak.model.Rechnung;

@Repository

public interface Rechnungrepository extends JpaRepository<Rechnung, Long>
{

}
