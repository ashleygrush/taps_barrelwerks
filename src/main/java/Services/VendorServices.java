package Services;

import Mapper.VendorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServices {

    @Autowired
    VendorMapper mapper;

}
