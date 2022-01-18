package cigma.pfe.repositories;
import cigma.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class ClientRepositoryImpl implements ClientRepository{
    EntityManagerFactory emf= createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();
    public ClientRepositoryImpl() {
    } @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return c;

    }

    @Override
    public Client update(Client c) {
        return null;
    }
}
