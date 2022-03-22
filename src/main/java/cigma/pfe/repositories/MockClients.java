package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockClients implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MockClients.class);
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public void run(String... args) throws Exception {
        Client c1 = new Client("Zineb");
        Client c2 = new Client("Rania");
        Client c3 = new Client("Mohamed");
        Client c4 = new Client("Hasnaa");
        clientRepository.save(c1);
        clientRepository.save(c2);
        clientRepository.save(c3);
        clientRepository.save(c4);
        clientRepository.findAll().forEach(c -> System.out.println (c));
    }
}

