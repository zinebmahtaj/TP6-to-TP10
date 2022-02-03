package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.FactureRepository;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.models.Facture;

import java.util.List;

public class FactureServiceImpl implements FactureService {
    FactureRepository factureRepository;

    @Override
    public Facture create(Facture f) {
        return factureRepository.create(f);
    }

    @Override
    public List<Facture> read() {
        return factureRepository.read();
    }

    @Override
    public void delete(long id) {
        factureRepository.deleteFactureByid(id);

    }

    @Override
    public Facture update(Facture f) {
        return factureRepository.update(f);
    }
}
