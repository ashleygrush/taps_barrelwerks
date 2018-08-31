package Model.database;

public class Beer_Inventory {

    // needs date_created & date_delivered
    private int id;
    private int vendor_id;
    private boolean payment_received;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public boolean isPayment_received() {
        return payment_received;
    }

    public void setPayment_received(boolean payment_received) {
        this.payment_received = payment_received;
    }
}
