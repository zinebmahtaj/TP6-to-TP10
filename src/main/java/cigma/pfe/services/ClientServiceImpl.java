package cigma.pfe.services;

import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.models.Client;
public class ClientServiceImpl implements ClientService {
    private ClientRepository dao;

    public ClientServiceImpl(ClientRepository dao) {
        this.dao = dao;

    }

    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
}
