package Controller;

import Model.database.DBSearch;
import Model.database.Vendors;
import Services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Vendors")
public class VendorController {

    @Autowired
    VendorServices services;


    // calls DB for all Vendors
    @GetMapping("/all")
    public List<Vendors> listAllVedors(){
        return services.findAllVendors();
    }

    // finds by ID
    @RequestMapping("/{id}")
    public DBSearch findByID(@PathVariable("id") int id) {
        return services.findByID(id);
    }

    // creates new Vendor
    @PostMapping
    public Vendors createVendor(@RequestBody Vendors vendors) {
        return services.createVendor(vendors);
    }

    //delete by ID
    @DeleteMapping("/{id}")
    public DBSearch deleteByID(@PathVariable("id") int id) {
        return services.deleteByID(id);
    }

    // update by ID
    @PutMapping("/{id}")
    public Vendors updateByID(@PathVariable("id") int id,
                                @RequestBody Vendors vendors) {
        return services.updateByID(id, vendors);
    }


}
