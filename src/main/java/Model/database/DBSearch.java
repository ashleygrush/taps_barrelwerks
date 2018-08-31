package Model.database;

public class DBSearch {

    private int id;
    private Beers beers;
    private Vendors vendors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Beers getBeers() {
        return beers;
    }

    public void setBeers(Beers beers) {
        this.beers = beers;
    }

    public Vendors getVendors() {
        return vendors;
    }

    public void setVendors(Vendors vendors) {
        this.vendors = vendors;
    }
}
