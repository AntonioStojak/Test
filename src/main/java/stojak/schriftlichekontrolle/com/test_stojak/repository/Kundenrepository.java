package stojak.schriftlichekontrolle.com.test_stojak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;
import stojak.schriftlichekontrolle.com.test_stojak.model.Kunde;

import java.util.List;

@Repository
public interface Kundenrepository extends JpaRepository<Kunde, Long>
{
    List<Kunde> findAll();
}
