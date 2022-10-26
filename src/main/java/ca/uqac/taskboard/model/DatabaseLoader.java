package ca.uqac.taskboard.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final DeveloperRepository repository;

	@Autowired
	public DatabaseLoader(DeveloperRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception { 
		this.repository.save(new Developer("Danuza", "Pacheco"));
    this.repository.save(new Developer("Sylvain", "Halle"));
    this.repository.save(new Developer("Bob", "Menelas"));
	}
}