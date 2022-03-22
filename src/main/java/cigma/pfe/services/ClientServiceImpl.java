package cigma.pfe.services;

import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;


    @Override
    public Client save(Client clt) {
        return clientRepository.save(clt);
    }

    @Override
    public Client modify(Client clt) {

     Client   oldClient = clientRepository.findById(clt.getId()).get();

     oldClient.setName(clt.getName());
        return clientRepository.save(oldClient);
    }

    @Override
    @Transactional
    public void remove(long idClt) {
        clientRepository.deleteById(idClt);
    }

    @Override
    public Client getOne(long idClt) {
        return clientRepository.findById(idClt).get();
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) clientRepository.findAll();
    }

    public  List<Client> Find(String clt){
        return clientRepository.findByName(clt);
    }
}