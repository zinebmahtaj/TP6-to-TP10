package cigma.pfe.models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column
    public String name;
    private List<Facture> factures;

    public Client(String name){
        this.name=name;
    }
    public Client(long id,String name){
        this.id=id;
        this.name=name;
    }
    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Client(){
    }

    @OneToMany(cascade={CascadeType.PERSIST},mappedBy = "client")
    public List<Facture> getFactures(){
        return factures;
    }
    public void setFactures(List<Facture>factures){
        this.factures=factures;
    }
    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",joinColumns =
    @JoinColumn(name = "client_fk", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_fk",
                    referencedColumnName = "id"))
    private List<Promotion> promotions;

    public List<Promotion> getPromotions(){
        return promotions;
    }
    public void setPromotions(List<Promotion> Promotions){
        this.promotions=promotions;
    }

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;

    public void setCarteFidelio(CarteFidelio carteFidelio){
        this.carteFidelio=carteFidelio;
    }
        public CarteFidelio getCarteFidelio(){
        return carteFidelio;
        }
    }

    /*
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private Adresse adresse;
    */
