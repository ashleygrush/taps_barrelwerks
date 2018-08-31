package Model.database;

public class Beer_Prices {

    private int id;
    private int beer_id;
    private int bottle_id;
    private int keg_5gal_id;
    private int keg_10gal_id;
    private int keg_15gal_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBeer_id() {
        return beer_id;
    }

    public void setBeer_id(int beer_id) {
        this.beer_id = beer_id;
    }

    public int getBottle_id() {
        return bottle_id;
    }

    public void setBottle_id(int bottle_id) {
        this.bottle_id = bottle_id;
    }

    public int getKeg_5gal_id() {
        return keg_5gal_id;
    }

    public void setKeg_5gal_id(int keg_5gal_id) {
        this.keg_5gal_id = keg_5gal_id;
    }

    public int getKeg_10gal_id() {
        return keg_10gal_id;
    }

    public void setKeg_10gal_id(int keg_10gal_id) {
        this.keg_10gal_id = keg_10gal_id;
    }

    public int getKeg_15gal_id() {
        return keg_15gal_id;
    }

    public void setKeg_15gal_id(int keg_15gal_id) {
        this.keg_15gal_id = keg_15gal_id;
    }
}
