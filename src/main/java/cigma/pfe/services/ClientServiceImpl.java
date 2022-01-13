package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{
    ClientRepository clientRepository = new ClientRepositoryImpl();
    //@override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }
    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }
}
