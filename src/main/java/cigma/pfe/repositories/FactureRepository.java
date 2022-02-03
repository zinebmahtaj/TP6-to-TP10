package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

import java.util.List;

public interface FactureRepository {
    Facture create(Facture f);
    List <Facture> read();
    void deleteFactureByid(long id);
    Facture update (Facture f);
}
