package cigma.pfe.models;

@javax.persistence.Entity(name = "TClients")
public class Client {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    @javax.persistence.Column
    private java.lang.String name;

    public Client(java.lang.String name) { /* compiled code */ }

    public Client() { /* compiled code */ }

    public  java.lang.String toString(){ /* compiled code */
        return null;
    }
}
