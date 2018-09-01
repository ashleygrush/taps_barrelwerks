package Services;

import Mapper.VendorMapper;
import Model.database.DBSearch;
import Model.database.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VendorServices {

    @Autowired
    VendorMapper mapper;


    // GET - all
    public List<Vendors> findAllVendors() {
        return mapper.listAllVendors();
    }

    // GET - find by ID
    public DBSearch findByID(int id) {

        DBSearch searchID = new DBSearch();

        searchID.setId(id);

        searchID.setVendors(mapper.findByID(id));

        return searchID;
    }


    // POST - create
    public Vendors createVendor(Vendors data) {

        Vendors newVendor = new Vendors();

        newVendor.setVendor_name(data.getVendor_name());
        newVendor.setContact_name(data.getContact_name());
        newVendor.setEmail(data.getEmail());
        newVendor.setPhone(data.getPhone());
        newVendor.setLocation(data.getLocation());

        try {
            mapper.createVendor(newVendor);
        } catch (Exception e) {
            System.out.println("Merchant already exists. Please log in : " + data.getEmail());
        }

        return newVendor;
    }

    // DELETE - delete
    public DBSearch deleteByID(int id) {

        DBSearch removeID = new DBSearch();

        if (removeID.getId() == id) ;
        {
            removeID.setId(mapper.deleteByID(id));
        }
        return removeID;
    }

    // PUT - update by ID
    public Vendors updateByID(int id, Vendors data) {

        Vendors updateVendor = new Vendors();

        updateVendor.setVendor_name(data.getVendor_name());
        updateVendor.setContact_name(data.getContact_name());
        updateVendor.setEmail(data.getEmail());
        updateVendor.setPhone(data.getPhone());
        updateVendor.setLocation(data.getLocation());
        updateVendor.setId(id);

        mapper.updateByID(updateVendor);

        return updateVendor;
    }

}
