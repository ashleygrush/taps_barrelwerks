package Controller;

import Services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VendorController {

    @Autowired
    VendorServices services;


}
