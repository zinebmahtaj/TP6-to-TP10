package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController {
    private ClientService service ;
    @Autowired

    public ClientController(ClientService service) {
        this.service = service;
        System.out.println("creation bean controller");
    }

    public void save(Client c) {
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
}