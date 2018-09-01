package Mapper;

import Model.database.Vendors;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VendorMapper {

    // list of all Vendors
    String LIST_ALL_VENDORS= "Select id, vendor_name, contact_name, email, phone, location from taps_barrelwerks.vendors";

    // find by ID
    String FIND_BY_ID = "Select * from taps_barrelwerks.vendors where id = #{id}";

    // creates new Vendor
    String CREATE_VENDOR = "Insert into taps_barrelwerks.vendors " +
            "(vendor_name, contact_name, email. phone, location) " +
            "VALUES (#{vendor_name}, #{contact_name}, #{email}), #{phone}, #{location}";

    // delete's by ID
    String DELETE_BY_ID = "Delete from taps_barrelwerks.vendors where id = #{id}";

    // update by ID
    String UPDATE_BY_ID = "UPDATE taps_barrelwerks.vendors " +
            "SET vendor_name = #{vendor_name}, "  +
            "contact_name = #{contact_name}, " +
            "phone = #{phone}, " +
            "email = #{email}, " +
            "location = #{location} " +
            "WHERE id = #{id}";


    // returns list of all Vendors
    @Select(LIST_ALL_VENDORS)
    List<Vendors> listAllVendors();

    // finds by ID number
    @Select(FIND_BY_ID)
    Vendors findByID(int id);

    // creates new vendor
    @Insert(CREATE_VENDOR)
    int createVendor(Vendors vendors);

    // delete by id
    @Delete(DELETE_BY_ID)
    int deleteByID(int id);

    // update by ID
    @Insert(UPDATE_BY_ID)
    int updateByID(Vendors vendors);


}
