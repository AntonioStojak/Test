package stojak.schriftlichekontrolle.com.test_stojak;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import stojak.schriftlichekontrolle.com.test_stojak.repository.Rechnungrepository;

@SpringBootApplication
public class TestStojakApplication {

	private static ConfigurableBootstrapContext ConfigureableApplicationContext;

	public static void main(String[] args)
	{
		SpringApplication.run(TestStojakApplication.class, args);
	}

}
