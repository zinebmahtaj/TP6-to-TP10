package cigma.pfe.repositories;
import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static javax.persistence.Persistence.createEntityManagerFactory;

@Repository
public class ClientRepositoryImpl implements ClientRepository {
    @PersistenceContext
    private EntityManager entitymanager;

    @Override
    public Client save(Client p) {
        entitymanager.persist(p);
        return p;
    }

    @Override
    public Client update(Client c) {
        return null;
    }

    public void ClientDaoImpl() {
        System.out.println("creation bean dao");
    }
}