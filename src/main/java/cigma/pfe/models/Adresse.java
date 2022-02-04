package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String avenue;
    private String ville;
    private String pays;

    @OneToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    public Adresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse(String avenue, String ville, String pays, Adresse adresse) {
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;
        this.adresse = adresse;
    }

    @OneToMany
    @JoinColumn(name= "adresse_id")
    private Adresse adresse;
}
