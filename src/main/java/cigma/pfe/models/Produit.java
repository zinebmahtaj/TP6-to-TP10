package cigma.pfe.models;

import javax.persistence.*;
@Entity(name="TProduit")
public class Produit {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double price;

    public Produit(){
    }

    public String getName(){
        return name;
    }
    public void setPrice(double price){
        this.price=price;
    }

    @Override
    public String toString(){
        return "Produit{" +
                "id=" + id +
                ", name='" + name +'\'' +
                ", price=" + price +
                '}';
    }
    /*
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "produit")
    private Facture facture;
     */
}


