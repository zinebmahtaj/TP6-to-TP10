package cigma.pfe.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TClients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public Client(String name) {
        this.name = name;
    } public Client(int i, String new_name) {
    } @
            Column
    private String name;
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
