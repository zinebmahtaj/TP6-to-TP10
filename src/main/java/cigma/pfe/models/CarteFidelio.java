package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class CarteFidelio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
    public CarteFidelio(String code) {
        this.code = code;
    }

    public void setClient(Client client) {
    }
}
