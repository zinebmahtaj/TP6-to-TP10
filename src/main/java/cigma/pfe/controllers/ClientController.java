package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;
public class ClientController {
    private ClientService service ;

    public ClientController(ClientService service) {
        this.service = service;
    }

    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
}