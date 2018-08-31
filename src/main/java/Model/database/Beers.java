package Model.database;

public class Beers {

private int id;
private String beer_name;
private String beer_style;
private int beer_abv;
private String beer_description;
private int beer_ibu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeer_name() {
        return beer_name;
    }

    public void setBeer_name(String beer_name) {
        this.beer_name = beer_name;
    }

    public String getBeer_style() {
        return beer_style;
    }

    public void setBeer_style(String beer_style) {
        this.beer_style = beer_style;
    }

    public int getBeer_abv() {
        return beer_abv;
    }

    public void setBeer_abv(int beer_abv) {
        this.beer_abv = beer_abv;
    }

    public String getBeer_description() {
        return beer_description;
    }

    public void setBeer_description(String beer_description) {
        this.beer_description = beer_description;
    }

    public int getBeer_ibu() {
        return beer_ibu;
    }

    public void setBeer_ibu(int beer_ibu) {
        this.beer_ibu = beer_ibu;
    }
}
