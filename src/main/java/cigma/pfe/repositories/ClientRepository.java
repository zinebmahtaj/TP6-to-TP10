package cigma.pfe.repositories;
import cigma.pfe.models.Client;

public interface ClientRepository {
    Client save(Client c);

    Client update(Client c);
}
